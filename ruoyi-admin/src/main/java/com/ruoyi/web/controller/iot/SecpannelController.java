package com.ruoyi.web.controller.iot;

import com.ruoyi.iot.domain.SecArea;
import com.ruoyi.iot.domain.SecAreaGrouping;
import com.ruoyi.broad.domain.BroadMessage;
import com.ruoyi.iot.service.ISecAreaGroupingService;
import com.ruoyi.broad.service.IMessageService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.service.ISecAreaService;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.service.ISysUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2019/8/2.
 * @author cx
 * 分组管理 控制层
 */
@Controller
@RequestMapping("/iot/secpannel")
public class SecpannelController extends BaseController {

    private String prefix = "iot/secpannel";

    @Autowired
    private ISecAreaGroupingService iSecAreaGroupingService;

    @Autowired
    private ISysUserService iSysUserService;

    //@RequiresPermissions("iot:secpannel:view")
    @GetMapping()
    public String areaGrouping()
    {
        return prefix + "/bSecpannel";
    }

    @Autowired
    private IMessageService messageService;

    @Autowired
    private ISecAreaService areaService;

    @PostMapping("/list")
    @Log(title = "分组管理列表")
    //@RequiresPermissions("iot:secpannel:list")
    @ResponseBody
    public TableDataInfo list(SecAreaGrouping secAreaGrouping)
    {
        SysUser currentUser = ShiroUtils.getSysUser();  //从session中获取当前登陆用户的userid
        Long userid = currentUser.getUserId();
        int returnid = new Long(userid).intValue();
        int roleid = iSysUserService.selectRoleid(returnid); //通过所获取的userid去广播用户表中查询用户所属区域的Roleid
        if(roleid == 1)
        {
            startPage();
            List<SecAreaGrouping> list = iSecAreaGroupingService.listAreaGrouping(secAreaGrouping);
            return getDataTable(list);
        }else {
            startPage();
            secAreaGrouping.setUid(userid);
            List<SecAreaGrouping> list = iSecAreaGroupingService.listAreaGrouping(secAreaGrouping);
            return getDataTable(list);
        }
    }

    /**
     * 加载部门列表树
     */
    @GetMapping("/treeData")
    @ResponseBody
    public List<Map<String, Object>> treeData()
    {
        List<Map<String, Object>> tree = areaService.selectAreaTree(new SecArea());
        return tree;
    }

    /**
     * @author cx
     * @Description 此删除方式可以批量删除，可以单独删除
     * @param ids
     * 注意 这个地方的参数一定要写ids 和前端绑定的固定格式
     */
    @PostMapping("/remove")
    @Log(title = "分组管理删除",businessType = BusinessType.DELETE)
    //@RequiresPermissions("iot:secpannel:remove")
    @ResponseBody
    public AjaxResult removeAreagrouping(String ids)
    {
        return toAjax(iSecAreaGroupingService.deleteAreaGroupingByIds(ids));
    }

    @GetMapping("/add")
    public String addareaGrouping()
    {
        return prefix + "/add";
    }
    @Log(title = "新增分组管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SecAreaGrouping secAreaGrouping)
    {
        return toAjax(iSecAreaGroupingService.insertAreaGrouping(secAreaGrouping));
    }

    /**
     * 修改分组管理记录
     */
    @GetMapping("/edit/{aid}")
    public String edit(@PathVariable("aid") String aid, ModelMap mmap)
    {
        SecAreaGrouping secAreaGrouping = iSecAreaGroupingService.selectAreaGroupingByAid(aid);
        mmap.put("areaGrouping", secAreaGrouping);
        return prefix + "/edit";
    }

    /**
     * 修改保存分组管理记录
     */
    @Log(title = "分组管理记录保存", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SecAreaGrouping secAreaGrouping)
    {
        return toAjax(iSecAreaGroupingService.updateAreaGrouping(secAreaGrouping));
    }

    /**
     * 加载特殊分组及终端列表树
     */
    @GetMapping("/treeData1")
    @ResponseBody
    public List<Map<String, Object>> treeData1() {
        List<Map<String, Object>> tree = messageService.selectMessageList((new BroadMessage()));
        return tree;
    }

}