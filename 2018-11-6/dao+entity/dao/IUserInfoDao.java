package com.dao;

import java.util.List;

import com.entity.UserInfo;

public interface IUserInfoDao {
	/**
	 * 添加用户
	 * @param userInfo 用户对象
	 * @return
	 */
	int insertUser(UserInfo userInfo);
	/**
	 * 更改用户信息
	 * @param userInfo 用户对象
	 * @return 受影响行数
	 */
	int updateUser(UserInfo userInfo);
	/**
	 * 根据用户id查找用户
	 * @param user_id 用户id
	 * @return 受影响行数
	 */
	UserInfo queryUserById(int user_id);
	/**
	 * 根据关注者id查找用户
	 * @param user_id 用户id
	 * @return 用户对象
	 */
	List<UserInfo> queryUserByFollow(int user_id);
	/**
	 * 根据粉丝id查找用户
	 * @param user_id 用户id
	 * @return 用户对象列表
	 */
	List<UserInfo> queryUserByFans(int user_id);
	/**
	 * 根据用户名查找用户
	 * @param keyWord 关键词
	 * @return 用户对象列表
	 */
	List<UserInfo> queryUserByKeyWord(String keyWord);
	/**
	 * 根据用户名密码查找，用于登陆
	 * @param user_name 用户名
	 * @param user_pwd 密码
	 * @return 用户对象
	 */
	UserInfo queryUserByLogin(String user_name,String user_pwd);
}
