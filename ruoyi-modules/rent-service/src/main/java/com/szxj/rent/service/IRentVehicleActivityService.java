package com.szxj.rent.service;


import com.szxj.rent.domain.RentVehicleActivity;

import java.util.List;

/**
 * 车辆引擎活动Service接口
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public interface IRentVehicleActivityService
{
    /**
     * 查询车辆引擎活动
     *
     * @param id 车辆引擎活动主键
     * @return 车辆引擎活动
     */
    public RentVehicleActivity selectRentVehicleActivityById(String id);

    /**
     * 查询车辆引擎活动列表
     *
     * @param rentVehicleActivity 车辆引擎活动
     * @return 车辆引擎活动集合
     */
    public List<RentVehicleActivity> selectRentVehicleActivityList(RentVehicleActivity rentVehicleActivity);

    /**
     * 新增车辆引擎活动
     *
     * @param rentVehicleActivity 车辆引擎活动
     * @return 结果
     */
    public int insertRentVehicleActivity(RentVehicleActivity rentVehicleActivity);

    /**
     * 修改车辆引擎活动
     *
     * @param rentVehicleActivity 车辆引擎活动
     * @return 结果
     */
    public int updateRentVehicleActivity(RentVehicleActivity rentVehicleActivity);

    /**
     * 批量删除车辆引擎活动
     *
     * @param ids 需要删除的车辆引擎活动主键集合
     * @return 结果
     */
    public int deleteRentVehicleActivityByIds(String[] ids);

    /**
     * 删除车辆引擎活动信息
     *
     * @param id 车辆引擎活动主键
     * @return 结果
     */
    public int deleteRentVehicleActivityById(String id);
}
