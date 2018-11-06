package com.dao;

import com.entity.Files;

public interface IFileDao {
	/**
	 * <h5>下载文件 </h5>
	 * 调用coindao 如果返回值<=0,则返回空字符串，可以修改至service层
	 * @param file
	 * @param user_id
	 * @return
	 */
	String downloadFile(Files file,long user_id);
	/**
	 * 上传文件提交
	 * @return 受影响行数
	 */
	int uploadFile(Files file);
}
