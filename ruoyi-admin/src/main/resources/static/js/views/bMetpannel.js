


function metload() {
    init_hummet();//创建湿度二维表
    init_rainmet();//创建降雨二维表
    init_seemet();//创建可见度二维表
    init_rivermet();//创建水位二维表
    //init_3d_bt();//
}


function init_hummet() {
    var hummet = echarts.init(document.getElementById('hummet'));
    $.ajax({
        type: "GET",
        url: "/api/met/hum",
        datatype: "JSON",
        success: function (data) {
            var hummet_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (var i = 0; i < hummet_data.length; i++) {
                if (hummet_data[i].hum == '') {
                    x_data.push('未知');
                } else {
                    y_data.push(parseInt(hummet_data[i].sumhum));
                    x_data.push(hummet_data[i].hum);
                }
            }
            /*console.log(x_data);*/
            /*console.log(y_data);*/
            hum_option = {
                //鼠标移动到柱状图会显示内容
                tooltip: {
                    trigger: 'axis'
                    //触发类型；轴触发,axis则鼠标hover到一条柱状图显示全部数据,item则鼠标hover到折线点显示相应数据
                },
                //工具箱,只能一个
                toolbox: {
                    show: true,
                    feature: {
                        magicType: {show: true, type: ['line', 'bar']},
                    }
                },
                //是否用拖拽重计算特性
                calculable: true,
                //图标边缘
                grid: {
                    left: '3%',
                    right: '3%',
                    top: '5%',
                    bottom: '0%',
                    containLabel: true
                },
                xAxis: [
                    {
                        type: 'category',//坐标轴类型
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
                                    name:'湿度'
                                }
                            ]
                        }
                    },
                ]
            };
            hummet.setOption(hum_option);
        }
    });
}


function init_rainmet() {
    var rainmet = echarts.init(document.getElementById('rainmet'));
    $.ajax({
        type: "GET",
        url: "/api/met/rain",
        datatype: "JSON",
        success: function (data) {
            var rainmet_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (var i = 0; i < rainmet_data.length; i++) {
                if (rainmet_data[i].rname == '') {
                    x_data.push('未知');
                } else {
                    y_data.push(parseInt(rainmet_data[i].sumrain));
                    x_data.push(rainmet_data[i].rname);
                }
            }
            /*console.log(x_data);*/
            /*console.log(y_data);*/
            rain_option = {
                //鼠标移动到柱状图会显示内容
                tooltip: {
                    trigger: 'axis'
                    //触发类型；轴触发,axis则鼠标hover到一条柱状图显示全部数据,item则鼠标hover到折线点显示相应数据
                },
                //工具箱,只能一个
                toolbox: {
                    show: true,
                    feature: {
                        magicType: {show: true, type: ['line', 'bar']},
                    }
                },
                //是否用拖拽重计算特性
                calculable: true,
                //图标边缘
                grid: {
                    left: '3%',
                    right: '3%',
                    top: '5%',
                    bottom: '0%',
                    containLabel: true
                },
                xAxis: [
                    {
                        type: 'category',//坐标轴类型
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
                                    name:'降雨'
                                }
                            ]
                        }
                    },
                ]
            };
            rainmet.setOption(rain_option);
        }
    });
}

function init_seemet() {
    var seemet = echarts.init(document.getElementById('seemet'));
    $.ajax({
        type: "GET",
        url: "/api/met/see",
        datatype: "JSON",
        success: function (data) {
            var seemet_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (var i = 0; i < seemet_data.length; i++) {
                if (seemet_data[i].temp == '') {
                    x_data.push('未知');
                } else {
                    y_data.push(parseInt(seemet_data[i].sumtemp));
                    x_data.push(seemet_data[i].temp);
                }
            }
            /*console.log(x_data);*/
            /*console.log(y_data);*/
            see_option = {
                //鼠标移动到柱状图会显示内容
                tooltip: {
                    trigger: 'axis'
                    //触发类型；轴触发,axis则鼠标hover到一条柱状图显示全部数据,item则鼠标hover到折线点显示相应数据
                },
                //工具箱,只能一个
                toolbox: {
                    show: true,
                    feature: {
                        magicType: {show: true, type: ['line', 'bar']},
                    }
                },
                //是否用拖拽重计算特性
                calculable: true,
                //图标边缘
                grid: {
                    left: '3%',
                    right: '3%',
                    top: '5%',
                    bottom: '0%',
                    containLabel: true
                },
                xAxis: [
                    {
                        type: 'category',//坐标轴类型
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
                                    name:'可见度'
                                }
                            ]
                        }
                    },
                ]
            };
            seemet.setOption(see_option);
        }
    });
}

function init_rivermet() {
    var rivermet = echarts.init(document.getElementById('rivermet'));
    $.ajax({
        type: "GET",
        url: "/api/met/river",
        datatype: "JSON",
        success: function (data) {
            var rivermet_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (var i = 0; i < rivermet_data.length; i++) {
                if (rivermet_data[i].rname == '') {
                    x_data.push('未知');
                } else {
                    y_data.push(parseInt(rivermet_data[i].data));
                    x_data.push(rivermet_data[i].rname);
                }
            }
            /*console.log(x_data);*/
            /*console.log(y_data);*/
            river_option = {
                //鼠标移动到柱状图会显示内容
                tooltip: {
                    trigger: 'axis'
                    //触发类型；轴触发,axis则鼠标hover到一条柱状图显示全部数据,item则鼠标hover到折线点显示相应数据
                },
                //工具箱,只能一个
                toolbox: {
                    show: true,
                    feature: {
                        magicType: {show: true, type: ['line', 'bar']},
                    }
                },
                //是否用拖拽重计算特性
                calculable: true,
                //图标边缘
                grid: {
                    left: '3%',
                    right: '3%',
                    top: '5%',
                    bottom: '0%',
                    containLabel: true
                },
                xAxis: [
                    {
                        type: 'category',//坐标轴类型
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
                                    name:'水位'
                                }
                            ]
                        }
                    },
                ]
            };
            rivermet.setOption(river_option);
        }
    });
}

function init_3d_bt() {

    var pre_data;
    var area_group = new Array();
    var data_group = new Array();
    var xyz_data = new Array();
    var ec_3d_bt= echarts.init(document.getElementById('3d_bt'));

    $.ajax({
        type: "GET",
        url: "/api/device/sumterm",
        dataType: "json",
        success: function (data_bt) {
            pre_data = data_bt.data;
            var dp_temp = ['down','req','run','sum'];
            //确定area_group
            for ( area_name in pre_data){
                area_group.push(pre_data[area_name].aname);
            }
            //确定xyz_data
            for( pg_name in pre_data){
                var ag = area_group.indexOf(pre_data[pg_name].aname);
                var temp_data = pre_data[pg_name];
                delete temp_data["aname"];
                var temp_keys = Object.keys(temp_data);
                for(i=0;i<temp_keys.length;i++){
                    var this_key = temp_keys[i];
                    var pg = dp_temp.indexOf(temp_keys[i]);
                    var z_value = temp_data[this_key];
                    xyz_data.push([pg,ag,z_value])
                }
            }

            // 英文 - 中文替换
            for ( item in dp_temp){
                if(dp_temp[item].indexOf('sum') >= 0 ){
                    dp_temp[item] = dp_temp[item].replace('sum','设备总数');
                }else if(dp_temp[item].indexOf('run') >= 0 ){
                    dp_temp[item] = dp_temp[item].replace('run','运行数');
                }else if (dp_temp[item].indexOf('down') >= 0 ) {
                    dp_temp[item] = dp_temp[item].replace('down','停止数');
                }else if(dp_temp[item].indexOf('req') >= 0){
                    dp_temp[item] = dp_temp[item].replace('req','维修数');
                }
                data_group = dp_temp;
            }

            //确定3D_EC 坐标系与数据
            var a_cg =area_group;
            var data_cg = data_group;
            var data = xyz_data;
            ec_3d_bt_option = {
                tooltip: {
                    axisPointer :{
                        label:{
                            show: true
                        }
                    }
                },
                visualMap: {
                    max: 260,
                    inRange: {
                        color: ['#00868B','#00CD00', '#00FA9A', '#00CED1','#00F5FF','#00FFFF']
                    }
                },
                xAxis3D: {
                    type: 'category',
                    data: a_cg
                },
                yAxis3D: {
                    type: 'category',
                    data: data_cg
                },
                zAxis3D: {
                    type: 'value'
                },
                grid3D: {
                    boxWidth: 300,
                    boxDepth: 80,
                    axisLabel: {
                        interval: 0
                    },
                    viewControl: {
                        // projection: 'orthographic'
                        autoRotate: true
                    },
                    light: {
                        main: {
                            intensity: 1.2,
                            shadow: true
                        },
                        ambient: {
                            intensity: 0.3
                        }
                    }
                },
                series: [{
                    type: 'bar3D',
                    data: data.map(function (item) {
                        return {
                            value: [item[1], item[0], item[2]],
                        }
                    }),
                    shading: 'lambert',

                    label: {
                        textStyle: {
                            fontSize: 12,
                            borderWidth: 1
                        }
                    },

                    emphasis: {
                        label: {
                            textStyle: {
                                fontSize: 20,
                                color: '#900'
                            }
                        },
                        itemStyle: {
                            color: '#900'
                        }
                    }
                }]
            };
            ec_3d_bt.setOption(ec_3d_bt_option);
        }
    })

}