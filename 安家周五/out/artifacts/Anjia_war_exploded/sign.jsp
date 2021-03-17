<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>安家房价综合服务登录界面</title>
    <!-- logo    -->
    <link type="icon" href="./images/logo.png"/>

    <link rel="stylesheet" href="./css/sign-icfont.css" />
    <link rel="stylesheet" href="./css/sign-loginstyle.css" />

</head>
<body>

<div id="login">
    <h1>开始登录</h1>
    <div class="msg_cont">
        <b></b>
        <span class="errorMsg" style="color:white;">
            <!--第一次的时候，requset域中还没有信息，会返回null-->
            ${empty requestScope.msg?"请输入用户名和密码":requestScope.msg}
        </span>
    </div>
    <div class="form">
        <form action="loginServlet" method="post">
            <div class="item">
                <span class="iconfont icon-user"></span>
                <!--用户名回显-->
                <input class="itxt" type="text" placeholder="请输入用户名" autocomplete="off" tabindex="1" name="Uuser"
                       value="${ requestScope.username}"/>
                <br />
                <br />
            </div>

            <div class="item">
                <span class="iconfont icon-password"></span>
                <!--密码回显-->
                <input class="itxt" type="password" placeholder="密码" autocomplete="off" tabindex="1" name="Upassword"
                       value="${ requestScope.password }"/>
                <br />
                <br />
            </div>

            <button>登录</button>
        </form>
    </div>
    <p style="color: #fff">
        未注册账号? <a href="register.jsp" style="color: #6f42c1">注册</a>
    </p>

</div>



</body>
</html>