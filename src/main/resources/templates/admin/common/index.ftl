<!DOCTYPE html>
<html>
<#include "head.ftl">
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
<#--边栏sidebar-->
<#include "nav.ftl">
    <div class="layui-body">
        <!-- 内容主体区域 -->
        <iframe name="mainFrame" id="mainFrame" frameborder="0" src="" style="margin:0 auto;width:100%;height:100%;"></iframe>
    </div>
</div>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
    //页面初始化 选中第一条
    window.onload=function(){
        document.getElementById("menu1").classList.add("layui-nav-itemed");
        var menpar = document.getElementById("par1");
        menpar.onclick();
        menpar.classList.add("layui-this");
    }
    //点击事件 改变 mainFrame 中的 src
    function changeFrame(url) {
        document.getElementById("mainFrame").setAttribute("src", url);
    }
</script>
</body>
</html>