$(document).ready(function() {	//点击div实现跳转
	$(".box").click(function(){  
        var load = window.location.href
        var newload = $(this).find("a").attr("href")
		window.location=load.replace("index_success.html",newload);
		return false;  
	}); 
});