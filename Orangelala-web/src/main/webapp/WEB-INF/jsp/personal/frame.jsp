<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--获取绝对路径--%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

    <title>框架</title>

    <link href="${ctx}/static/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${ctx}/static/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="${ctx}/static/css/personal.css" rel="stylesheet" type="text/css">

    <script src="${ctx}/static/assets/js/jquery.min.js" type="text/javascript"></script>
    <script src="${ctx}/static/assets/js/amazeui.js" type="text/javascript"></script>
    <script src="${ctx}/static/js/jquery-1.7.2.min.js" type="text/javascript"></script>
    <script src="${ctx}/static/js/frame.js" type="text/javascript"></script>

</head>

<body>
<!--头 -->
<header>
    <article>
        <div class="mt-logo">
            <!--顶部导航条 -->
            <div class="am-container header">
                <ul class="message-l">
                    <div class="topMessage">
                        <div class="menu-hd">
                            <a href="#" target="_top" class="h">亲，请登录</a>
                            <a href="#" target="_top">免费注册</a>
                        </div>
                    </div>
                </ul>
                <ul class="message-r">
                    <div class="topMessage home">
                        <div class="menu-hd"><a href="#" target="_top" class="h">商城首页</a></div>
                    </div>
                    <div class="topMessage my-shangcheng">
                        <div class="menu-hd MyShangcheng"><a href="#" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
                    </div>
                    <div class="topMessage mini-cart">
                        <div class="menu-hd"><a id="mc-menu-hd" href="#" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
                    </div>
                    <div class="topMessage favorite">
                        <div class="menu-hd"><a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
                </ul>
            </div>

            <!--悬浮搜索框-->

            <div class="nav white">
                <div class="logoBig">
                    <li><img src="${ctx}/static/images/logobig.png" /></li>
                </div>

                <div class="search-bar pr">
                    <a name="index_none_header_sysc" href="#"></a>
                    <form>
                        <input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
                        <input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
                    </form>
                </div>
            </div>

            <div class="clear"></div>
        </div>
        </div>
    </article>
</header>

<div class="nav-table">
    <div class="long-title"><span class="all-goods">全部分类</span></div>
    <div class="nav-cont">
        <ul>
            <li class="index"><a href="#">首页</a></li>
            <li class="qc"><a href="#">闪购</a></li>
            <li class="qc"><a href="#">限时抢</a></li>
            <li class="qc"><a href="#">团购${name}</a></li>
            <li class="qc last"><a href="#">大包装</a></li>
        </ul>
        <div class="nav-extra">
            <i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
            <i class="am-icon-angle-right" style="padding-left: 10px;"></i>
        </div>
    </div>
</div>
<b class="line"></b>

<div class="center">
    <div class="col-main">
        <div class="main-wrap">
            <div id="content1" class="content1">
                <iframe id="menuFrame" name="menuFrame" src=""
                style="overflow: visible;margin-left: -50px" scrolling="yes" frameborder="no"
                height="760px" width="100%"></iframe>

            </div>
        </div>

        <!--底部-->
        <div class="footer">
            <div class="footer-hd">
                <p>
                    <a href="#">恒望科技</a>
                    <b>|</b>
                    <a href="#">商城首页</a>
                    <b>|</b>
                    <a href="#">支付宝</a>
                    <b>|</b>
                    <a href="#">物流</a>
                </p>
            </div>
            <div class="footer-bd">
                <p>
                    <a href="#">关于恒望</a>
                    <a href="#">合作伙伴</a>
                    <a href="#">联系我们</a>
                    <a href="#">网站地图</a>
                    <em>© 2015-2025 Hengwang.com 版权所有. 更多模板 <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></em>
                </p>
            </div>
        </div>
    </div>

    <aside class="menu">
        <ul>
            <li class="person active">
                <a href="${ctx}/index.jsp"><i class="am-icon-user"></i>个人中心</a>
                <input type="hidden" id="name" name="name" value="${name}">
            </li>
            <li class="person">
                <p><i class="am-icon-newspaper-o"></i>个人资料</p>
                <ul class="profile">
                    <li> <a href="${ctx}/index/information.do" target="menuFrame"><span id="information">个人信息</span></a></li>
                    <li> <a href="${ctx}/index/safety.do" target="menuFrame">安全设置</a></li>
                    <li> <a href="${ctx}/index/address.do" target="menuFrame">地址管理</a></li>
                    <li> <a href="${ctx}/index/cardlist.do" target="menuFrame">快捷支付</a></li>
                </ul>
            </li>
            <li class="person">
                <p><i class="am-icon-balance-scale"></i>我的交易</p>
                <ul class="MyTrade">
                    <li><a href="${ctx}/index/order.do" target="menuFrame">订单管理</a></li>
                    <li> <a href="${ctx}/index/change.do" target="menuFrame">退款售后</a></li>
                    <li> <a href="${ctx}/index/comment.do" target="menuFrame">评价商品</a></li>
                </ul>
            </li>
            <li class="person">
                <p><i class="am-icon-dollar"></i>我的资产</p>
                <ul class="MyAssets">
                    <li> <a href="${ctx}/index/points.do" target="menuFrame"><span id="points">我的积分</span></a></li>
                    <li> <a href="${ctx}/index/coupon.do" target="menuFrame">优惠券 </a></li>
                    <li> <a href="${ctx}/index/bonus.do" target="menuFrame">红包</a></li>
                    <li> <a href="${ctx}/index/walletlist.do" target="menuFrame">账户余额</a></li>
                    <li> <a href="${ctx}/index/bill.do" target="menuFrame">账单明细</a></li>
                </ul>
            </li>

            <li class="person">
                <p><i class="am-icon-tags"></i>我的收藏</p>
                <ul class="MyCollection">
                    <li> <a href="${ctx}/index/collection.do" target="menuFrame">
                        <span id="collection">收藏</span></a></li>
                    <li> <a href="${ctx}/index/foot.do" target="menuFrame"><span id="foot">足迹</span></a></li>
                </ul>
            </li>

            <li class="person">
                <p><i class="am-icon-qq"></i>在线客服</p>
                <ul class="MyService">
                    <li> <a href="${ctx}/index/consultation.do" target="menuFrame"><span id="consultation">商品咨询</span></a></li>
                    <li> <a href="${ctx}/index/suggest.do" target="menuFrame">意见反馈</a></li>

                    <li> <a href="${ctx}/index/news.do" target="menuFrame">我的消息</a></li>
                </ul>
            </li>
        </ul>

    </aside>
</div>

<script type="text/javascript">
    $(document).ready(function () {
        var name = $("#name").val();
        $("#"+name).click();
    })

</script>
</body>

</html>