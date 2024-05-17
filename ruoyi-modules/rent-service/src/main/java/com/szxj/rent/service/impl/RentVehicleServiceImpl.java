package com.szxj.rent.service.impl;

import com.ruoyi.common.core.utils.DateUtils;
import com.szxj.rent.domain.RentVehicle;
import com.szxj.rent.mapper.RentVehicleMapper;
import com.szxj.rent.service.IRentVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 车辆信息Service业务层处理
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@Service
public class RentVehicleServiceImpl implements IRentVehicleService
{
    @Autowired
    private RentVehicleMapper rentVehicleMapper;

    /**
     * 查询车辆信息
     *
     * @param id 车辆信息主键
     * @return 车辆信息
     */
    @Override
    public RentVehicle selectRentVehicleById(String id)
    {
        return rentVehicleMapper.selectRentVehicleById(id);
    }

    /**
     * 查询车辆信息列表
     *
     * @param rentVehicle 车辆信息
     * @return 车辆信息
     */
    @Override
    public List<RentVehicle> selectRentVehicleList(RentVehicle rentVehicle)
    {
        return rentVehicleMapper.selectRentVehicleList(rentVehicle);
    }

    /**
     * 新增车辆信息
     *
     * @param rentVehicle 车辆信息
     * @return 结果
     */
    @Override
    public int insertRentVehicle(RentVehicle rentVehicle)
    {
//        rentVehicle.setCreateTime(DateUtils.getNowDate());
        return rentVehicleMapper.insertRentVehicle(rentVehicle);
    }

    /**
     * 修改车辆信息
     *
     * @param rentVehicle 车辆信息
     * @return 结果
     */
    @Override
    public int updateRentVehicle(RentVehicle rentVehicle)
    {
        rentVehicle.setUpdateTime(DateUtils.getNowDate());
        return rentVehicleMapper.updateRentVehicle(rentVehicle);
    }

    /**
     * 批量删除车辆信息
     *
     * @param ids 需要删除的车辆信息主键
     * @return 结果
     */
    @Override
    public int deleteRentVehicleByIds(String[] ids)
    {
        return rentVehicleMapper.deleteRentVehicleByIds(ids);
    }

    /**
     * 删除车辆信息信息
     *
     * @param id 车辆信息主键
     * @return 结果
     */
    @Override
    public int deleteRentVehicleById(String id)
    {
        return rentVehicleMapper.deleteRentVehicleById(id);
    }
}
