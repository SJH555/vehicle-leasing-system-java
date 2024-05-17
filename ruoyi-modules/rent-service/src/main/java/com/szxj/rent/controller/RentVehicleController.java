package com.szxj.rent.controller;


import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.szxj.rent.domain.RentVehicle;
import com.szxj.rent.domain.dto.RentVehicleDto;
import com.szxj.rent.service.IRentVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 车辆信息Controller
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@RestController
@RequestMapping("/vehicle")
public class RentVehicleController extends BaseController
{
    @Autowired
    private IRentVehicleService rentVehicleService;

    /**
     * 查询车辆信息列表
     */
    @RequiresPermissions("rent:vehicle:list")
    @GetMapping("/list")
    public TableDataInfo list(RentVehicleDto rentVehicle)
    {
        startPage();
        List<RentVehicle> list = rentVehicleService.selectRentVehicleList(rentVehicle);
        return getDataTable(list);
    }

    /**
     * 导出车辆信息列表
     */
    @RequiresPermissions("service:vehicle:export")
    @Log(title = "车辆信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RentVehicle rentVehicle)
    {
        List<RentVehicle> list = rentVehicleService.selectRentVehicleList(rentVehicle);
        ExcelUtil<RentVehicle> util = new ExcelUtil<RentVehicle>(RentVehicle.class);
        util.exportExcel(response, list, "车辆信息数据");
    }

    /**
     * 获取车辆信息详细信息
     */
    @RequiresPermissions("service:vehicle:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(rentVehicleService.selectRentVehicleById(id));
    }

    /**
     * 新增车辆信息
     */
    @RequiresPermissions("service:vehicle:add")
    @Log(title = "车辆信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RentVehicle rentVehicle)
    {
        return toAjax(rentVehicleService.insertRentVehicle(rentVehicle));
    }

    /**
     * 修改车辆信息
     */
    @RequiresPermissions("service:vehicle:edit")
    @Log(title = "车辆信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RentVehicle rentVehicle)
    {
        return toAjax(rentVehicleService.updateRentVehicle(rentVehicle));
    }

    /**
     * 删除车辆信息
     */
    @RequiresPermissions("service:vehicle:remove")
    @Log(title = "车辆信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(rentVehicleService.deleteRentVehicleByIds(ids));
    }
}
