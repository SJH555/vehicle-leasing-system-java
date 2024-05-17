package com.szxj.rent.service;


import com.szxj.rent.domain.RentVehicle;

import java.util.List;

/**
 * 车辆信息Service接口
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public interface IRentVehicleService
{
    /**
     * 查询车辆信息
     *
     * @param id 车辆信息主键
     * @return 车辆信息
     */
    public RentVehicle selectRentVehicleById(String id);

    /**
     * 查询车辆信息列表
     *
     * @param rentVehicle 车辆信息
     * @return 车辆信息集合
     */
    List<RentVehicle> selectRentVehicleList(RentVehicle rentVehicle);

    /**
     * 新增车辆信息
     *
     * @param rentVehicle 车辆信息
     * @return 结果
     */
    int insertRentVehicle(RentVehicle rentVehicle);

    /**
     * 修改车辆信息
     *
     * @param rentVehicle 车辆信息
     * @return 结果
     */
    public int updateRentVehicle(RentVehicle rentVehicle);

    /**
     * 批量删除车辆信息
     *
     * @param ids 需要删除的车辆信息主键集合
     * @return 结果
     */
    public int deleteRentVehicleByIds(String[] ids);

    /**
     * 删除车辆信息信息
     *
     * @param id 车辆信息主键
     * @return 结果
     */
    public int deleteRentVehicleById(String id);
}
