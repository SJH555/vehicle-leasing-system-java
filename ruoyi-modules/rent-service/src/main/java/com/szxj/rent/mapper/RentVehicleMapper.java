package com.szxj.rent.mapper;


import com.szxj.rent.domain.RentVehicle;

import java.util.List;

/**
 * 车辆信息Mapper接口
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public interface RentVehicleMapper
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
    public int insertRentVehicle(RentVehicle rentVehicle);

    /**
     * 修改车辆信息
     *
     * @param rentVehicle 车辆信息
     * @return 结果
     */
    public int updateRentVehicle(RentVehicle rentVehicle);

    /**
     * 删除车辆信息
     *
     * @param id 车辆信息主键
     * @return 结果
     */
    public int deleteRentVehicleById(String id);

    /**
     * 批量删除车辆信息
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRentVehicleByIds(String[] ids);
}
