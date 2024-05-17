package com.szxj.rent.service.impl;

import com.ruoyi.common.core.utils.DateUtils;
import com.szxj.rent.domain.RentVehicleMaintenance;
import com.szxj.rent.mapper.RentVehicleMaintenanceMapper;
import com.szxj.rent.service.IRentVehicleMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

;

/**
 * 车辆维保信息Service业务层处理
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@Service
public class RentVehicleMaintenanceServiceImpl implements IRentVehicleMaintenanceService
{
    @Autowired
    private RentVehicleMaintenanceMapper rentVehicleMaintenanceMapper;

    /**
     * 查询车辆维保信息
     *
     * @param id 车辆维保信息主键
     * @return 车辆维保信息
     */
    @Override
    public RentVehicleMaintenance selectRentVehicleMaintenanceById(String id)
    {
        return rentVehicleMaintenanceMapper.selectRentVehicleMaintenanceById(id);
    }

    /**
     * 查询车辆维保信息列表
     *
     * @param rentVehicleMaintenance 车辆维保信息
     * @return 车辆维保信息
     */
    @Override
    public List<RentVehicleMaintenance> selectRentVehicleMaintenanceList(RentVehicleMaintenance rentVehicleMaintenance)
    {
        return rentVehicleMaintenanceMapper.selectRentVehicleMaintenanceList(rentVehicleMaintenance);
    }

    /**
     * 新增车辆维保信息
     *
     * @param rentVehicleMaintenance 车辆维保信息
     * @return 结果
     */
    @Override
    public int insertRentVehicleMaintenance(RentVehicleMaintenance rentVehicleMaintenance)
    {
        rentVehicleMaintenance.setCreateTime(DateUtils.getNowDate());
        return rentVehicleMaintenanceMapper.insertRentVehicleMaintenance(rentVehicleMaintenance);
    }

    /**
     * 修改车辆维保信息
     *
     * @param rentVehicleMaintenance 车辆维保信息
     * @return 结果
     */
    @Override
    public int updateRentVehicleMaintenance(RentVehicleMaintenance rentVehicleMaintenance)
    {
        rentVehicleMaintenance.setUpdateTime(DateUtils.getNowDate());
        return rentVehicleMaintenanceMapper.updateRentVehicleMaintenance(rentVehicleMaintenance);
    }

    /**
     * 批量删除车辆维保信息
     *
     * @param ids 需要删除的车辆维保信息主键
     * @return 结果
     */
    @Override
    public int deleteRentVehicleMaintenanceByIds(String[] ids)
    {
        return rentVehicleMaintenanceMapper.deleteRentVehicleMaintenanceByIds(ids);
    }

    /**
     * 删除车辆维保信息信息
     *
     * @param id 车辆维保信息主键
     * @return 结果
     */
    @Override
    public int deleteRentVehicleMaintenanceById(String id)
    {
        return rentVehicleMaintenanceMapper.deleteRentVehicleMaintenanceById(id);
    }
}
