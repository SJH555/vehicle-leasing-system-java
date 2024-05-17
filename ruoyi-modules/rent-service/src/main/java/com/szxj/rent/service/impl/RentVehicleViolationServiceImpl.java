package com.szxj.rent.service.impl;


import com.ruoyi.common.core.utils.DateUtils;
import com.szxj.rent.domain.RentVehicleViolation;
import com.szxj.rent.mapper.RentVehicleViolationMapper;
import com.szxj.rent.service.IRentVehicleViolationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 车辆异常信息Service业务层处理
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@Service
public class RentVehicleViolationServiceImpl implements IRentVehicleViolationService
{
    @Autowired
    private RentVehicleViolationMapper rentVehicleViolationMapper;

    /**
     * 查询车辆异常信息
     *
     * @param id 车辆异常信息主键
     * @return 车辆异常信息
     */
    @Override
    public RentVehicleViolation selectRentVehicleViolationById(String id)
    {
        return rentVehicleViolationMapper.selectRentVehicleViolationById(id);
    }

    /**
     * 查询车辆异常信息列表
     *
     * @param rentVehicleViolation 车辆异常信息
     * @return 车辆异常信息
     */
    @Override
    public List<RentVehicleViolation> selectRentVehicleViolationList(RentVehicleViolation rentVehicleViolation)
    {
        return rentVehicleViolationMapper.selectRentVehicleViolationList(rentVehicleViolation);
    }

    /**
     * 新增车辆异常信息
     *
     * @param rentVehicleViolation 车辆异常信息
     * @return 结果
     */
    @Override
    public int insertRentVehicleViolation(RentVehicleViolation rentVehicleViolation)
    {
        rentVehicleViolation.setCreateTime(DateUtils.getNowDate());
        return rentVehicleViolationMapper.insertRentVehicleViolation(rentVehicleViolation);
    }

    /**
     * 修改车辆异常信息
     *
     * @param rentVehicleViolation 车辆异常信息
     * @return 结果
     */
    @Override
    public int updateRentVehicleViolation(RentVehicleViolation rentVehicleViolation)
    {
        rentVehicleViolation.setUpdateTime(DateUtils.getNowDate());
        return rentVehicleViolationMapper.updateRentVehicleViolation(rentVehicleViolation);
    }

    /**
     * 批量删除车辆异常信息
     *
     * @param ids 需要删除的车辆异常信息主键
     * @return 结果
     */
    @Override
    public int deleteRentVehicleViolationByIds(String[] ids)
    {
        return rentVehicleViolationMapper.deleteRentVehicleViolationByIds(ids);
    }

    /**
     * 删除车辆异常信息信息
     *
     * @param id 车辆异常信息主键
     * @return 结果
     */
    @Override
    public int deleteRentVehicleViolationById(String id)
    {
        return rentVehicleViolationMapper.deleteRentVehicleViolationById(id);
    }
}
