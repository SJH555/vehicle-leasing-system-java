package com.szxj.rent.controller;

import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.szxj.rent.domain.RentVehicleType;
import com.szxj.rent.domain.vo.RentVehicleTypeVo;
import com.szxj.rent.service.IRentVehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 车辆配置Controller
 *
 * @author ruoyi
 * @date 2024-05-14
 */
@RestController
@RequestMapping("vehicle/type")
public class RentVehicleTypeController extends BaseController
{
    @Autowired
    private IRentVehicleTypeService rentVehicleTypeService;

    /**
     * 查询车辆配置列表
     */
    @RequiresPermissions("service:type:list")
    @GetMapping("/list")
    public TableDataInfo list(RentVehicleType rentVehicleType)
    {
//        startPage();
        List<RentVehicleTypeVo> list = rentVehicleTypeService.selectRentVehicleTypeList(rentVehicleType);
        return getDataTable(list);
    }

//    /**
//     * 导出车辆配置列表
//     */
//    @RequiresPermissions("service:type:export")
//    @Log(title = "车辆配置", businessType = BusinessType.EXPORT)
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, RentVehicleType rentVehicleType)
//    {
//        List<RentVehicleType> list = rentVehicleTypeService.selectRentVehicleTypeList(rentVehicleType);
//        ExcelUtil<RentVehicleType> util = new ExcelUtil<RentVehicleType>(RentVehicleType.class);
//        util.exportExcel(response, list, "车辆配置数据");
//    }

    /**
     * 获取车辆配置详细信息
     */
    @RequiresPermissions("service:type:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(rentVehicleTypeService.selectRentVehicleTypeById(id));
    }

    /**
     * 新增车辆配置
     */
    @RequiresPermissions("service:type:add")
    @Log(title = "车辆配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RentVehicleType rentVehicleType)
    {
        return toAjax(rentVehicleTypeService.insertRentVehicleType(rentVehicleType));
    }

    /**
     * 修改车辆配置
     */
    @RequiresPermissions("service:type:edit")
    @Log(title = "车辆配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RentVehicleType rentVehicleType)
    {
        return toAjax(rentVehicleTypeService.updateRentVehicleType(rentVehicleType));
    }

    /**
     * 删除车辆配置
     */
    @RequiresPermissions("service:type:remove")
    @Log(title = "车辆配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(rentVehicleTypeService.deleteRentVehicleTypeByIds(ids));
    }
}
