package com.szxj.rent.service.impl;

import com.ruoyi.common.core.utils.DateUtils;
import com.szxj.rent.domain.RentDevice;
import com.szxj.rent.mapper.RentDeviceMapper;
import com.szxj.rent.service.IRentDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 车载设备信息Service业务层处理
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@Service
public class RentDeviceServiceImpl implements IRentDeviceService
{
    @Autowired
    private RentDeviceMapper rentDeviceMapper;

    /**
     * 查询车载设备信息
     *
     * @param id 车载设备信息主键
     * @return 车载设备信息
     */
    @Override
    public RentDevice selectRentDeviceById(String id)
    {
        return rentDeviceMapper.selectRentDeviceById(id);
    }

    /**
     * 查询车载设备信息列表
     *
     * @param rentDevice 车载设备信息
     * @return 车载设备信息
     */
    @Override
    public List<RentDevice> selectRentDeviceList(RentDevice rentDevice)
    {
        return rentDeviceMapper.selectRentDeviceList(rentDevice);
    }

    /**
     * 新增车载设备信息
     *
     * @param rentDevice 车载设备信息
     * @return 结果
     */
    @Override
    public int insertRentDevice(RentDevice rentDevice)
    {
        rentDevice.setCreateTime(DateUtils.getNowDate());
        return rentDeviceMapper.insertRentDevice(rentDevice);
    }

    /**
     * 修改车载设备信息
     *
     * @param rentDevice 车载设备信息
     * @return 结果
     */
    @Override
    public int updateRentDevice(RentDevice rentDevice)
    {
        rentDevice.setUpdateTime(DateUtils.getNowDate());
        return rentDeviceMapper.updateRentDevice(rentDevice);
    }

    /**
     * 批量删除车载设备信息
     *
     * @param ids 需要删除的车载设备信息主键
     * @return 结果
     */
    @Override
    public int deleteRentDeviceByIds(String[] ids)
    {
        return rentDeviceMapper.deleteRentDeviceByIds(ids);
    }

    /**
     * 删除车载设备信息信息
     *
     * @param id 车载设备信息主键
     * @return 结果
     */
    @Override
    public int deleteRentDeviceById(String id)
    {
        return rentDeviceMapper.deleteRentDeviceById(id);
    }
}
