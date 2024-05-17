package com.szxj.rent.controller;

import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.szxj.rent.domain.RentVehicleViolation;
import com.szxj.rent.service.IRentVehicleViolationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 车辆异常信息Controller
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@RestController
@RequestMapping("/violation")
public class RentVehicleViolationController extends BaseController
{
    @Autowired
    private IRentVehicleViolationService rentVehicleViolationService;

    /**
     * 查询车辆异常信息列表
     */
    @RequiresPermissions("service:violation:list")
    @GetMapping("/list")
    public TableDataInfo list(RentVehicleViolation rentVehicleViolation)
    {
        startPage();
        List<RentVehicleViolation> list = rentVehicleViolationService.selectRentVehicleViolationList(rentVehicleViolation);
        return getDataTable(list);
    }

    /**
     * 导出车辆异常信息列表
     */
    @RequiresPermissions("service:violation:export")
    @Log(title = "车辆异常信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RentVehicleViolation rentVehicleViolation)
    {
        List<RentVehicleViolation> list = rentVehicleViolationService.selectRentVehicleViolationList(rentVehicleViolation);
        ExcelUtil<RentVehicleViolation> util = new ExcelUtil<RentVehicleViolation>(RentVehicleViolation.class);
        util.exportExcel(response, list, "车辆异常信息数据");
    }

    /**
     * 获取车辆异常信息详细信息
     */
    @RequiresPermissions("service:violation:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(rentVehicleViolationService.selectRentVehicleViolationById(id));
    }

    /**
     * 新增车辆异常信息
     */
    @RequiresPermissions("service:violation:add")
    @Log(title = "车辆异常信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RentVehicleViolation rentVehicleViolation)
    {
        return toAjax(rentVehicleViolationService.insertRentVehicleViolation(rentVehicleViolation));
    }

    /**
     * 修改车辆异常信息
     */
    @RequiresPermissions("service:violation:edit")
    @Log(title = "车辆异常信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RentVehicleViolation rentVehicleViolation)
    {
        return toAjax(rentVehicleViolationService.updateRentVehicleViolation(rentVehicleViolation));
    }

    /**
     * 删除车辆异常信息
     */
    @RequiresPermissions("service:violation:remove")
    @Log(title = "车辆异常信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(rentVehicleViolationService.deleteRentVehicleViolationByIds(ids));
    }
}
