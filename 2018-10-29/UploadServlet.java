package controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/upload.do")
@MultipartConfig
public class UploadServlet extends HttpServlet{
    public UploadServlet() {}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String title = request.getParameter("title");
        System.out.println(title);
        // 获取请求项， 封装成Part对象
        Part part = request.getPart("file");
      //获取HTTP头信息headerInfo=（form-data; name="file" filename="文件名"）
        String headerInfo  = part.getHeader("Content-Disposition");
      //从HTTP头信息中获取文件名fileName=（文件名）
        String fileName = headerInfo .substring(headerInfo .lastIndexOf("=")+2, headerInfo .length()-1);
        System.out.println(fileName);

        String direc = this.getServletContext().getRealPath("/upload/");
        File dirf = new File(direc);

        if(!dirf.exists()){
            dirf.mkdirs();
        }
        part.write(direc+File.separator+fileName);
        System.out.println("upload success");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        doGet(request, response);
    }
}
