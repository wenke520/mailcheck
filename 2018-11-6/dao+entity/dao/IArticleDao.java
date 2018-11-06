package com.dao;

import java.util.List;

import com.entity.Article;

public interface IArticleDao {
	/**
	 * 添加文章
	 * @param Article 文章对象
	 * @return
	 */
	int insertArticle(Article article);
	/**
	 * 更改文章
	 * @param Article 文章对象
	 * @return 受影响行数
	 */
	int updateArticle(Article article);
	/**
	 * 根据文章id查找文章
	 * @param article_id 文章id
	 * @return 受影响行数
	 */
	Article queryArticleById(int article_id);
	/**
	 * 根据关键词模糊查找文章
	 * @param keyWord 关键词
	 * @return 文章对象列表
	 */
	List<Article> queryArticleByKeyWord(String keyWord);
	/**
	 * 根据用户id查找文章
	 * @param user_id
	 * @return 文章对象列表
	 */
	List<Article> queryArticleByUserId(long user_id);
	/**
	 * 根据用户名模糊查找文章
	 * @param keyWord 关键词
	 * @return 文章对象列表
	 */
	List<Article> queryArticleByUserName(String user_name);
}
