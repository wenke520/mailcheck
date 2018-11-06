package com.dao.impl;


import com.dao.ICoinDao;
import com.dao.IFileDao;
import com.entity.Files;
import com.util.DButil;
/**
 * 与上传 下载文件相关的dao层
 * @author HYZ
 *
 */
public class FileDaoImpl implements IFileDao{
	ICoinDao coinDao = new CoinDaoImpl();
	@Override
	public String downloadFile(Files file,long user_id) {
		int result = coinDao.downloadFile(file, user_id);
		if(result >0) return file.getFile_src();
		
		return "";
	}

	@Override
	public int uploadFile(Files file) {
		String sql = "insert into files (file_id,file_title,file_src,file_coin)"
				+ " values (file_di_seq.nextval,?,?,?)";
		return DButil.update(sql,file.getFile_title(),file.getFile_src(),file.getFile_coin()+"");
	}

}
