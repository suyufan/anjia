function search(){
    var options = $("select option:selected")
    if(options.val() == 2011){
        myiframe.src = "data/2011年.html"
    }
    if(options.val() == 2012){
        myiframe.src = "data/2012年.html"
    }
    if(options.val() == 2013){
        myiframe.src = "data/2013年.html"
    }
    if(options.val() == 2014){
        myiframe.src = "data/2014年.html"
    }
    if(options.val() == 2015){
        myiframe.src = "data/2015年.html"
    }
    if(options.val() == 2016){
        myiframe.src = "data/2016年.html"
    }
    if(options.val() == 2017){
        myiframe.src = "data/2017年.html"
    }
    if(options.val() == 2018){
        myiframe.src = "data/2018年.html"
    }
    if(options.val() == 2019){
        myiframe.src = "data/2019年.html"
    }
    if(options.val() == 2020){
        myiframe.src = "data/2020年.html"
    }
}  

function anaylze(){
    var chk_value = []
    $('input[name="home"]:checked').each(function(){
        if($(this).val() == 'new'){
            myiframe.src = "data/new.html"
        }
        if($(this).val() == 'old'){
            myiframe.src = "data/old.html"
        }
        chk_value.push($(this).val())
        
    })
    if(chk_value.length == 2){
        myiframe.src = "data/new and old.html"
    }
}