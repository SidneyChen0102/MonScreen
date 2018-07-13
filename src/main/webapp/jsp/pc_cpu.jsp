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
<div id="main" style="width: 600px;height:500px;"></div>

<script type="text/javascript">

    $(document).ready(function(){

        cpu();
    });
 /*   function sucess(){
        var myChart = echarts.init(document.getElementById('main'));
        // 显示标题，图例和空的坐标轴
        myChart.setOption({
            title: {
                text: 'cpu性能监控'
            },
            tooltip: {},
            legend: {
                data: ['cpu使用率']
            },
            xAxis: {
                data: []
            },
            yAxis: {},
            series: [{
                name: '网元处理成功率',
                type: 'bar',
                data: []
            }],
            toolbox: {
                show: true,
                feature: {
                    dataView:{
                        show:true
                    },
                    restore:{
                        show:true
                    },
                    dataZoom:{
                        show:true
                    },
                    saveAsImage: {
                        show: true
                    },
                    magicType: {
                        type: ['line', 'bar']
                    }
                }
            }

        });
*/

       function cpu(){
           var myChart = echarts.init(document.getElementById('main'));
           option = {
               tooltip : {
                   trigger: 'axis',
                   axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                       type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                   }
               },
               legend: {
                   data:['直接访问','邮件营销','联盟广告','视频广告','搜索引擎','百度','谷歌','必应','其他']
               },
               toolbox: {
                   show : true,
                   orient: 'vertical',
                   x: 'right',
                   y: 'center',
                   feature : {
                       mark : {show: true},
                       dataView : {show: true, readOnly: false},
                       magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                       restore : {show: true},
                       saveAsImage : {show: true}
                   }
               },
               calculable : true,
               xAxis : [
                   {
                       type : 'category',
                       data : ['周一','周二','周三','周四','周五','周六','周日']
                   }
               ],
               yAxis : [
                   {
                       type : 'value'
                   }
               ],
               series : [
                   {
                       name:'直接访问',
                       type:'bar',
                       data:[320, 332, 301, 334, 390, 330, 320]
                   },
                   {
                       name:'邮件营销',
                       type:'bar',
                       stack: '广告',
                       data:[120, 132, 101, 134, 90, 230, 210]
                   },
                   {
                       name:'联盟广告',
                       type:'bar',
                       stack: '广告',
                       data:[220, 182, 191, 234, 290, 330, 310]
                   },
                   {
                       name:'视频广告',
                       type:'bar',
                       stack: '广告',
                       data:[150, 232, 201, 154, 190, 330, 410]
                   },
                   {
                       name:'搜索引擎',
                       type:'bar',
                       data:[862, 1018, 964, 1026, 1679, 1600, 1570],
                       markLine : {
                           itemStyle:{
                               normal:{
                                   lineStyle:{
                                       type: 'dashed'
                                   }
                               }
                           },
                           data : [
                               [{type : 'min'}, {type : 'max'}]
                           ]
                       }
                   },
                   {
                       name:'百度',
                       type:'bar',
                       barWidth : 5,
                       stack: '搜索引擎',
                       data:[620, 732, 701, 734, 1090, 1130, 1120]
                   },
                   {
                       name:'谷歌',
                       type:'bar',
                       stack: '搜索引擎',
                       data:[120, 132, 101, 134, 290, 230, 220]
                   },
                   {
                       name:'必应',
                       type:'bar',
                       stack: '搜索引擎',
                       data:[60, 72, 71, 74, 190, 130, 110]
                   },
                   {
                       name:'其他',
                       type:'bar',
                       stack: '搜索引擎',
                       data:[62, 82, 91, 84, 109, 110, 120]
                   }
               ]
           };


        myChart.setOption(option)




       }


        myChart.showLoading();    //数据加载完之前先显示一段简单的loading动画

        var names = [];    //类别数组（实际用来盛放X轴坐标值）
        var nums = [];    //成功率数组（实际用来盛放Y坐标值）
        $.ajax({
            type: "post",
            async: true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
            url: "${pageContext.request.contextPath}/getCpu",    //请求发送到TestServlet处
            data: {},
            dataType: "json",        //返回数据形式为json
            success: function (result) {
                alert(result);
                //请求成功时执行该函数内容，result即为服务器返回的json对象\

                if (result) {
                    for (var i = 0; i < result.length; i++) {
                        names.push(result[i].ip);    //挨个取出类别并填入类别数组
                        nums.push(result[i].cpu_usage);    //挨个取出销量并填入销量数组
                    }
                    myChart.hideLoading();    //隐藏加载动画
                    myChart.setOption({        //加载数据图表
                        xAxis: {
                            data: names
                        },
                        series: [{
                            // 根据名字对应到相应的系列
                            name: '网元处理成功率',
                            data: nums
                        }]
                    });

                }

            },
            error: function (errorMsg) {
                //请求失败时执行该函数
                alert("图表请求数据失败!");
                myChart.hideLoading();
            }
        })

    }
</script>
</body>
</html>