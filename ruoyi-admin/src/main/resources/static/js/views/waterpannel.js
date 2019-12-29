function  waterload() {
    //首页图表 水质全部可视化
    //init_waters()
}

// function init_waters() {
//     $.ajax({
//         type: "GET",
//         url: "/api/waterdata/",
//         dataType: "json",
//         success: function (data_bt) {
//             var pre_data = data_bt.data;
//             var rain = new Array();
//             var flow = new Array();
//             var wlevel = new Array();
//             var ph = new Array();
//             var pm = new Array();
//             var temp = new Array();
//             var hum = new Array();
//             var common_time = new Array();
//
//             // 遍历服务器数据显示到页面
//
//             for (i in pre_data){
//                 rain.push(pre_data[i].rain);
//                 flow.push(pre_data[i].flow);
//                 wlevel.push(pre_data[i].wlevel);
//                 ph.push(pre_data[i].ph);
//                 pm.push(pre_data[i].pm);
//                 temp.push(pre_data[i].temp);
//                 hum.push(pre_data[i].hum);
//                 common_time.push(pre_data[i].time);
//             }
//         }
//     )
//
// }