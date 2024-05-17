package com.szxj.rent.mapper;


import com.szxj.rent.domain.RentDevice;

import java.util.List;

/**
 * 车载设备信息Mapper接口
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public interface RentDeviceMapper
{
    /**
     * 查询车载设备信息
     *
     * @param id 车载设备信息主键
     * @return 车载设备信息
     */
    public RentDevice selectRentDeviceById(String id);

    /**
     * 查询车载设备信息列表
     *
     * @param rentDevice 车载设备信息
     * @return 车载设备信息集合
     */
    public List<RentDevice> selectRentDeviceList(RentDevice rentDevice);

    /**
     * 新增车载设备信息
     *
     * @param rentDevice 车载设备信息
     * @return 结果
     */
    public int insertRentDevice(RentDevice rentDevice);

    /**
     * 修改车载设备信息
     *
     * @param rentDevice 车载设备信息
     * @return 结果
     */
    public int updateRentDevice(RentDevice rentDevice);

    /**
     * 删除车载设备信息
     *
     * @param id 车载设备信息主键
     * @return 结果
     */
    public int deleteRentDeviceById(String id);

    /**
     * 批量删除车载设备信息
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRentDeviceByIds(String[] ids);
}
