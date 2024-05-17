package com.szxj.rent.service.impl;


import com.ruoyi.common.core.utils.DateUtils;
import com.szxj.rent.domain.RentVehicleGeofence;
import com.szxj.rent.mapper.RentVehicleGeofenceMapper;
import com.szxj.rent.service.IRentVehicleGeofenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 车辆电子围栏Service业务层处理
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@Service
public class RentVehicleGeofenceServiceImpl implements IRentVehicleGeofenceService
{
    @Autowired
    private RentVehicleGeofenceMapper rentVehicleGeofenceMapper;

    /**
     * 查询车辆电子围栏
     *
     * @param id 车辆电子围栏主键
     * @return 车辆电子围栏
     */
    @Override
    public RentVehicleGeofence selectRentVehicleGeofenceById(String id)
    {
        return rentVehicleGeofenceMapper.selectRentVehicleGeofenceById(id);
    }

    /**
     * 查询车辆电子围栏列表
     *
     * @param rentVehicleGeofence 车辆电子围栏
     * @return 车辆电子围栏
     */
    @Override
    public List<RentVehicleGeofence> selectRentVehicleGeofenceList(RentVehicleGeofence rentVehicleGeofence)
    {
        return rentVehicleGeofenceMapper.selectRentVehicleGeofenceList(rentVehicleGeofence);
    }

    /**
     * 新增车辆电子围栏
     *
     * @param rentVehicleGeofence 车辆电子围栏
     * @return 结果
     */
    @Override
    public int insertRentVehicleGeofence(RentVehicleGeofence rentVehicleGeofence)
    {
        rentVehicleGeofence.setCreateTime(DateUtils.getNowDate());
        return rentVehicleGeofenceMapper.insertRentVehicleGeofence(rentVehicleGeofence);
    }

    /**
     * 修改车辆电子围栏
     *
     * @param rentVehicleGeofence 车辆电子围栏
     * @return 结果
     */
    @Override
    public int updateRentVehicleGeofence(RentVehicleGeofence rentVehicleGeofence)
    {
        rentVehicleGeofence.setUpdateTime(DateUtils.getNowDate());
        return rentVehicleGeofenceMapper.updateRentVehicleGeofence(rentVehicleGeofence);
    }

    /**
     * 批量删除车辆电子围栏
     *
     * @param ids 需要删除的车辆电子围栏主键
     * @return 结果
     */
    @Override
    public int deleteRentVehicleGeofenceByIds(String[] ids)
    {
        return rentVehicleGeofenceMapper.deleteRentVehicleGeofenceByIds(ids);
    }

    /**
     * 删除车辆电子围栏信息
     *
     * @param id 车辆电子围栏主键
     * @return 结果
     */
    @Override
    public int deleteRentVehicleGeofenceById(String id)
    {
        return rentVehicleGeofenceMapper.deleteRentVehicleGeofenceById(id);
    }
}
