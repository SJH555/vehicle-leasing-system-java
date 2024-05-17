package com.szxj.rent.service.impl;

import com.ruoyi.common.core.utils.DateUtils;
import com.szxj.rent.domain.RentCustomer;
import com.szxj.rent.mapper.RentCustomerMapper;
import com.szxj.rent.service.IRentCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 客户信息Service业务层处理
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@Service
public class RentCustomerServiceImpl implements IRentCustomerService
{
    @Autowired
    private RentCustomerMapper rentCustomerMapper;

    /**
     * 查询客户信息
     *
     * @param id 客户信息主键
     * @return 客户信息
     */
    @Override
    public RentCustomer selectRentCustomerById(String id)
    {
        return rentCustomerMapper.selectRentCustomerById(id);
    }

    /**
     * 查询客户信息列表
     *
     * @param rentCustomer 客户信息
     * @return 客户信息
     */
    @Override
    public List<RentCustomer> selectRentCustomerList(RentCustomer rentCustomer)
    {
        return rentCustomerMapper.selectRentCustomerList(rentCustomer);
    }

    /**
     * 新增客户信息
     *
     * @param rentCustomer 客户信息
     * @return 结果
     */
    @Override
    public int insertRentCustomer(RentCustomer rentCustomer)
    {
        rentCustomer.setCreateTime(DateUtils.getNowDate());
        return rentCustomerMapper.insertRentCustomer(rentCustomer);
    }

    /**
     * 修改客户信息
     *
     * @param rentCustomer 客户信息
     * @return 结果
     */
    @Override
    public int updateRentCustomer(RentCustomer rentCustomer)
    {
        rentCustomer.setUpdateTime(DateUtils.getNowDate());
        return rentCustomerMapper.updateRentCustomer(rentCustomer);
    }

    /**
     * 批量删除客户信息
     *
     * @param ids 需要删除的客户信息主键
     * @return 结果
     */
    @Override
    public int deleteRentCustomerByIds(String[] ids)
    {
        return rentCustomerMapper.deleteRentCustomerByIds(ids);
    }

    /**
     * 删除客户信息信息
     *
     * @param id 客户信息主键
     * @return 结果
     */
    @Override
    public int deleteRentCustomerById(String id)
    {
        return rentCustomerMapper.deleteRentCustomerById(id);
    }
}
