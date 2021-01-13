<%@ page import="javax.swing.text.StyledEditorKit" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Collections" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>符合您要求的房源展示</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap-grid.min.css"/><!--CSS RESET-->
    <link rel="stylesheet" href="http://jrain.oscitas.netdna-cdn.com/tutorial/css/fontawesome-all.min.css">
    <link rel="stylesheet" type="text/css" href="css/htmleaf-demo.css"><!--演示页面样式，使用时可以不引用-->
    <style>
        .demo {
            padding: 2em 0
        }

        .product-grid {
            font-family: 'Roboto', sans-serif;
            position: relative;
        }

        .product-grid .product-image {
            overflow: hidden;
            position: relative;
        }

        .product-grid .product-image:before {
            content: "";
            background: rgba(0, 0, 0, 0.3);
            width: 100%;
            height: 100%;
            opacity: 0;
            position: absolute;
            top: 0;
            left: 0;
            z-index: 1;
            transition: all 0.4s ease-out 0s;
        }

        .product-grid:hover .product-image:before {
            opacity: 1;
        }

        .product-grid .product-image a {
            display: block;
        }

        .product-grid .product-image img {
            width: 100%;
            height: auto;
        }

        .product-image .pic-1 {
            opacity: 1;
            backface-visibility: hidden;
            transition: all 0.4s ease-out 0s;
        }

        .product-grid:hover .product-image .pic-1 {
            opacity: 0;
        }

        .product-image .pic-2 {
            width: 100%;
            height: 100%;
            opacity: 0;
            backface-visibility: hidden;
            transform: scale(3);
            position: absolute;
            top: 0;
            left: 0;
            transition: all 0.4s ease-out 0s;
        }

        .product-grid:hover .product-image .pic-2 {
            opacity: 1;
            transform: scale(1);
        }

        .product-image .product-trend-label,
        .product-image .product-discount-label {
            content: "";
            color: #fff;
            background-color: #2ecc71;
            font-size: 12px;
            line-height: 28px;
            font-weight: 700;
            text-align: center;
            text-transform: uppercase;
            padding: 0 7px;
            position: absolute;
            top: 12px;
            left: 12px;
            z-index: 3;
        }

        .product-image .product-discount-label {
            background-color: #e74c3c;;
            left: auto;
            right: 12px;
        }

        .product-grid .social {
            padding: 0;
            margin: 0;
            list-style: none;
            transform: translateY(-50%);
            position: absolute;
            top: 50%;
            left: 10px;
            z-index: 4;
        }

        .product-grid .social li {
            margin: 0 0 12px;
            opacity: 0;
            transform: translateX(-60px);
            transition: transform .3s ease-out 0s;
        }

        .product-grid:hover .social li {
            opacity: 1;
            transform: translateX(0);
        }

        .product-grid:hover .social li:nth-child(2) {
            transition-delay: 0.1s;
        }

        .product-grid:hover .social li:nth-child(3) {
            transition-delay: 0.2s;
        }

        .product-grid:hover .social li:nth-child(4) {
            transition-delay: 0.3s;
        }

        .product-grid .social li a {
            color: #fff;
            font-size: 22px;
            transition: all 0.3s;
        }

        .product-grid .social li a:hover {
            color: #e74c3c;;
        }

        .product-grid .social li a:before,
        .product-grid .social li a:after {
            content: attr(data-tip);
            color: #000;
            background: #fff;
            font-size: 14px;
            padding: 5px 10px;
            white-space: nowrap;
            display: none;
            transform: translateY(-50%);
            position: absolute;
            left: 33px;
            top: 50%;
            transition: all 0.3s;
        }

        .product-grid .social li a:after {
            content: '';
            background: linear-gradient(-45deg, #fff 49%, transparent 50%);
            width: 10px;
            height: 10px;
            top: 40%;
            left: 20px;
        }

        .product-grid .social li a:hover:before,
        .product-grid .social li a:hover:after {
            display: block;
        }

        .product-grid .product-content {
            padding: 12px 0;
        }

        .product-grid .title {
            font-size: 15px;
            font-weight: 400;
            text-transform: capitalize;
            margin: 0 0 5px;
        }

        .product-grid .title a {
            color: #959595;
        }

        .product-grid .title a:hover {
            color: #e74c3c;;
        }

        .product-grid .price {
            color: #333;
            font-size: 14px;
            font-weight: 400;
        }

        .product-grid .price span {
            color: #333;
            text-decoration: line-through;
            margin-right: 3px;
        }

        .product-grid .price.discount {
            color: #e74c3c;;
        }

        @media only screen and (max-width: 990px) {
            .product-grid {
                margin-bottom: 30px;
            }
        }
    </style>
</head>
<body>
<div class="htmleaf-container">
    <header class="htmleaf-header">
   <%--     <a href="index_bak.html">
            <img src="fangzi.png" alt="">
        </a>--%>


        <h1>我们找到了如下符合您要求的房源 <span></span>
        </h1>
       <div class="htmleaf-links">
           <a class="htmleaf-icon icon-htmleaf-home-outline" href="index_bak.html" title="安家首页" target="_blank"><span> 安家首页</span></a>
           <a class="htmleaf-icon icon-htmleaf-arrow-forward-outline" href="survey1.html" title="返回住房推荐" target="_blank"><span> 返回住房推荐</span></a>
       </div>
    </header>
    <div class="demo">
        <div class="container">
            <div class="row">


                <!--                住房分块展示信息-->
                <%--  <div class="col-md-3 col-sm-6">
                      <span class="product-grid">
                          <div class="product-image">
                              <a href="#">
                                  <img class="pic-1"
                                       src="https://pic1.ajkimg.com/display/ajk/201102e27bea0b297e4f64c47726c5a5/214x156c.jpg?t=1">
                                  <img class="pic-2"
                                       src="https://pic1.ajkimg.com/display/ajk/201102e27bea0b297e4f64c47726c5a5/214x156c.jpg?t=1">
                              </a>
                              <span class="product-trend-label">在售</span>
                          </div>
                          <div class="product-content">
                              <h3 class="title"><a href="#">泾河工业园 陕汽大道1号 低层(共33层) 2015年建造 87平 </a></h3>
                              <div class="price">9116元/平米</div>
                          </div>
                      </span>
                  </div>--%>

                <%
                    List list = Collections.singletonList(session.getAttribute("list"));
                %>

                <c:forEach items="${list}" var="map">
                    <div class="col-md-3 col-sm-6">
                    <span class="product-grid">
                        <div class="product-image">
                            <a href="#">
                                <img class="pic-1"
                                     src=${map['Apicture']}>
                                <img class="pic-2"
                                     src=${map['Apicture']}>
                            </a>
                            <span class="product-trend-label">在售</span>
                        </div>

                        <div class="product-content">
                            <h3 class="title"><a href="#">${map['Aaddress']} ${map['Aheight']} ${map['Ayears']}年建造  </a></h3>
                            <div class="price">${map['Aprice']}元/平米</div>
                        </div>
                    </span>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>


</body>
</html>