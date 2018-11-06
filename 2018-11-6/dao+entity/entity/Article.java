package com.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 文章的javabean
 * @author HYZ
 *
 */
public class Article implements Serializable{

	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 文章ID
	 */
	private long article_id;
	/**
	 * 文章标题
	 */
	private String article_title;
	/**
	 * 文章内容
	 */
	private String article_content;
	/**
	 * 文章是否可见
	 */
	private boolean article_visible;
	/**
	 * 文章附带文件路径
	 */
	private String article_file;
	/**
	 * 文章对应用户ID
	 */
	private long user_id;
	/**
	 * 文章对应用户名
	 */
	private String user_name;
	/**
	 * 文章标签
	 */
	private String article_tag;
	/**
	 * 发布日期
	 */
	private Date article_date;
	/**
	 * 用户头像
	 */
	private String user_head;
	
	public Article() { }

	public long getArticle_id() {
		return article_id;
	}

	public void setArticle_id(long article_id) {
		this.article_id = article_id;
	}

	public String getArticle_title() {
		return article_title;
	}

	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}

	public String getArticle_content() {
		return article_content;
	}

	public void setArticle_content(String article_content) {
		this.article_content = article_content;
	}

	public boolean isArticle_visible() {
		return article_visible;
	}

	public void setArticle_visible(boolean article_visible) {
		this.article_visible = article_visible;
	}

	public String getArticle_file() {
		return article_file;
	}

	public void setArticle_file(String article_file) {
		this.article_file = article_file;
	}

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
	
	public String getArticle_tag() {
		return article_tag;
	}

	public void setArticle_tag(String article_tag) {
		this.article_tag = article_tag;
	}

	public Date getArticle_date() {
		return article_date;
	}

	public void setArticle_date(Date article_date) {
		this.article_date = article_date;
	}

	public String getUser_head() {
		return user_head;
	}

	public void setUser_head(String user_head) {
		this.user_head = user_head;
	}

	@Override
	public String toString() {
		return "Article [article_id=" + article_id + ", article_title=" + article_title + ", article_content="
				+ article_content + ", article_visible=" + article_visible + ", article_file=" + article_file
				+ ", user_id=" + user_id + ", user_name=" + user_name + ", article_tag=" + article_tag
				+ ", article_date=" + article_date + ", user_head=" + user_head + "]";
	}

	

}
