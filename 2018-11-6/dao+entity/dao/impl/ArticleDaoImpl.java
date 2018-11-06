package com.dao.impl;

import java.util.List;

import com.dao.IArticleDao;
import com.entity.Article;
import com.util.DButil;

public class ArticleDaoImpl implements IArticleDao {
	/*ARTICLE_ID      NUMBER                                   
	ARTICLE_TITLE   VARCHAR2(100)  Y                         
	ARTICLE_CONTENT VARCHAR2(4000) Y                         
	ARTICLE_VISIBLE VARCHAR2(5)    Y                         
	ARTICLE_FILE    VARCHAR2(300)  Y                         
	USER_ID         NUMBER         Y                         
	ARTICLE_TAG     VARCHAR2(30)   Y                         
	ARTICLE_DATE    DATE           Y      */
	@Override
	public int insertArticle(Article article) {
		String sql = "insert into article (article_title,article_content,article_file,user_id,article_tag)"
				+ " values (?,?,?,?,?)";
		return DButil.update(sql,
				article.getArticle_title(),article.getArticle_content(),article.getArticle_file(),article.getUser_id()+"",article.getArticle_tag());
	}

	@Override
	public int updateArticle(Article article) {
		String sql = "update article set article_title=?,article_content=?,article_file=?,article_tag=?"
				+ " where article_id=?";
		return DButil.update(sql,
				article.getArticle_title(),article.getArticle_content(),article.getArticle_file(),article.getArticle_tag(),article.getArticle_id()+"");
	}

	@Override
	public Article queryArticleById(int article_id) {
		String sql = "select *,u.user_name,u.user_head from article a,userinfo u where article_id=? and a.user_id=u.user_id";
		return DButil.queryById(sql, Article.class, article_id);
	}

	@Override
	public List<Article> queryArticleByKeyWord(String keyWord) {
		String sql = "select *,u.user_name,u.user_head from article a,userinfo u where article_title like '%?%' and a.user_id=u.user_id order by article_date desc";
		return DButil.queryByKeyWord(sql, Article.class, keyWord);
	}

	@Override
	public List<Article> queryArticleByUserId(long user_id) {
		String sql = "select *,u.user_name,u.user_head from article a,userinfo u where a.user_id=?and a.user_id=u.user_id order by article_date desc";
		return DButil.queryByUserId(sql, Article.class, user_id);
	}

	@Override
	public List<Article> queryArticleByUserName(String user_name) {
		String sql = "select * from article a,userinfo u where a.user_id=u.user_id and user_name like '%?%' order by article_date desc";
		return DButil.queryByKeyWord(sql, Article.class, user_name);
	}

}
