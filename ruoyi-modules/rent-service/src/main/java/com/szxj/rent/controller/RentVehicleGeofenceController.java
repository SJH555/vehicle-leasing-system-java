package com.szxj.rent.controller;


import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.szxj.rent.domain.RentVehicleGeofence;
import com.szxj.rent.service.IRentVehicleGeofenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 车辆电子围栏Controller
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@RestController
@RequestMapping("/geofence")
public class RentVehicleGeofenceController extends BaseController
{
    @Autowired
    private IRentVehicleGeofenceService rentVehicleGeofenceService;

    /**
     * 查询车辆电子围栏列表
     */
    @RequiresPermissions("service:geofence:list")
    @GetMapping("/list")
    public TableDataInfo list(RentVehicleGeofence rentVehicleGeofence)
    {
        startPage();
        List<RentVehicleGeofence> list = rentVehicleGeofenceService.selectRentVehicleGeofenceList(rentVehicleGeofence);
        return getDataTable(list);
    }

    /**
     * 导出车辆电子围栏列表
     */
    @RequiresPermissions("service:geofence:export")
    @Log(title = "车辆电子围栏", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RentVehicleGeofence rentVehicleGeofence)
    {
        List<RentVehicleGeofence> list = rentVehicleGeofenceService.selectRentVehicleGeofenceList(rentVehicleGeofence);
        ExcelUtil<RentVehicleGeofence> util = new ExcelUtil<RentVehicleGeofence>(RentVehicleGeofence.class);
        util.exportExcel(response, list, "车辆电子围栏数据");
    }

    /**
     * 获取车辆电子围栏详细信息
     */
    @RequiresPermissions("service:geofence:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(rentVehicleGeofenceService.selectRentVehicleGeofenceById(id));
    }

    /**
     * 新增车辆电子围栏
     */
    @RequiresPermissions("service:geofence:add")
    @Log(title = "车辆电子围栏", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RentVehicleGeofence rentVehicleGeofence)
    {
        return toAjax(rentVehicleGeofenceService.insertRentVehicleGeofence(rentVehicleGeofence));
    }

    /**
     * 修改车辆电子围栏
     */
    @RequiresPermissions("service:geofence:edit")
    @Log(title = "车辆电子围栏", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RentVehicleGeofence rentVehicleGeofence)
    {
        return toAjax(rentVehicleGeofenceService.updateRentVehicleGeofence(rentVehicleGeofence));
    }

    /**
     * 删除车辆电子围栏
     */
    @RequiresPermissions("service:geofence:remove")
    @Log(title = "车辆电子围栏", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(rentVehicleGeofenceService.deleteRentVehicleGeofenceByIds(ids));
    }
}
