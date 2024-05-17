package com.szxj.rent.controller;


import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.szxj.rent.domain.RentVehicleMaintenance;
import com.szxj.rent.service.IRentVehicleMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 车辆维保信息Controller
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@RestController
@RequestMapping("/maintenance")
public class RentVehicleMaintenanceController extends BaseController
{
    @Autowired
    private IRentVehicleMaintenanceService rentVehicleMaintenanceService;

    /**
     * 查询车辆维保信息列表
     */
    @RequiresPermissions("service:maintenance:list")
    @GetMapping("/list")
    public TableDataInfo list(RentVehicleMaintenance rentVehicleMaintenance)
    {
        startPage();
        List<RentVehicleMaintenance> list = rentVehicleMaintenanceService.selectRentVehicleMaintenanceList(rentVehicleMaintenance);
        return getDataTable(list);
    }

    /**
     * 导出车辆维保信息列表
     */
    @RequiresPermissions("service:maintenance:export")
    @Log(title = "车辆维保信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RentVehicleMaintenance rentVehicleMaintenance)
    {
        List<RentVehicleMaintenance> list = rentVehicleMaintenanceService.selectRentVehicleMaintenanceList(rentVehicleMaintenance);
        ExcelUtil<RentVehicleMaintenance> util = new ExcelUtil<RentVehicleMaintenance>(RentVehicleMaintenance.class);
        util.exportExcel(response, list, "车辆维保信息数据");
    }

    /**
     * 获取车辆维保信息详细信息
     */
    @RequiresPermissions("service:maintenance:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(rentVehicleMaintenanceService.selectRentVehicleMaintenanceById(id));
    }

    /**
     * 新增车辆维保信息
     */
    @RequiresPermissions("service:maintenance:add")
    @Log(title = "车辆维保信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RentVehicleMaintenance rentVehicleMaintenance)
    {
        return toAjax(rentVehicleMaintenanceService.insertRentVehicleMaintenance(rentVehicleMaintenance));
    }

    /**
     * 修改车辆维保信息
     */
    @RequiresPermissions("service:maintenance:edit")
    @Log(title = "车辆维保信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RentVehicleMaintenance rentVehicleMaintenance)
    {
        return toAjax(rentVehicleMaintenanceService.updateRentVehicleMaintenance(rentVehicleMaintenance));
    }

    /**
     * 删除车辆维保信息
     */
    @RequiresPermissions("service:maintenance:remove")
    @Log(title = "车辆维保信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(rentVehicleMaintenanceService.deleteRentVehicleMaintenanceByIds(ids));
    }
}
