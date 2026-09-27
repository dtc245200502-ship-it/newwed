package com.codegym;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
        name = "HelloServlet",
        urlPatterns = {"/hello"}
)
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {

        // Thiết lập kiểu dữ liệu trả về
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html lang='vi'>");

            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<title>Hello Servlet</title>");

            out.println("<style>");

            out.println("body {");
            out.println("    font-family: Arial, sans-serif;");
            out.println("    text-align: center;");
            out.println("    margin-top: 100px;");
            out.println("    background: #f8fafc;");
            out.println("    color: #1e293b;");
            out.println("}");

            out.println("h1 {");
            out.println("    color: #1b2a7a;");
            out.println("}");

            out.println("a {");
            out.println("    display: inline-block;");
            out.println("    margin-top: 20px;");
            out.println("    background: #1b2a7a;");
            out.println("    color: white;");
            out.println("    padding: 10px 20px;");
            out.println("    text-decoration: none;");
            out.println("    border-radius: 6px;");
            out.println("}");

            out.println("</style>");

            out.println("</head>");

            out.println("<body>");

            out.println("<h1>");
            out.println("Chào mừng bạn đến với Servlet đầu tiên!");
            out.println("</h1>");

            out.println("<p>");
            out.println("Ứng dụng đang chạy trên Tomcat 10.1+.");
            out.println("</p>");

            out.println("<p>");
            out.println("Sử dụng Jakarta Servlet API.");
            out.println("</p>");

            out.println("<a href='index.jsp'>");
            out.println("Quay lại trang chủ JSP");
            out.println("</a>");

            out.println("</body>");

            out.println("</html>");
        }
    }
}
