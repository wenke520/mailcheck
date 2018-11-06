package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.ejb.Asynchronous;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
//servlet3.0特性
//1.注解支持
//WebServlet,WebFilter 修饰Servlet类,Filter类,name,initParams等属性
//WebInitParam 配置参数,与WebServlet嵌套使用,name,value等属性
 
//		asyncSupported=true，是否异步

//MultipartConfig 说明该Servlet处理的是multipart/form-data类型的请求
public class Part_test extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
		 * Constructor of the object.
		 */
	public Part_test() {
		super();
	}

	/**
		 * Destruction of the servlet. <br>
		 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//输入格式
		
		//获取part对象
		
		//从prat中获取输入图片对象
		
		//创建输出图片对象
		
		//初始化Graphics
		
		//获取精度参数
		
		//字符串，作为数组存储字符@#&$%*o!;.
		
		//利用循环获取输入图片的rgb信息，并写入到输出图片
		
			//初始化每行的字符串
			
		
				//获取输入图片(R,G,B)


		
		
		
				//获取灰度值，权重 0.299f   0.578f   0.114f 
				
				//获取对应下标
				
				//获取对应下标的字符内容


		
		
		//手动释放绘图资源
		
		//获取输出流
		
		//将图片写入输出流
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
	public void init() throws ServletException {
		// Put your code here
	}
	private Graphics createGra(BufferedImage image){
		Graphics g = image.createGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.BLACK);
		g.setFont(new Font("微软雅黑",Font.PLAIN,12));
		return g;
	}
}
