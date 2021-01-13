<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html  lang="en">

<head>
	<!-- meta data -->
	<meta charset="utf-8" />
	<!--font-family-->
	<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,500,600,700,800,900&amp;subset=devanagari,latin-ext" rel="stylesheet" />

	<!-- title of site -->
	<title>注册</title>

	<!-- For favicon png -->
	<%--<link rel="shortcut icon" type="image/icon" href="images/favicon.png"/>--%>

	<!--font-awesome.min.css-->
	<link rel="stylesheet" href="./css/register-font-awesome.min.css"/>

	<!--animate.css-->
	<link rel="stylesheet" href="./css/register-animate.css"/>

	<!--bootstrap.min.css-->
	<link rel="stylesheet" href="./css/register-bootstrap.min.css"/>

	<!-- bootsnav -->
	<link rel="stylesheet" href="./css/register-bootsnav.css" />

	<!--style.css-->
	<link rel="stylesheet" href="./css/register-style.css"/>

	<!--responsive.css-->
	<link rel="stylesheet" href="./css/register-responsive.css" />


	<!--jquery-->
	<script src="js/jquery.js"></script>
<%--	<script src="js/register.js"></script>--%>
</head>

<body>


<section class="signin signup popup-up">
	<div class="container">

		<div class="sign-content popup-in-content">
			<div class="popup-in-txt">
				<h2>注册</h2>

				<div class="row">
					<div class="col-sm-12">
						<div class="signin-form">
							<form action="registServlet" method="post" >
								<div class="form-group">
									<label for="signin_form">姓名</label>
									<input type="text" class="form-control" name="name" placeholder="姓名"/>
								</div><!--/.form-group -->

								<div class="form-group">
									<label for="signin_form">邮箱</label>
									<input type="email" class="form-control" id="signin_form" name="email" placeholder="请输入你的邮箱" onkeyup="zhengze()"/>
								</div><!--/.form-group -->

								<div class="form-group">
									<label for="signin_form">密码</label>
									<input type="password" class="form-control" id="pwd1" name="password" placeholder="密码"/>
								</div><!--/.form-group -->

								<div class="form-group">
									<label for="signin_form">确认密码</label>
									<input type="password" class="form-control" id="pwd2" placeholder="再次输入" onkeyup="validate()"/>
								</div><!--/.form-group -->
								<button class="btn signin_btn">
									注册
								</button>
								<p>
									已经注册账号?
									<a href="sign.jsp">登录</a>
								</p>
						<!--/.signin-footer -->
						</form><!--/form -->
					</div><!--/.signin-form -->
				</div><!--/.col -->
			</div><!--/.row -->

			<div class="row">
				<div class="col-sm-12">
					<div class="signin-password">
						<div class="awesome-checkbox-list">
							<ul class="unstyled centered">

								<li>
									<input class="styled-checkbox" id="styled-checkbox-2" type="checkbox" value="value2"/>
									<label for="styled-checkbox-2">同意条款</label>
								</li>

								<li></li>

							</ul>
						</div><!--/.awesome-checkbox-list -->
					</div><!--/.signin-password -->
				</div><!--/.col -->
			</div><!--/.row -->


			<div class="row">
				<div class="col-sm-12">

				</div><!--/.col-->
			</div><!--/.row -->
		</div><!-- .popup-in-txt -->
	</div><!--/.sign-content -->
	</div><!--/.container -->

</section><!--/.signin -->

<!-- signin end -->

<!--footer copyright start -->
<footer class="footer-copyright">
	<div id="scroll-Top">
		<i class="fa fa-angle-double-up return-to-top"  data-toggle="tooltip" data-placement="top" title="" data-original-title="Back to Top" aria-hidden="true"></i>
	</div><!--/.scroll-Top-->

</footer><!--/.hm-footer-copyright-->


</body>

</html>