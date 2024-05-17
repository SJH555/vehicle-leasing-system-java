package com.szxj.rent.mapper;


import com.szxj.rent.domain.RentVehicleTrajectory;

import java.util.List;

/**
 * 行车轨迹Mapper接口
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public interface RentVehicleTrajectoryMapper
{
    /**
     * 查询行车轨迹
     *
     * @param id 行车轨迹主键
     * @return 行车轨迹
     */
    public RentVehicleTrajectory selectRentVehicleTrajectoryById(String id);

    /**
     * 查询行车轨迹列表
     *
     * @param rentVehicleTrajectory 行车轨迹
     * @return 行车轨迹集合
     */
    public List<RentVehicleTrajectory> selectRentVehicleTrajectoryList(RentVehicleTrajectory rentVehicleTrajectory);

    /**
     * 新增行车轨迹
     *
     * @param rentVehicleTrajectory 行车轨迹
     * @return 结果
     */
    public int insertRentVehicleTrajectory(RentVehicleTrajectory rentVehicleTrajectory);

    /**
     * 修改行车轨迹
     *
     * @param rentVehicleTrajectory 行车轨迹
     * @return 结果
     */
    public int updateRentVehicleTrajectory(RentVehicleTrajectory rentVehicleTrajectory);

    /**
     * 删除行车轨迹
     *
     * @param id 行车轨迹主键
     * @return 结果
     */
    public int deleteRentVehicleTrajectoryById(String id);

    /**
     * 批量删除行车轨迹
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRentVehicleTrajectoryByIds(String[] ids);
}
