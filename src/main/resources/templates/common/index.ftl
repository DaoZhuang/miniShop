<!DOCTYPE html>
<html>
<#include "./head.ftl">
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
<#--边栏sidebar-->
<#include "./nav.ftl">

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <iframe name="mainFrame" id="mainFrame" frameborder="0" src="http://localhost:8080/index/test2" style="margin:0 auto;width:100%;height:100%;"></iframe>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>

</body>
</html>