package com.szxj.rent.mapper;


import com.szxj.rent.domain.RentVehicleMaintenance;

import java.util.List;

/**
 * 车辆维保信息Mapper接口
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public interface RentVehicleMaintenanceMapper
{
    /**
     * 查询车辆维保信息
     *
     * @param id 车辆维保信息主键
     * @return 车辆维保信息
     */
    public RentVehicleMaintenance selectRentVehicleMaintenanceById(String id);

    /**
     * 查询车辆维保信息列表
     *
     * @param rentVehicleMaintenance 车辆维保信息
     * @return 车辆维保信息集合
     */
    public List<RentVehicleMaintenance> selectRentVehicleMaintenanceList(RentVehicleMaintenance rentVehicleMaintenance);

    /**
     * 新增车辆维保信息
     *
     * @param rentVehicleMaintenance 车辆维保信息
     * @return 结果
     */
    public int insertRentVehicleMaintenance(RentVehicleMaintenance rentVehicleMaintenance);

    /**
     * 修改车辆维保信息
     *
     * @param rentVehicleMaintenance 车辆维保信息
     * @return 结果
     */
    public int updateRentVehicleMaintenance(RentVehicleMaintenance rentVehicleMaintenance);

    /**
     * 删除车辆维保信息
     *
     * @param id 车辆维保信息主键
     * @return 结果
     */
    public int deleteRentVehicleMaintenanceById(String id);

    /**
     * 批量删除车辆维保信息
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRentVehicleMaintenanceByIds(String[] ids);
}
