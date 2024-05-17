package com.szxj.rent.service.impl;


import com.ruoyi.common.core.utils.DateUtils;
import com.szxj.rent.domain.RentVehicleActivity;
import com.szxj.rent.mapper.RentVehicleActivityMapper;
import com.szxj.rent.service.IRentVehicleActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 车辆引擎活动Service业务层处理
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@Service
public class RentVehicleActivityServiceImpl implements IRentVehicleActivityService
{
    @Autowired
    private RentVehicleActivityMapper rentVehicleActivityMapper;

    /**
     * 查询车辆引擎活动
     *
     * @param id 车辆引擎活动主键
     * @return 车辆引擎活动
     */
    @Override
    public RentVehicleActivity selectRentVehicleActivityById(String id)
    {
        return rentVehicleActivityMapper.selectRentVehicleActivityById(id);
    }

    /**
     * 查询车辆引擎活动列表
     *
     * @param rentVehicleActivity 车辆引擎活动
     * @return 车辆引擎活动
     */
    @Override
    public List<RentVehicleActivity> selectRentVehicleActivityList(RentVehicleActivity rentVehicleActivity)
    {
        return rentVehicleActivityMapper.selectRentVehicleActivityList(rentVehicleActivity);
    }

    /**
     * 新增车辆引擎活动
     *
     * @param rentVehicleActivity 车辆引擎活动
     * @return 结果
     */
    @Override
    public int insertRentVehicleActivity(RentVehicleActivity rentVehicleActivity)
    {
        rentVehicleActivity.setCreateTime(DateUtils.getNowDate());
        return rentVehicleActivityMapper.insertRentVehicleActivity(rentVehicleActivity);
    }

    /**
     * 修改车辆引擎活动
     *
     * @param rentVehicleActivity 车辆引擎活动
     * @return 结果
     */
    @Override
    public int updateRentVehicleActivity(RentVehicleActivity rentVehicleActivity)
    {
        rentVehicleActivity.setUpdateTime(DateUtils.getNowDate());
        return rentVehicleActivityMapper.updateRentVehicleActivity(rentVehicleActivity);
    }

    /**
     * 批量删除车辆引擎活动
     *
     * @param ids 需要删除的车辆引擎活动主键
     * @return 结果
     */
    @Override
    public int deleteRentVehicleActivityByIds(String[] ids)
    {
        return rentVehicleActivityMapper.deleteRentVehicleActivityByIds(ids);
    }

    /**
     * 删除车辆引擎活动信息
     *
     * @param id 车辆引擎活动主键
     * @return 结果
     */
    @Override
    public int deleteRentVehicleActivityById(String id)
    {
        return rentVehicleActivityMapper.deleteRentVehicleActivityById(id);
    }
}
