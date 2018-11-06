package com.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import com.dao.ICoinDao;
import com.entity.Coin;
import com.entity.Files;
import com.util.DButil;

public class CoinDaoImpl implements ICoinDao {

	@Override
	public List<Coin> queryCoinByUserId(long user_id) {
		String sql = "select * from article where user_id=? order by coin_date desc";
		return DButil.queryByUserId(sql, Coin.class, user_id);
	}

	@Override
	public int downloadFile(Files file,long user_id) {
		Connection conn = DButil.getConn();
		try {
			conn.setAutoCommit(false);
			QueryRunner qr = new QueryRunner();
			//先扣钱
			double coin = file.getFile_coin();//应付款总金额
			String sql = "update userinfo set user_coin = user_coin - ? where user_id=?";
			int um = qr.execute(sql, coin,user_id);
			if(um == 0){
				conn.rollback();//如果有异常先回滚
				return -1;
			}
			
			int i = qr.execute("insert into coin (coin_id,user_id,file_id,coin_number) values"
					+ " (coin_id_seq.nextval,?,?,?)", user_id,file.getFile_id(),coin);
			if(i>0){
				conn.commit();//如果都成功的话  就提交数据库
				conn.close();
				return 1;
			}else{
				conn.rollback();//如果有异常先回滚
				return -1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return -1;
	}

	
}
