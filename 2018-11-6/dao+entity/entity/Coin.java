package com.entity;

import java.util.Date;

public class Coin {
	/**
	 * 金币交易详情编号
	 */
	private long coin_id;
	/**
	 * 用户id
	 */
	private long user_id;
	/**
	 * 下载文件id
	 */
	private long file_id;
	/**
	 * 交易金币数量
	 */
	private long coin_number;
	/**
	 * 交易时间
	 */
	private Date coin_date;
	public Coin() { }
	public long getCoin_id() {
		return coin_id;
	}
	public void setCoin_id(long coin_id) {
		this.coin_id = coin_id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public long getFile_id() {
		return file_id;
	}
	public void setFile_id(long file_id) {
		this.file_id = file_id;
	}
	public long getCoin_number() {
		return coin_number;
	}
	public void setCoin_number(long coin_number) {
		this.coin_number = coin_number;
	}
	public Date getCoin_date() {
		return coin_date;
	}
	public void setCoin_date(Date coin_date) {
		this.coin_date = coin_date;
	}
	@Override
	public String toString() {
		return "Coin [coin_id=" + coin_id + ", user_id=" + user_id + ", file_id=" + file_id + ", coin_number="
				+ coin_number + ", coin_date=" + coin_date + "]";
	}
	
}
