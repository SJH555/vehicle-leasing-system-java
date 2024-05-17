package com.szxj.rent.service;


import com.szxj.rent.domain.RentVehicleViolation;

import java.util.List;

/**
 * 车辆异常信息Service接口
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public interface IRentVehicleViolationService
{
    /**
     * 查询车辆异常信息
     *
     * @param id 车辆异常信息主键
     * @return 车辆异常信息
     */
    public RentVehicleViolation selectRentVehicleViolationById(String id);

    /**
     * 查询车辆异常信息列表
     *
     * @param rentVehicleViolation 车辆异常信息
     * @return 车辆异常信息集合
     */
    public List<RentVehicleViolation> selectRentVehicleViolationList(RentVehicleViolation rentVehicleViolation);

    /**
     * 新增车辆异常信息
     *
     * @param rentVehicleViolation 车辆异常信息
     * @return 结果
     */
    public int insertRentVehicleViolation(RentVehicleViolation rentVehicleViolation);

    /**
     * 修改车辆异常信息
     *
     * @param rentVehicleViolation 车辆异常信息
     * @return 结果
     */
    public int updateRentVehicleViolation(RentVehicleViolation rentVehicleViolation);

    /**
     * 批量删除车辆异常信息
     *
     * @param ids 需要删除的车辆异常信息主键集合
     * @return 结果
     */
    public int deleteRentVehicleViolationByIds(String[] ids);

    /**
     * 删除车辆异常信息信息
     *
     * @param id 车辆异常信息主键
     * @return 结果
     */
    public int deleteRentVehicleViolationById(String id);
}
