package com.ruoyi.web.controller.iot;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.utils.ExcelUtil;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Torrent;
import com.ruoyi.iot.domain.Waterpannel;
import com.ruoyi.iot.service.IWaterpannelService;
import com.ruoyi.iot.service.impl.WaterpannelServiceImpl;
import com.ruoyi.rivervis.domain.EnvData;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/iot/waterpannel")
public class WaterPannelController extends BaseController {
    private String prefix = "iot/waterpannel";

    @Autowired

    private IWaterpannelService waterpannelService;

   //private WaterpannelServiceImpl waterpannelServiceImpl;

    @GetMapping()
    public String water() {
        return prefix + "/waterpannel";
    }

    /**
     * 导出水质监测列表
     */

    @PostMapping ("/view")
    @ResponseBody
    public TableDataInfo List() {
        startPage();
        List<Waterpannel> list =waterpannelService.selectWaterpannelList();
        return getDataTable(list);
    }

    @PostMapping ("/list")
    public String selectListById(Model model,@RequestParam("id") Integer id){
        model.addAttribute("data",waterpannelService.selectListById(id));
        return "iot/waterpannel/wselect";
    }

//    @GetMapping("/add")
//    public String add()
//    {
//        return prefix + "/add";
//    }
//
//    @RequiresPermissions("iot:waterpannel:add")
//    @Log(title = "水质监测", businessType = BusinessType.INSERT)
//    @PostMapping("/add")
//    @ResponseBody
//    public AjaxResult addSave(Waterpannel waterpannel)
//    {
//
//        return toAjax(waterpannelService.insertWaterpannel(waterpannel));
//    }

    /**
     * 修改水质监测
     */
//    @GetMapping("/edit/{id}")
//    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
//    {
//        Waterpannel waterpannel = waterpannelService.selectWaterpannelById(id);
//        mmap.put("waterpannel", waterpannel);
//        return prefix + "/edit";
//    }

//    /**
//     * 修改保存水质监测
//     */
//    @RequiresPermissions("iot:waterpannel:edit")
//    @Log(title = "水质监测", businessType = BusinessType.UPDATE)
//    @PostMapping("/edit")
//    @ResponseBody
//    public AjaxResult editSave(Waterpannel waterpannel)
//    {
//        return toAjax(waterpannelService.updateWaterpannel(waterpannel));
//    }



}

