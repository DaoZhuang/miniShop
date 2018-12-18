<!DOCTYPE html>
<html>
<#include "../common/head.ftl">
<link rel="stylesheet" href="/css/stye.css">
<body>
    <div class="body-div">
        <div class="layui-row h-title h-title">
            <div class="layui-col-md9">
                <h2>分类管理</h2>
            </div>
            <div class="layui-col-md3">
                <button class="layui-btn layui-btn-primary"><i class="layui-icon">&#xe669;</i> 刷新</button>
            </div>
        </div>
        </h2>
        <hr class="layui-bg-gray">
        <button class="layui-btn">新增一级分类</button>
        <table class="layui-hide" id="test"></table>
    </div>
</body>
<script>
    layui.use('table', function(){
        var table = layui.table;

        table.render({
            elem: '#test'
            ,url:'/product/catlist'
            ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            ,page: true
            ,cols: [[
                {field:'cat_id', title: 'ID'}
                ,{field:'cat_name', title: '分类名称'} //width 支持：数字、百分比和不填写。你还可以通过 minWidth 参数局部定义当前单元格的最小宽度，layui 2.2.1 新增
                ,{field:'disabled', title: '是否有效'}
                ,{field:'up_time', title: '更新时间'}
            ]]
        });
    });
</script>
</html>