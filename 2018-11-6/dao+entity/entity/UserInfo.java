package com.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 用户信息的javabean
 * @author HYZ
 *
 */
public class UserInfo implements Serializable{

	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 用户ID
	 */
	private long user_id;
	/**
	 * 用户名
	 */
	private String user_name;
	/**
	 * 用户密码
	 */
	private String user_pwd;
	/**
	 * 用户邮箱
	 */
	private String user_email;
	/**
	 * 用户地址
	 */
	private String user_addr;
	/**
	 * 用户性别
	 */
	private String user_sex;
	/**
	 * 用户生日
	 */
	private Date user_bir;
	/**
	 * 用户类型
	 */
	private long user_type;
	/**
	 * 用户金币数量
	 */
	private long user_coin;
	/**
	 * 用户头像
	 */
	private String user_head;
	public UserInfo(){}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_addr() {
		return user_addr;
	}

	public void setUser_addr(String user_addr) {
		this.user_addr = user_addr;
	}

	public String getUser_sex() {
		return user_sex;
	}

	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}

	public Date getUser_bir() {
		return user_bir;
	}

	public void setUser_bir(Date user_bir) {
		this.user_bir = user_bir;
	}

	public long getUser_type() {
		return user_type;
	}

	public void setUser_type(long user_type) {
		this.user_type = user_type;
	}

	public long getUser_coin() {
		return user_coin;
	}

	public void setUser_coin(long user_coin) {
		this.user_coin = user_coin;
	}

	public String getUser_head() {
		return user_head;
	}

	public void setUser_head(String user_head) {
		this.user_head = user_head;
	}

	@Override
	public String toString() {
		return "UserInfo [user_id=" + user_id + ", user_name=" + user_name + ", user_pwd=" + user_pwd + ", user_email="
				+ user_email + ", user_addr=" + user_addr + ", user_sex=" + user_sex + ", user_bir=" + user_bir
				+ ", user_type=" + user_type + ", user_coin=" + user_coin + ", user_head=" + user_head + "]";
	}

	
}
