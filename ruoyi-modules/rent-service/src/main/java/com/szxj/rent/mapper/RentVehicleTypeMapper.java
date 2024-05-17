package com.szxj.rent.mapper;


import com.szxj.rent.domain.RentVehicleType;

import java.util.List;

/**
 * 车辆配置Mapper接口
 *
 * @author ruoyi
 * @date 2024-05-14
 */
public interface RentVehicleTypeMapper
{
    /**
     * 查询车辆配置
     *
     * @param id 车辆配置主键
     * @return 车辆配置
     */
    public RentVehicleType selectRentVehicleTypeById(String id);

    /**
     * 查询车辆配置列表
     *
     * @param rentVehicleType 车辆配置
     * @return 车辆配置集合
     */
    public List<RentVehicleType> selectRentVehicleTypeList(RentVehicleType rentVehicleType);

    /**
     * 新增车辆配置
     *
     * @param rentVehicleType 车辆配置
     * @return 结果
     */
    public int insertRentVehicleType(RentVehicleType rentVehicleType);

    /**
     * 修改车辆配置
     *
     * @param rentVehicleType 车辆配置
     * @return 结果
     */
    public int updateRentVehicleType(RentVehicleType rentVehicleType);

    /**
     * 删除车辆配置
     *
     * @param id 车辆配置主键
     * @return 结果
     */
    public int deleteRentVehicleTypeById(String id);

    /**
     * 批量删除车辆配置
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRentVehicleTypeByIds(String[] ids);
}
