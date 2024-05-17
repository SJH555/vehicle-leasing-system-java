package com.szxj.rent.controller;

import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.szxj.rent.domain.RentVehicleTrajectory;
import com.szxj.rent.service.IRentVehicleTrajectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 行车轨迹Controller
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@RestController
@RequestMapping("/trajectory")
public class RentVehicleTrajectoryController extends BaseController
{
    @Autowired
    private IRentVehicleTrajectoryService rentVehicleTrajectoryService;

    /**
     * 查询行车轨迹列表
     */
    @RequiresPermissions("service:trajectory:list")
    @GetMapping("/list")
    public TableDataInfo list(RentVehicleTrajectory rentVehicleTrajectory)
    {
        startPage();
        List<RentVehicleTrajectory> list = rentVehicleTrajectoryService.selectRentVehicleTrajectoryList(rentVehicleTrajectory);
        return getDataTable(list);
    }

    /**
     * 导出行车轨迹列表
     */
    @RequiresPermissions("service:trajectory:export")
    @Log(title = "行车轨迹", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RentVehicleTrajectory rentVehicleTrajectory)
    {
        List<RentVehicleTrajectory> list = rentVehicleTrajectoryService.selectRentVehicleTrajectoryList(rentVehicleTrajectory);
        ExcelUtil<RentVehicleTrajectory> util = new ExcelUtil<RentVehicleTrajectory>(RentVehicleTrajectory.class);
        util.exportExcel(response, list, "行车轨迹数据");
    }

    /**
     * 获取行车轨迹详细信息
     */
    @RequiresPermissions("service:trajectory:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(rentVehicleTrajectoryService.selectRentVehicleTrajectoryById(id));
    }

    /**
     * 新增行车轨迹
     */
    @RequiresPermissions("service:trajectory:add")
    @Log(title = "行车轨迹", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RentVehicleTrajectory rentVehicleTrajectory)
    {
        return toAjax(rentVehicleTrajectoryService.insertRentVehicleTrajectory(rentVehicleTrajectory));
    }

    /**
     * 修改行车轨迹
     */
    @RequiresPermissions("service:trajectory:edit")
    @Log(title = "行车轨迹", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RentVehicleTrajectory rentVehicleTrajectory)
    {
        return toAjax(rentVehicleTrajectoryService.updateRentVehicleTrajectory(rentVehicleTrajectory));
    }

    /**
     * 删除行车轨迹
     */
    @RequiresPermissions("service:trajectory:remove")
    @Log(title = "行车轨迹", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(rentVehicleTrajectoryService.deleteRentVehicleTrajectoryByIds(ids));
    }
}
