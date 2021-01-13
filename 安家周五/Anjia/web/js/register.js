//密码框
function validate() {
    var pwd1 = $("#pwd1").val();
    var pwd2 = $("#pwd2").val();

    //对比2次输入  
    if(pwd1 == pwd2){
        $("#pwd2").css("border-color","green")
        $("button").removeAttr("disabled")
    }else {
        $("#pwd2").css("border-color","red")
        $("button").attr("disabled","disabled")
    }
}
//邮箱正则检验
function zhengze() {
    var email = $("#email").val();
    var myreg = /^([\.a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\.[a-zA-Z0-9_-])+/;
    if(!myreg.test(email)){
        $("#email").css("border-color","red")
    }else{
        $("#email").css("border-color","green")
    }
}

// //表单非法提交  没有实现
//  $("#submit").click(function () {
//     var name = $('[name=name]'.val())
//     var email = $('[name=email'.val())
//     var password = $('[name=password'.val())
//     //不为空 就可以注册  
//     if(name==''|| email==''||password==''){
//         $("button").attr("disabled","disabled")
//     }else{
//         $("button").removeAttr("disabled")
//     }
// })