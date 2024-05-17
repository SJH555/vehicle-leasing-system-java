package com.szxj.rent.mapper;


import com.szxj.rent.domain.RentVehicleGeofence;

import java.util.List;

/**
 * 车辆电子围栏Mapper接口
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public interface RentVehicleGeofenceMapper
{
    /**
     * 查询车辆电子围栏
     *
     * @param id 车辆电子围栏主键
     * @return 车辆电子围栏
     */
    public RentVehicleGeofence selectRentVehicleGeofenceById(String id);

    /**
     * 查询车辆电子围栏列表
     *
     * @param rentVehicleGeofence 车辆电子围栏
     * @return 车辆电子围栏集合
     */
    public List<RentVehicleGeofence> selectRentVehicleGeofenceList(RentVehicleGeofence rentVehicleGeofence);

    /**
     * 新增车辆电子围栏
     *
     * @param rentVehicleGeofence 车辆电子围栏
     * @return 结果
     */
    public int insertRentVehicleGeofence(RentVehicleGeofence rentVehicleGeofence);

    /**
     * 修改车辆电子围栏
     *
     * @param rentVehicleGeofence 车辆电子围栏
     * @return 结果
     */
    public int updateRentVehicleGeofence(RentVehicleGeofence rentVehicleGeofence);

    /**
     * 删除车辆电子围栏
     *
     * @param id 车辆电子围栏主键
     * @return 结果
     */
    public int deleteRentVehicleGeofenceById(String id);

    /**
     * 批量删除车辆电子围栏
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRentVehicleGeofenceByIds(String[] ids);
}
