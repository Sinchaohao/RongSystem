/**
 * Created by yxw on 2019/12/20.
 */

function secload(){
    //init_bd_sec();
    init_pmsec();
    init_rainsec();
}

function init_pmsec() {
    var pmsec = echarts.init(document.getElementById('pmsec'));
    $.ajax({
        type: "GET",
        url: "/api/security/pm",
        datatype: "JSON",
        success: function (data) {
            var pmsec_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (var i = 0; i < pmsec_data.length; i++) {
                if (pmsec_data[i].pm == '') {
                    x_data.push('未知');
                } else {
                    y_data.push(parseFloat(pmsec_data[i].pm));
                    x_data.push(pmsec_data[i].time);
                }
            }
            /*console.log(x_data);*/
            /*console.log(y_data);*/
            pm_option = {
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
                        itemStyle: {
                            normal: {
                                color: function(y_data) {
                                    var index_color = y_data.value;

                                    if(index_color>=100){
                                        return '#fe4365';
                                    }else {
                                        return '#25daba';
                                    }


                                }
                            }
                        },
                        data: y_data,
                        markLine: {
                            data: [
                                {
                                    yAxis:'100',
                                    lineStyle:{
                                        color:'#900',
                                        type: 'solid'
                                    },
                                    name:'报警值'
                                }
                            ]
                        }
                    },
                ]
            };
            pmsec.setOption(pm_option);
        }
    });
}

function init_rainsec() {
    var rainsec = echarts.init(document.getElementById('rainsec'));
    $.ajax({
        type: "GET",
        url: "/api/security/rain",
        datatype: "JSON",
        success: function (data) {
            var rainsec_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (var i = 0; i < rainsec_data.length; i++) {
                if (rainsec_data[i].rain == '') {
                    x_data.push('未知');
                } else {
                    y_data.push(parseFloat(rainsec_data[i].rain));
                    x_data.push(rainsec_data[i].time);
                }
            }
            /*console.log(x_data);*/
            /*console.log(y_data);*/
            rain_option = {
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
                        itemStyle: {
                            normal: {
                                color: function(y_data) {
                                    var index_color = y_data.value;

                                    if(index_color>=20){
                                        return '#fe4365';
                                    }else {
                                        return '#25daba';
                                    }


                                }
                            }
                        },
                        data: y_data,
                        markLine: {
                            data: [
                                {
                                    yAxis:'20',
                                    lineStyle:{
                                        color:'#900',
                                        type: 'solid'
                                    },
                                    name:'报警值'
                                }
                            ]
                        }
                    },
                ]
            };
            rainsec.setOption(rain_option);
        }
    });
}


/*function init_bd_sec(){
    $.ajax({
        type: "GET",
        url: "/api/iot/sec",
        dataType: "json",
        success: function (data) {
            $("#sec_flush_time").html('<span>' + data.time + ' 更新' +
                '</span>');
            var l_sec = data.data;
            var mid = '';
            for (sec in l_sec){
                mid += '<tr>' +
                    '<td>' + l_sec[sec].mid +
                    '</td>' +
                    '<td>' + l_sec[sec].content +
                    '</td>' +
                    '</tr>';
            }

            $("#sec_log").html('<table class="table table-hover">' +
                '<thead>' +
                '<tr>' +
                '<th>序号</th>' +
                '<th>状态</th>' +
                '</tr>' +
                '</thead>' +
                '<tbody>' + mid +
                '</tbody>' +
                '</table>');
        }
    })
}*/