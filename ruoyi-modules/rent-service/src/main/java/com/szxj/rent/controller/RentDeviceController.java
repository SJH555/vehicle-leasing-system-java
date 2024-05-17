package com.szxj.rent.controller;


import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.szxj.rent.domain.RentDevice;
import com.szxj.rent.service.IRentDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 车载设备信息Controller
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@RestController
@RequestMapping("/device")
public class RentDeviceController extends BaseController
{
    @Autowired
    private IRentDeviceService rentDeviceService;

    /**
     * 查询车载设备信息列表
     */
    @RequiresPermissions("service:device:list")
    @GetMapping("/list")
    public TableDataInfo list(RentDevice rentDevice)
    {
        startPage();
        List<RentDevice> list = rentDeviceService.selectRentDeviceList(rentDevice);
        return getDataTable(list);
    }

    /**
     * 导出车载设备信息列表
     */
    @RequiresPermissions("service:device:export")
    @Log(title = "车载设备信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RentDevice rentDevice)
    {
        List<RentDevice> list = rentDeviceService.selectRentDeviceList(rentDevice);
        ExcelUtil<RentDevice> util = new ExcelUtil<RentDevice>(RentDevice.class);
        util.exportExcel(response, list, "车载设备信息数据");
    }

    /**
     * 获取车载设备信息详细信息
     */
    @RequiresPermissions("service:device:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(rentDeviceService.selectRentDeviceById(id));
    }

    /**
     * 新增车载设备信息
     */
    @RequiresPermissions("service:device:add")
    @Log(title = "车载设备信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RentDevice rentDevice)
    {
        return toAjax(rentDeviceService.insertRentDevice(rentDevice));
    }

    /**
     * 修改车载设备信息
     */
    @RequiresPermissions("service:device:edit")
    @Log(title = "车载设备信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RentDevice rentDevice)
    {
        return toAjax(rentDeviceService.updateRentDevice(rentDevice));
    }

    /**
     * 删除车载设备信息
     */
    @RequiresPermissions("service:device:remove")
    @Log(title = "车载设备信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(rentDeviceService.deleteRentDeviceByIds(ids));
    }
}
