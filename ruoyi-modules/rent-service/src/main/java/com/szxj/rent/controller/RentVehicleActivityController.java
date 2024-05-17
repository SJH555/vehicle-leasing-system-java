package com.szxj.rent.controller;


import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.szxj.rent.domain.RentVehicleActivity;
import com.szxj.rent.service.IRentVehicleActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 车辆引擎活动Controller
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@RestController
@RequestMapping("/activity")
public class RentVehicleActivityController extends BaseController
{
    @Autowired
    private IRentVehicleActivityService rentVehicleActivityService;

    /**
     * 查询车辆引擎活动列表
     */
    @RequiresPermissions("service:activity:list")
    @GetMapping("/list")
    public TableDataInfo list(RentVehicleActivity rentVehicleActivity)
    {
        startPage();
        List<RentVehicleActivity> list = rentVehicleActivityService.selectRentVehicleActivityList(rentVehicleActivity);
        return getDataTable(list);
    }

    /**
     * 导出车辆引擎活动列表
     */
    @RequiresPermissions("service:activity:export")
    @Log(title = "车辆引擎活动", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RentVehicleActivity rentVehicleActivity)
    {
        List<RentVehicleActivity> list = rentVehicleActivityService.selectRentVehicleActivityList(rentVehicleActivity);
        ExcelUtil<RentVehicleActivity> util = new ExcelUtil<RentVehicleActivity>(RentVehicleActivity.class);
        util.exportExcel(response, list, "车辆引擎活动数据");
    }

    /**
     * 获取车辆引擎活动详细信息
     */
    @RequiresPermissions("service:activity:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(rentVehicleActivityService.selectRentVehicleActivityById(id));
    }

    /**
     * 新增车辆引擎活动
     */
    @RequiresPermissions("service:activity:add")
    @Log(title = "车辆引擎活动", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RentVehicleActivity rentVehicleActivity)
    {
        return toAjax(rentVehicleActivityService.insertRentVehicleActivity(rentVehicleActivity));
    }

    /**
     * 修改车辆引擎活动
     */
    @RequiresPermissions("service:activity:edit")
    @Log(title = "车辆引擎活动", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RentVehicleActivity rentVehicleActivity)
    {
        return toAjax(rentVehicleActivityService.updateRentVehicleActivity(rentVehicleActivity));
    }

    /**
     * 删除车辆引擎活动
     */
    @RequiresPermissions("service:activity:remove")
    @Log(title = "车辆引擎活动", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(rentVehicleActivityService.deleteRentVehicleActivityByIds(ids));
    }
}
