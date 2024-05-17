package com.szxj.rent.controller;


import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.szxj.rent.domain.RentCustomer;
import com.szxj.rent.service.IRentCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 客户信息Controller
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@RestController
@RequestMapping("/customer")
public class RentCustomerController extends BaseController
{
    @Autowired
    private IRentCustomerService rentCustomerService;

    /**
     * 查询客户信息列表
     */
    @RequiresPermissions("service:customer:list")
    @GetMapping("/list")
    public TableDataInfo list(RentCustomer rentCustomer)
    {
        startPage();
        List<RentCustomer> list = rentCustomerService.selectRentCustomerList(rentCustomer);
        return getDataTable(list);
    }

    /**
     * 导出客户信息列表
     */
    @RequiresPermissions("service:customer:export")
    @Log(title = "客户信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RentCustomer rentCustomer)
    {
        List<RentCustomer> list = rentCustomerService.selectRentCustomerList(rentCustomer);
        ExcelUtil<RentCustomer> util = new ExcelUtil<RentCustomer>(RentCustomer.class);
        util.exportExcel(response, list, "客户信息数据");
    }

    /**
     * 获取客户信息详细信息
     */
    @RequiresPermissions("service:customer:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(rentCustomerService.selectRentCustomerById(id));
    }

    /**
     * 新增客户信息
     */
    @RequiresPermissions("service:customer:add")
    @Log(title = "客户信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RentCustomer rentCustomer)
    {
        return toAjax(rentCustomerService.insertRentCustomer(rentCustomer));
    }

    /**
     * 修改客户信息
     */
    @RequiresPermissions("service:customer:edit")
    @Log(title = "客户信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RentCustomer rentCustomer)
    {
        return toAjax(rentCustomerService.updateRentCustomer(rentCustomer));
    }

    /**
     * 删除客户信息
     */
    @RequiresPermissions("service:customer:remove")
    @Log(title = "客户信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(rentCustomerService.deleteRentCustomerByIds(ids));
    }
}
