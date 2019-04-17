$(document).ready(function() {
    $.ajax({
        url:"${ctx}/data/item.do",
        type:"post",
        datatype:"json",
        success:function (res) {
          var list = res.list;
          var str="";
          for(i=0;i<=res.length;i++){
              str += list[i].id;
              str += list[i].title;
              str += list[i].price;
              str += list[i].image;
          }

        },
        error:function () {
            alert("出错了");
        }





    });








});