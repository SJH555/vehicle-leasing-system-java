package com.szxj.rent.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 车辆引擎活动对象 rent_vehicle_activity
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public class RentVehicleActivity extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** 车辆id */
    @Excel(name = "车辆id")
    private String vehicleId;

    /** 发动车辆时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发动车辆时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startEngineTime;

    /** 熄火车辆时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "熄火车辆时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date stopEngineTime;

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
    public void setStartEngineTime(Date startEngineTime)
    {
        this.startEngineTime = startEngineTime;
    }

    public Date getStartEngineTime()
    {
        return startEngineTime;
    }
    public void setStopEngineTime(Date stopEngineTime)
    {
        this.stopEngineTime = stopEngineTime;
    }

    public Date getStopEngineTime()
    {
        return stopEngineTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("vehicleId", getVehicleId())
            .append("startEngineTime", getStartEngineTime())
            .append("stopEngineTime", getStopEngineTime())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
