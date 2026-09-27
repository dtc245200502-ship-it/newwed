<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<%
    java.util.Date date = new java.util.Date();
%>

<!DOCTYPE html>

<html lang="vi">

<head>

    <meta charset="UTF-8">

    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">

    <title>CodeGym JSP Demo</title>

    <style>

        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 100px;
            background-color: #f8fafc;
            color: #1e293b;
        }

        h2 {
            color: #1b2a7a;
            font-size: 36px;
        }

        .time {
            color: #64748b;
            font-size: 18px;
        }

        .time strong {
            color: #f15a24;
        }

        .btn {
            display: inline-block;
            background-color: #1b2a7a;
            color: white;
            padding: 10px 20px;
            text-decoration: none;
            border-radius: 6px;
            margin-top: 20px;
        }

        .btn:hover {
            background-color: #14205e;
        }

    </style>

</head>

<body>

    <h2>
        Chào mừng tới lớp học Java Web!
    </h2>

    <p>
        Đây là trang JSP động được biên dịch trực tiếp từ Tomcat Server.
    </p>

    <p class="time">

        Thời gian hệ thống hiện tại:

        <strong>
            <%= date %>
        </strong>

    </p>

    <br>

    <a class="btn" href="hello">
        Đi tới HelloServlet
    </a>

</body>

</html>
