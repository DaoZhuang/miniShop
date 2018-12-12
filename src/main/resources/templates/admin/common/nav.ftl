<div class="layui-header">
    <div class="layui-logo">miniShop 后台管理</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
        <#list menu.headList as item>
            <li class="layui-nav-item"><a href="/main/index?index=${item.MENU_ID}">${item.MENU_NAME}</a></li>
        </#list>

        <li class="layui-nav-item">
            <a href="javascript:;">其它系统</a>
            <dl class="layui-nav-child">
                <dd><a href="">邮件管理</a></dd>
                <dd><a href="">消息管理</a></dd>
                <dd><a href="">授权管理</a></dd>
            </dl>
        </li>
    </ul>
    <ul class="layui-nav layui-layout-right">
        <li class="layui-nav-item">
            <a href="javascript:;">
                <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                贤心
            </a>
            <dl class="layui-nav-child">
                <dd><a href="">基本资料</a></dd>
                <dd><a href="">安全设置</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="">退了</a></li>
    </ul>
</div>

<div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
        <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
        <ul class="layui-nav layui-nav-tree"  lay-filter="test">
            <#assign men = 0>
            <#assign par = 0>
            <#list menu.navList as menuItem>
                <#if menuItem.MENU_URL = "#">
                <#assign men = men + 1>
                <li class="layui-nav-item" id="menu${men}">
                    <a href="javascript:;">${menuItem.MENU_NAME}</a>
                    <dl class="layui-nav-child">
                    <#list menu.navList as parItem>
                    <#if menuItem.MENU_ID+"" = parItem.PARENT_ID+"">
                        <#assign par = par + 1>
                        <dd  id="par${par}" onclick="changeFrame('${parItem.MENU_URL}')"><a href="javascript:;">${parItem.MENU_NAME}</a></dd>
                    </#if>
                    </#list>
                    </dl>
                </li>
                </#if>
            </#list>
        </ul>
    </div>
</div>