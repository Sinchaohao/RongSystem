/**
 * Created by yxw on 2019/12/20.
 */

function secload(){
    //init_bd_sec();
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