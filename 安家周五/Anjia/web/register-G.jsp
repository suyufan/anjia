<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html  lang="en">

    <head>
        <!-- meta data -->
        <meta charset="utf-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <!--font-family-->
		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,500,600,700,800,900&amp;subset=devanagari,latin-ext" rel="stylesheet"/>
        
        <!-- title of site -->
        <title>管理员注册</title>

        <!-- For favicon png -->
		<%--<link rel="shortcut icon" type="image/icon" href="assets/logo/favicon.png"/>--%>
       
        <!--font-awesome.min.css-->
        <link rel="stylesheet" href="./css/register-G-font-awesome.min.css"/>
		
		<!--animate.css-->
        <link rel="stylesheet" href="./css/register-G-animate.css"/>
		
        <!--bootstrap.min.css-->
        <link rel="stylesheet" href="./css/register-G-bootstrap.min.css"/>
		
		<!-- bootsnav -->
		<link rel="stylesheet" href="./css/register-G-bootsnav.css" />
        
        <!--style.css-->
        <link rel="stylesheet" href="./css/register-G-style.css"/>
        
        <!--responsive.css-->
        <link rel="stylesheet" href="./css/register-G-responsive.css"/>

		<!--jquery-->
		<script src="js/jquery.js"></script>
		<script src="js/register.js"></script>

    </head>
	
	<body>
		
		<section class="signin signup popup-in pop-up">
			<div class="container">

				<div class="sign-content popup-in-content">
					<div class="popup-in-txt">
						<h2>注册管理员</h2>

						<div class="signin-form">
							<div class=" ">
								<div class=" ">
									<form action="AdminRegistServlet" method="post">
										<div class="form-group">
										    <label for="signin_form">姓名</label>
										    <input type="text" class="form-control" id="signin_form" placeholder="姓名" name="name"/>
										</div><!--/.form-group -->


										<div class="form-group">
											<label for="signin_form">电子邮件</label>
										    <input type="email" class="form-control"  placeholder="请输入你的邮箱" name="email" onkeyup="zhengze()"/>
										</div><!--/.form-group -->
										<div class="form-group">
											<label for="pwd1">密码</label>
										    <input type="password" class="form-control" id="pwd1" placeholder="请输入你的密码" name="password"/>
										</div><!--/.form-group -->
										<div class="form-group">
											<label for="pwd2">确认密码</label>
											<input type="password" class="form-control" id="pwd2" placeholder="再次输入" onkeyup="validate()"/>
										</div><!--/.form-group -->
										<button class="btn signin_btn signin_btn_two">
											注册
										</button>
									</form><!--/form -->
								</div><!--/.col -->
							</div><!--/.row -->

						</div><!--/.signin-form -->
						<div class="signin-password">
							<div class="password-circle">
								<div class="single-password-circle">
									<input type="radio" id="radio01" name="radio"/>
										<label for="radio01">
											<span class="round-boarder">
												<span class="round-boarder1"></span></span>我同意要求
										</label>
								</div><!--/.single-password-circle-->
								
							</div><!--/.password-circle-->
						</div><!--/.signin-password -->

						<div class="signin-footer">

							<p>
								已经有管理员账户 ?
								<a href="admin_sign.jsp">登录</a>
							</p>
						</div><!--/.signin-footer -->
					</div><!-- .popup-in-txt -->
				</div><!--/.sign-content -->
			</div><!--/.container -->

		</section><!--/.signin -->
		
		<!-- signin end -->

		<!--footer copyright start -->
		<footer class="footer-copyright">


		</footer>

		

    </body>
	
</html>