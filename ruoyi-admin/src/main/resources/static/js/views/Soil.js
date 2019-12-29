function secload(){
init_watersec()
}
function init_watersec() {
    var watersec = echarts.init(document.getElementById('watersec'));
    $.ajax({
        type: "GET",
        url: "/api/iot/water",
        datatype: "JSON",
        success: function (data) {
            var watersec_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (var i = 0; i < watersec_data.length; i++) {
                if (watersec_data[i].date == '') {
                    x_data.push('未知');
                } else {
                    y_data.push(parseInt(watersec_data[i].water));
                    x_data.push(watersec_data[i].date);
                }
            }
            /*console.log(x_data);*/
            /*console.log(y_data);*/
            option = {
                color: ['#06edfc'],
                tooltip: {
                    trigger: 'axis'
                },
                toolbox: {
                    show: true,
                    feature: {
                        magicType: {show: true, type: ['line', 'bar']},
                    }
                },
                calculable: true,
                grid: {
                    left: '3%',
                    right: '3%',
                    top: '5%',
                    bottom: '0%',
                    containLabel: true
                },
                xAxis: [
                    {
                        type: 'category',
                        boundaryGap: false,
                        data: x_data,
                    }
                ],
                yAxis: [
                    {
                        type: 'value',
                        axisLabel: {
                            formatter: '{value}'
                        }
                    }
                ],
                series: [
                    {
                        type: 'line',
                        data: y_data,
                        markLine: {
                            data: [
                                {type: 'average', name: '平均值'}
                            ]
                        }
                    },
                ]
            };
            watersec.setOption(option);
        }
    });
}