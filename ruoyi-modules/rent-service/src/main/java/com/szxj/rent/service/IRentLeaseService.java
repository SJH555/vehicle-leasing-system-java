package com.szxj.rent.service;


import com.szxj.rent.domain.RentLease;

import java.util.List;

/**
 * 租赁订单Service接口
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public interface IRentLeaseService
{
    /**
     * 查询租赁订单
     *
     * @param id 租赁订单主键
     * @return 租赁订单
     */
    public RentLease selectRentLeaseById(String id);

    /**
     * 查询租赁订单列表
     *
     * @param rentLease 租赁订单
     * @return 租赁订单集合
     */
    public List<RentLease> selectRentLeaseList(RentLease rentLease);

    /**
     * 新增租赁订单
     *
     * @param rentLease 租赁订单
     * @return 结果
     */
    public int insertRentLease(RentLease rentLease);

    /**
     * 修改租赁订单
     *
     * @param rentLease 租赁订单
     * @return 结果
     */
    public int updateRentLease(RentLease rentLease);

    /**
     * 批量删除租赁订单
     *
     * @param ids 需要删除的租赁订单主键集合
     * @return 结果
     */
    public int deleteRentLeaseByIds(String[] ids);

    /**
     * 删除租赁订单信息
     *
     * @param id 租赁订单主键
     * @return 结果
     */
    public int deleteRentLeaseById(String id);
}
