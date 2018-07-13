<%--
  Created by IntelliJ IDEA.
  User: sidney
  Date: 2018/6/20
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="echarts.js"></script>
    <script src="jquery-3.0.0.min.js"></script>
</head>
<body>
<div id="main">

</div>
</body>
<script type="text/javascript">
   /* function  getMsg() {

        var url = "请求地址";
        $.ajax({
            type : "get",
            async : false,  //同步请求
            url : "/test3.action",
            data : {username:123},
            success:function(dates){
                //alert(dates);
                $("#testDiv").html(dates);//要刷新的div
            },
            error: function() {
                // alert("失败，请稍后再试！");
            }
        });
    }*/

   var myChart = echarts.init(document.getElementById('main'));
   // 显示标题，图例和空的坐标轴
   myChart.setOption({
       title: {
           text: '异步数据加载示例'
       },
       tooltip: {},
       legend: {
           data:['销量']
       },
       xAxis: {
           data: []
       },
       yAxis: {},
       series: [{
           name: '销量',
           type: 'bar',
           data: []
       }]
   });

   // 异步加载数据
   $.get('data.json').done(function (data) {
       // 填入数据
       myChart.setOption({
           xAxis: {
               data: data.categories
           },
           series: [{
               // 根据名字对应到相应的系列
               name: '销量',
               data: data.data
           }]
       });
   });

</script>
</html>
