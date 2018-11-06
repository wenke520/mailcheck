package com.dao;

import java.util.List;

import com.entity.Commenter;

public interface ICommenterDao {
/*	COMMENTER_ID      NUMBER                                   
	ARTICLE_ID        NUMBER         Y                         
	COMMENTER_CONTENT VARCHAR2(4000) Y                         
	COMMENTER_FILE    VARCHAR2(300)  Y                         
	USER_ID           NUMBER         Y                         
	COMMENTER_DATE    DATE           Y  */
	
	int insertCommenter(Commenter commenter);
	
	List<Commenter> queryCommenterByArticleId(long article_id);
	
	List<Commenter> queryCommenterByUserId(long user_id);
	
	Commenter queryCommenterByCommentId(long commenter_id);
}
