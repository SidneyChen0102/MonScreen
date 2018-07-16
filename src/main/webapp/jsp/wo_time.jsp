<%--
  Created by IntelliJ IDEA.
  User: sidney
  Date: 2018/6/20
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>ECharts</title>
    <!-- 引入 echarts.js -->
    <script type="text/javascript" src="echarts.js"></script>
    <!-- 引入jquery.js -->
    <script type="text/javascript" src="jquery-3.0.0.min.js"></script>
</head>

<body>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="main" style="width: 650px;height:420px;"></div>

<script type="text/javascript">

    var myChart = echarts.init(document.getElementById('main'));
    // 显示标题，图例和空的坐标轴
    myChart.setOption({
        title: {
            text: '工单时长监控'
        },
        tooltip: {},
        legend: {
            data: ['CRM工单','数指工单','联指工单']
        },
        xAxis: {
            data: ['0点','1点','2点','3点','4点','5点','6点','7点','8点','9点','10点','11点','12点','13点','14点','15点','16点','17点','18点','19点','20点','21点','22点','23点']
        },
        yAxis: {},
        series : [
            {
                name:'CRM工单',
                type:'line',
                smooth:true,
                itemStyle: {normal: {areaStyle: {type: 'default'}}},
                data:[]
            },
            {
                name:'数指工单',
                type:'line',
                smooth:true,
                itemStyle: {normal: {areaStyle: {type: 'default'}}},
                data:[]
            },
            {
                name:'联指工单',
                type:'line',
                smooth:true,
                itemStyle: {normal: {areaStyle: {type: 'default'}}},
                data:[]
            }
        ]
    });

    myChart.showLoading();    //数据加载完之前先显示一段简单的loading动画

    /* var names = [];    //类别数组（实际用来盛放X轴坐标值）*/
    var num_olc = [];    //成功率数组（实际用来盛放Y坐标值）
    var num_nea=[];
    var num_crm=[];
    $.ajax({
        type: "post",
        async: true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
        url: "${pageContext.request.contextPath}/getTime",    //请求发送到TestServlet处
        data: {},
        dataType: "json",        //返回数据形式为json
        success: function (result) {
            alert(result);
            //请求成功时执行该函数内容，result即为服务器返回的json对象\

            if (result) {
                for (var i = 0; i < result.length; i++) {
                    num_olc.push(result[i].OLC_TIME);
                    num_nea.push(result[i].NEA_TIME);
                    num_crm.push(result[i].CRM_TIME); //挨个取出类别并填入类别数组
                }

                myChart.hideLoading();    //隐藏加载动画
                myChart.setOption({        //加载数据图表
                    xAxis: {
                        /*data: names*/
                    },
                    series: [{
                        // 根据名字对应到相应的系列
                        name: '联指工单',
                        data: num_olc
                    },

                        {
                            name:'数指工单',
                            data:num_nea
                        },
                        {
                            name:'CRM工单',
                            data:num_crm
                        }

                    ]
                });

            }

        },
        error: function (errorMsg) {
            //请求失败时执行该函数
            alert("图表请求数据失败!");
            myChart.hideLoading();
        }
    })
</script>
</body>
</html>