package com.szxj.rent.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 行车轨迹对象 rent_vehicle_trajectory
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public class RentVehicleTrajectory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** 设备id */
    @Excel(name = "设备id")
    private String deviceId;

    /** 车辆id */
    @Excel(name = "车辆id")
    private String vehicleId;

    /** 经度 */
    @Excel(name = "经度")
    private String longitude;

    /** 维度 */
    @Excel(name = "维度")
    private String latitude;

    /** 车辆速度 */
    @Excel(name = "车辆速度")
    private String speed;

    /** 设备电量 */
    @Excel(name = "设备电量")
    private String electricity;

    /** 当前时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "当前时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date currentTime;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getDeviceId()
    {
        return deviceId;
    }
    public void setVehicleId(String vehicleId)
    {
        this.vehicleId = vehicleId;
    }

    public String getVehicleId()
    {
        return vehicleId;
    }
    public void setLongitude(String longitude)
    {
        this.longitude = longitude;
    }

    public String getLongitude()
    {
        return longitude;
    }
    public void setLatitude(String latitude)
    {
        this.latitude = latitude;
    }

    public String getLatitude()
    {
        return latitude;
    }
    public void setSpeed(String speed)
    {
        this.speed = speed;
    }

    public String getSpeed()
    {
        return speed;
    }
    public void setElectricity(String electricity)
    {
        this.electricity = electricity;
    }

    public String getElectricity()
    {
        return electricity;
    }
    public void setCurrentTime(Date currentTime)
    {
        this.currentTime = currentTime;
    }

    public Date getCurrentTime()
    {
        return currentTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("deviceId", getDeviceId())
            .append("vehicleId", getVehicleId())
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .append("speed", getSpeed())
            .append("electricity", getElectricity())
            .append("currentTime", getCurrentTime())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
