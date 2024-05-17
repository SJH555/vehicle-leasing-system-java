package com.szxj.rent.service.impl;


import com.ruoyi.common.core.utils.DateUtils;
import com.szxj.rent.domain.RentVehicleTrajectory;
import com.szxj.rent.mapper.RentVehicleTrajectoryMapper;
import com.szxj.rent.service.IRentVehicleTrajectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 行车轨迹Service业务层处理
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@Service
public class RentVehicleTrajectoryServiceImpl implements IRentVehicleTrajectoryService
{
    @Autowired
    private RentVehicleTrajectoryMapper rentVehicleTrajectoryMapper;

    /**
     * 查询行车轨迹
     *
     * @param id 行车轨迹主键
     * @return 行车轨迹
     */
    @Override
    public RentVehicleTrajectory selectRentVehicleTrajectoryById(String id)
    {
        return rentVehicleTrajectoryMapper.selectRentVehicleTrajectoryById(id);
    }

    /**
     * 查询行车轨迹列表
     *
     * @param rentVehicleTrajectory 行车轨迹
     * @return 行车轨迹
     */
    @Override
    public List<RentVehicleTrajectory> selectRentVehicleTrajectoryList(RentVehicleTrajectory rentVehicleTrajectory)
    {
        return rentVehicleTrajectoryMapper.selectRentVehicleTrajectoryList(rentVehicleTrajectory);
    }

    /**
     * 新增行车轨迹
     *
     * @param rentVehicleTrajectory 行车轨迹
     * @return 结果
     */
    @Override
    public int insertRentVehicleTrajectory(RentVehicleTrajectory rentVehicleTrajectory)
    {
        rentVehicleTrajectory.setCreateTime(DateUtils.getNowDate());
        return rentVehicleTrajectoryMapper.insertRentVehicleTrajectory(rentVehicleTrajectory);
    }

    /**
     * 修改行车轨迹
     *
     * @param rentVehicleTrajectory 行车轨迹
     * @return 结果
     */
    @Override
    public int updateRentVehicleTrajectory(RentVehicleTrajectory rentVehicleTrajectory)
    {
        rentVehicleTrajectory.setUpdateTime(DateUtils.getNowDate());
        return rentVehicleTrajectoryMapper.updateRentVehicleTrajectory(rentVehicleTrajectory);
    }

    /**
     * 批量删除行车轨迹
     *
     * @param ids 需要删除的行车轨迹主键
     * @return 结果
     */
    @Override
    public int deleteRentVehicleTrajectoryByIds(String[] ids)
    {
        return rentVehicleTrajectoryMapper.deleteRentVehicleTrajectoryByIds(ids);
    }

    /**
     * 删除行车轨迹信息
     *
     * @param id 行车轨迹主键
     * @return 结果
     */
    @Override
    public int deleteRentVehicleTrajectoryById(String id)
    {
        return rentVehicleTrajectoryMapper.deleteRentVehicleTrajectoryById(id);
    }
}
