package com.szxj.rent.service.impl;


import com.ruoyi.common.core.utils.DateUtils;
import com.szxj.rent.domain.RentLease;
import com.szxj.rent.mapper.RentLeaseMapper;
import com.szxj.rent.service.IRentLeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 租赁订单Service业务层处理
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@Service
public class RentLeaseServiceImpl implements IRentLeaseService
{
    @Autowired
    private RentLeaseMapper rentLeaseMapper;

    /**
     * 查询租赁订单
     *
     * @param id 租赁订单主键
     * @return 租赁订单
     */
    @Override
    public RentLease selectRentLeaseById(String id)
    {
        return rentLeaseMapper.selectRentLeaseById(id);
    }

    /**
     * 查询租赁订单列表
     *
     * @param rentLease 租赁订单
     * @return 租赁订单
     */
    @Override
    public List<RentLease> selectRentLeaseList(RentLease rentLease)
    {
        return rentLeaseMapper.selectRentLeaseList(rentLease);
    }

    /**
     * 新增租赁订单
     *
     * @param rentLease 租赁订单
     * @return 结果
     */
    @Override
    public int insertRentLease(RentLease rentLease)
    {
        rentLease.setCreateTime(DateUtils.getNowDate());
        return rentLeaseMapper.insertRentLease(rentLease);
    }

    /**
     * 修改租赁订单
     *
     * @param rentLease 租赁订单
     * @return 结果
     */
    @Override
    public int updateRentLease(RentLease rentLease)
    {
        rentLease.setUpdateTime(DateUtils.getNowDate());
        return rentLeaseMapper.updateRentLease(rentLease);
    }

    /**
     * 批量删除租赁订单
     *
     * @param ids 需要删除的租赁订单主键
     * @return 结果
     */
    @Override
    public int deleteRentLeaseByIds(String[] ids)
    {
        return rentLeaseMapper.deleteRentLeaseByIds(ids);
    }

    /**
     * 删除租赁订单信息
     *
     * @param id 租赁订单主键
     * @return 结果
     */
    @Override
    public int deleteRentLeaseById(String id)
    {
        return rentLeaseMapper.deleteRentLeaseById(id);
    }
}
