package com.szxj.rent.service;

import com.szxj.rent.domain.RentCustomer;

import java.util.List;

/**
 * 客户信息Service接口
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public interface IRentCustomerService
{
    /**
     * 查询客户信息
     *
     * @param id 客户信息主键
     * @return 客户信息
     */
    public RentCustomer selectRentCustomerById(String id);

    /**
     * 查询客户信息列表
     *
     * @param rentCustomer 客户信息
     * @return 客户信息集合
     */
    public List<RentCustomer> selectRentCustomerList(RentCustomer rentCustomer);

    /**
     * 新增客户信息
     *
     * @param rentCustomer 客户信息
     * @return 结果
     */
    public int insertRentCustomer(RentCustomer rentCustomer);

    /**
     * 修改客户信息
     *
     * @param rentCustomer 客户信息
     * @return 结果
     */
    public int updateRentCustomer(RentCustomer rentCustomer);

    /**
     * 批量删除客户信息
     *
     * @param ids 需要删除的客户信息主键集合
     * @return 结果
     */
    public int deleteRentCustomerByIds(String[] ids);

    /**
     * 删除客户信息信息
     *
     * @param id 客户信息主键
     * @return 结果
     */
    public int deleteRentCustomerById(String id);
}
