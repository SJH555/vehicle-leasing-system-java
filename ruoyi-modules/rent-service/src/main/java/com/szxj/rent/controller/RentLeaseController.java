package com.szxj.rent.controller;


import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.szxj.rent.domain.RentLease;
import com.szxj.rent.service.IRentLeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 租赁订单Controller
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@RestController
@RequestMapping("/lease")
public class RentLeaseController extends BaseController
{
    @Autowired
    private IRentLeaseService rentLeaseService;

    /**
     * 查询租赁订单列表
     */
    @RequiresPermissions("service:lease:list")
    @GetMapping("/list")
    public TableDataInfo list(RentLease rentLease)
    {
        startPage();
        List<RentLease> list = rentLeaseService.selectRentLeaseList(rentLease);
        return getDataTable(list);
    }

    /**
     * 导出租赁订单列表
     */
    @RequiresPermissions("service:lease:export")
    @Log(title = "租赁订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RentLease rentLease)
    {
        List<RentLease> list = rentLeaseService.selectRentLeaseList(rentLease);
        ExcelUtil<RentLease> util = new ExcelUtil<RentLease>(RentLease.class);
        util.exportExcel(response, list, "租赁订单数据");
    }

    /**
     * 获取租赁订单详细信息
     */
    @RequiresPermissions("service:lease:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(rentLeaseService.selectRentLeaseById(id));
    }

    /**
     * 新增租赁订单
     */
    @RequiresPermissions("service:lease:add")
    @Log(title = "租赁订单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RentLease rentLease)
    {
        return toAjax(rentLeaseService.insertRentLease(rentLease));
    }

    /**
     * 修改租赁订单
     */
    @RequiresPermissions("service:lease:edit")
    @Log(title = "租赁订单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RentLease rentLease)
    {
        return toAjax(rentLeaseService.updateRentLease(rentLease));
    }

    /**
     * 删除租赁订单
     */
    @RequiresPermissions("service:lease:remove")
    @Log(title = "租赁订单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(rentLeaseService.deleteRentLeaseByIds(ids));
    }
}
