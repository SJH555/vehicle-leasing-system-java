package com.szxj.rent.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 车辆电子围栏对象 rent_vehicle_geofence
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public class RentVehicleGeofence extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 车辆id */
    @Excel(name = "车辆id")
    private String vehicleId;

    /** 订单id */
    @Excel(name = "订单id")
    private String leaseId;

    /** 经度 */
    @Excel(name = "经度")
    private String longitude;

    /** 维度 */
    @Excel(name = "维度")
    private String latitude;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setVehicleId(String vehicleId)
    {
        this.vehicleId = vehicleId;
    }

    public String getVehicleId()
    {
        return vehicleId;
    }
    public void setLeaseId(String leaseId)
    {
        this.leaseId = leaseId;
    }

    public String getLeaseId()
    {
        return leaseId;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("vehicleId", getVehicleId())
            .append("leaseId", getLeaseId())
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
