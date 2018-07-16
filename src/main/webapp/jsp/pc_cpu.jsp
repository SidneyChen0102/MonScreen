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
     function cpu(){
        var myChart = echarts.init(document.getElementById('main'));
        // 显示标题，图例和空的坐标轴
        myChart.setOption({
            title: {
                text: 'cpu性能监控'
            },
            tooltip: {
                trigger:'axis',
                axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                    type : 'line'        // 默认为直线，可选为：'line' | 'shadow'
                }
            },
            legend: {
                data: ['CPU使用率','CPU总量']
            },
            xAxis: {
                data: []
            },
            yAxis: {},
            series: [{
                name: 'CPU使用率',
                type: 'bar',
                itemStyle: {
                    normal: {
                        color: function(params) {
                            // build a color map as your need.
                            var colorList = [
                                '#C1232B','#B5C334','#FCCE10','#E87C25','#27727B',
                                '#FE8463','#9BCA63','#FAD860','#F3A43B','#60C0DD',
                                '#D7504B','#C6E579','#F4E001','#F0805A','#26C0C0'
                            ];
                            return colorList[params.dataIndex]
                        },
                        label: {
                            show: true,
                            position: 'top',
                            formatter: '{b}\n{c}'
                        }
                    }
                },
                data: []
            }


            ],
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