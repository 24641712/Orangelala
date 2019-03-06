// function  frame() {
//     alert("frame.js")
//     // content1=document.getElementById("content1");
//     // content1.innerHTML="information.html";
//     $("#content1").empty();
//     $("#content1").html("/ftl/personal/information.html");
// }
//
// $(function () {
//     $(".profile").on("click","li",function () {
//         var sId = $(this).attr("id"); //获取data-id的值
//         alert("information.html");
//         $(".content1").innerText="llll";
//         // loadInner(sId);
//     });
//
//     function loadInner(sId) {
//         alert("sId="+sId);
//         var pathn, i;
//         switch(sId) {
//             case "information":
//                 alert("information");
//                 pathn = "user_center.html";
//                 i = 0;
//                 break;
//             case "safety":
//                 alert("safety");
//                 pathn = "user_account.html";
//                 i = 1;
//                 break;
//             case "address":
//                 alert("address");
//                 pathn = "user_trade.html";
//                 i = 2;
//                 break;
//             case "cardlist":
//                 alert("cardlist");
//                 pathn = "user_info.html";
//                 i = 3;
//                 break;
//             default:
//                 alert("default");
//                 pathn = "user_center.html";
//                 i = 0;
//                 break;
//         }
//         $("#content").load("information.ftl"); //加载相对应的内容
//         $(".userMenu li").eq(i).addClass("current").siblings().removeClass("current"); //当前列表高亮
//     }
//
//     var sId ="information";
//     loadInner(sId);
//     $("#content").load("information.ftl");
// });
