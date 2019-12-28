/**
 * Created by yxw on 2019/12/20.
 */

function secload(){
    //init_bd_sec();
    init_pmsec();
    init_rainsec();
    init_tempsec();
    init_wlevelsec();
    init_humsec();
    init_sectype();
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
                                color: function (y_data) {
                                    var index_color = y_data.value;
                                    if (index_color <= 50 ) {
                                        return '#00fc1a';
                                    }
                                    if (index_color > 50 && index_color <=100 ) {
                                        return '#FFFF00';
                                    }
                                    if(index_color > 100 && index_color <= 150 ) {
                                        return '#FFA500';
                                    }
                                    if(index_color > 150 && index_color <= 200 ) {
                                        return '#fe4365';
                                    }
                                    if(index_color > 200 ) {
                                        return '#000000';
                                    }
                                },
                                lineStyle: {color: '#00fc1a' }//改变折线颜色
                            }
                        },
                        data: y_data,
                        markLine: {
                            data: [
                                {label:{
                                        formatter:'预警值:100',
                                        position:'middle',
                                    },
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
                                color: function (y_data) {
                                    var index_color = y_data.value;

                                    if (index_color >= 20) {
                                        return '#fe4365';
                                    } else {
                                        return '#25daba';
                                    }
                                },
                                lineStyle: {color: '#8cd5c2' }//改变折线颜色
                            }
                        },
                        data: y_data,
                        markLine: {
                            data: [
                                {
                                    label:{
                                        formatter:'预警值:20mm',
                                        position:'middle',
                                    },
                                    yAxis: '20',
                                    lineStyle: {
                                        color: '#900',
                                        type: 'solid'
                                    },
                                    name: '报警值'
                                }
                            ]
                        }
                    }
                ]
            };

            rainsec.setOption(rain_option);
        }
    });
}

function init_wlevelsec() {
    var wlevelsec = echarts.init(document.getElementById('wlvlsec'));
    $.ajax({
        type: "GET",
        url: "/api/security/wlevel",
        datatype: "JSON",
        success: function (data) {
            var wlevelsec_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (var i = 0; i < wlevelsec_data.length; i++) {
                if (wlevelsec_data[i].wlevel == '') {
                    x_data.push('未知');
                } else {
                    y_data.push(parseFloat(wlevelsec_data[i].wlevel));
                    x_data.push(wlevelsec_data[i].time);
                }
            }
            /*console.log(x_data);*/
            /*console.log(y_data);*/
            wlevel_option = {
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
                                color: function (y_data) {
                                    var index_color = y_data.value;

                                    if (index_color >= 3600) {
                                        return '#fe4365';
                                    } else {
                                        return '#00BFFF';
                                    }
                                },
                                lineStyle: {color: '#00BFFF' }//改变折线颜色
                            }
                        },
                        data: y_data,
                        markLine: {
                            data: [
                                {
                                    label:{
                                        formatter:'预警值:3600mm',
                                        position:'middle',
                                    },
                                    yAxis:'3600',
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
            wlevelsec.setOption(wlevel_option);
        }
    });
}

function init_tempsec() {
    var tempsec = echarts.init(document.getElementById('tempsec'));
    $.ajax({
        type: "GET",
        url: "/api/security/temp",
        datatype: "JSON",
        success: function (data) {
            var tempsec_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (var i = 0; i < tempsec_data.length; i++) {
                if (tempsec_data[i].temp == '') {
                    x_data.push('未知');
                } else {
                    y_data.push(parseFloat(tempsec_data[i].temp));
                    x_data.push(tempsec_data[i].time);
                }
            }
            /*console.log(x_data);*/
            /*console.log(y_data);*/
            temp_option = {
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
                                color: function (y_data) {
                                    var index_color = y_data.value;

                                    if (index_color >= 35) {
                                        return '#fe4365';
                                    }
                                     else if (index_color < 4) {
                                        return '#00BFFF';
                                    }
                                    else {
                                        return '#FFFF00';
                                    }
                                },
                                lineStyle: {color: '#FFFF00' }//改变折线颜色
                            }
                        },
                        data: y_data,
                        markLine: {
                            data: [
                                {
                                    label:{
                                        formatter:'预警值:35℃',
                                        position:'middle',
                                    },
                                    yAxis:'35',
                                    lineStyle:{
                                        color:'#900',
                                        type: 'solid'
                                    },
                                    name:'报警值'
                                },
                                {
                                    label:{
                                        formatter:'预警值:4℃',
                                        position:'middle',
                                    },
                                    yAxis:'4',
                                    lineStyle:{
                                        color:'#87CEFA',
                                        type: 'solid'
                                    },
                                    name:'报警值'
                                }
                            ]
                        }
                    },
                ]
            };
            tempsec.setOption(temp_option);
        }
    });
}

function init_humsec() {
    var humsec = echarts.init(document.getElementById('humsec'));
    $.ajax({
        type: "GET",
        url: "/api/security/hum",
        datatype: "JSON",
        success: function (data) {
            var humsec_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (var i = 0; i < humsec_data.length; i++) {
                if (humsec_data[i].hum == '') {
                    x_data.push('未知');
                } else {
                    y_data.push(parseFloat(humsec_data[i].hum));
                    x_data.push(humsec_data[i].time);
                }
            }
            /*console.log(x_data);*/
            /*console.log(y_data);*/
            hum_option = {
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
                                color: function (y_data) {
                                    var index_color = y_data.value;

                                    if (index_color < 25) {
                                        return '#fe4365';
                                    }
                                    else if (index_color >= 80) {
                                        return '#00BFFF';
                                    }
                                    else {
                                        return '#7CFC00';
                                    }
                                },
                                lineStyle: {color: '#7CFC00' }//改变折线颜色
                            }
                        },
                        data: y_data,
                        markLine: {
                            data: [
                                {
                                    label:{
                                        formatter:'预警值:80%',
                                        position:'middle',
                                    },
                                    yAxis:'80',
                                    lineStyle:{
                                        color:'#00BFFF',
                                        type: 'solid'
                                    },
                                    name:'报警值'
                                },
                                {
                                    label:{
                                        formatter:'预警值:25%',
                                        position:'middle',
                                    },
                                    yAxis:'25',
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
            humsec.setOption(hum_option);
        }
    });
}

function init_sectype() {
    var sectype = echarts.init(document.getElementById('sectype'));
    $.ajax({
        type: "GET",
        url: "/api/security/sectype",
        datatype: "JSON",
        success: function (data) {
            var sectype_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (var i = 0; i < sectype_data.length; i++) {
                if (sectype_data[i].marea == '') {
                    x_data.push('未知');
                } else {
                    x_data.push(sectype_data[i].content);
                    y_data.push(parseInt(sectype_data[i].secnum));
                    /*var y = new Object();
                     y.name = bdsygroup_data[i].scategory;
                     y.value = parseInt(bdsygroup_data[i].bcount);
                     y_data.push(y);*/
                }
            }
            /*console.log(bdsygroup_data);*/
            /*console.log(x_data);
             console.log(y_data);*/
            sectype_option = {
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    x: 'left',
                    data: x_data
                },
                calculable: true,
                series: [
                    {
                        name: '访问来源',
                        type: 'pie',
                        radius: '55%',
                        center: ['50%', '60%'],
                        data: [
                            /*y_data*/
                            {value: y_data[0], name: x_data[0]},
                            {value: y_data[1], name: x_data[1]},
                            {value: y_data[2], name: x_data[2]},
                            {value: y_data[3], name: x_data[3]},
                            {value: y_data[4], name: x_data[4]},
                        ]
                    }
                ]
            };
            sectype.setOption(sectype_option);
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