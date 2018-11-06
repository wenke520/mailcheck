package com.dao.impl;

import java.util.List;

import com.dao.IUserInfoDao;
import com.entity.UserInfo;
import com.util.DButil;
/**
 * 用户信息dao实现类
 * @author HYZ
 *
 */
public class UserInfoDaoImpl implements IUserInfoDao {
/*	USER_ID    NUMBER                                 
	USER_NAME  VARCHAR2(30) Y                         
	USER_PWD   VARCHAR2(30) Y                         
	USER_EMAIL VARCHAR2(30) Y                         
	USER_ADDR  VARCHAR2(50) Y        '北京'                
	USER_SEX   VARCHAR2(3)  Y        '男'                 
	USER_BIR   DATE         Y        sysdate          
	USER_TYPE  NUMBER       Y        2                
	USER_COIN  NUMBER       Y      */ 
	@Override
	public int insertUser(UserInfo userInfo) {
		String sql = "insert into userinfo (user_id,user_name,user_pwd,user_email,user_head)"
				+ " values (user_id_seq.nextval,?,?,?,?)";
		return DButil.update(sql, userInfo.getUser_name(),userInfo.getUser_pwd(),userInfo.getUser_email(),userInfo.getUser_head());
	}
	/**
	 * 需修改，该方法需先获取数据库已填写信息
	 * 
	 **/
	@Override
	public int updateUser(UserInfo userInfo) {
		String sql = "update userinfo set user_name=?,user_pwd=?,user_email=?,user_addr=?,user_sex=?,user_bir=?,user_head=?"
				+ " where user_id=?";
		return DButil.update(sql, userInfo.getUser_name(),userInfo.getUser_pwd(),userInfo.getUser_email(),
								userInfo.getUser_addr(),userInfo.getUser_sex(),userInfo.getUser_bir()+"",userInfo.getUser_head(),userInfo.getUser_id()+"");
	}

	@Override
	public UserInfo queryUserById(int user_id) {
		String sql = "select * from userinfo where user_id =?";
		return DButil.queryById(sql, UserInfo.class, user_id);
	}

	@Override
	public List<UserInfo> queryUserByFollow(int user_id) {
		String sql = "select u.* from userinfo u,relationship r  where r.follow_id = ? and r.fans_id=u.user_id order by u.user_id desc";
		return DButil.queryByUserId(sql, UserInfo.class, user_id);
	}

	@Override
	public List<UserInfo> queryUserByFans(int user_id) {
		String sql = "select u.* from userinfo u,relationship r  where r.fans_id = ? and r.relationship_id=u.user_id by u.user_id desc";
		return DButil.queryByUserId(sql, UserInfo.class, user_id);
	}

	@Override
	public List<UserInfo> queryUserByKeyWord(String keyWord) {
		String sql = "select * from userinfo where user_name like '%?%' by user_id desc";
		return DButil.queryByKeyWord(sql, UserInfo.class, keyWord);
	}

	@Override
	public UserInfo queryUserByLogin(String user_name, String user_pwd) {
		String sql = "select * from userinfo where user_name=? and user_pwd=? by user_id desc ";
		return DButil.queryByLogin(sql, UserInfo.class, user_name,user_pwd);
	}

}
