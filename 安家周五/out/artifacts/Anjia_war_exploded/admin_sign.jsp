<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html  lang="en">

    <head>
        <!-- meta data -->
        <meta charset="utf-8"/>
   
        <!--font-family-->
		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,500,600,700,800,900&amp;subset=devanagari,latin-ext" rel="stylesheet"/>
        
        <!-- title of site -->
        <title>管理员</title>

        <!-- For favicon png -->
		<%--<link rel="shortcut icon" type="image/icon" href="./logo/favicon.png"/>--%>
       
        <!--font-awesome.min.css-->
        <link rel="stylesheet" href="./css/administrators-font-awesome.min.css"/>
		
		<!--animate.css-->
        <link rel="stylesheet" href="./css/administrators-animate.css"/>
		
        <!--bootstrap.min.css-->
        <link rel="stylesheet" href="./css/administrators-bootstrap.min.css"/>
		
		<!-- bootsnav -->
		<link rel="stylesheet" href="./css/administrators-bootsnav.css" />
        
        <!--style.css-->
        <link rel="stylesheet" href="./css/administrators-style.css"/>
        
        <!--responsive.css-->
        <link rel="stylesheet" href="./css/administrators-responsive.css" />
        
        

    </head>
	
	<body>
		
		<section class="signin">
			<div class="container">

				<div class="sign-content">
					<h2>管理员登录</h2>

					<div class="row">
						<div class="col-sm-12">
							<div class="msg_cont">
								<b></b>
								<span class="errorMsg" style="color:lightsteelblue;">
									<!--第一次的时候，requset域中还没有信息，会返回null-->
									${empty requestScope.msg?"请输入用户名和密码":requestScope.msg}
								</span>
							</div>
							<div class="signin-form">
								<form action="AdminLoginServlet" method="post">
									<div class="form-group">
										<label>用户名：</label>
										<input class="form-control" type="text" placeholder="请输入用户名" autocomplete="off" tabindex="1" name="Guser"/>
									</div><!--/.form-group -->
									<div class="form-group">
										<label>密码：</label>
									    <input  class="form-control" name="Gpassword" placeholder="请输入你的密码" type="password" />
									</div><!--/.form-group -->
									<button class="btn signin_btn signin_btn_two" >
										登录
									</button>
								</form><!--/form -->
							</div><!--/.signin-form -->
						</div><!--/.col -->
					</div><!--/.row -->

					<div class="row">
						<div class="col-sm-12">
							<div class="signin-password">
								<div class="password-circle">
									<div class="single-password-circle">
										<input type="radio" id="radio01" name="radio" />
											<label for="radio01">
												<span class="round-boarder">
													<span class="round-boarder1"></span>
												</span>记住密码
											</label>
									</div><!--/.single-password-circle-->
									<div class="single-forgot-password-circle text-right
									">
										<a href="register-G.jsp">忘记用户名或密码</a>
									</div><!--/.single-password-circle-->
								</div><!--/.password-circle-->
							</div><!--/.signin-password -->
						</div><!--/.col -->
					</div><!--/.row -->

					<div class="row">
						<div class="col-sm-12">
							<div class="signin-footer">

								<p>
									没有管理员账户 ?
									<a href="register-G.jsp">注册</a>
								</p>
							</div><!--/.signin-footer -->
						</div><!--/.col -->
					</div><!--/.row -->

				</div><!--/.sign-content -->--%>

            </div>
        </section>

		<!--footer copyright start -->
		<footer class="footer-copyright">


		</footer><!--/.hm-footer-copyright-->
		
    </body>
	
</html>