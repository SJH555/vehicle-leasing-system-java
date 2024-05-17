package com.szxj.rent.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 车辆维保信息对象 rent_vehicle_maintenance
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public class RentVehicleMaintenance extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 车辆id */
    @Excel(name = "车辆id")
    private String vehicleId;

    /** 车牌号 */
    @Excel(name = "车牌号")
    private String plateNum;

    /** 维保人员id */
    @Excel(name = "维保人员id")
    private String operatorId;

    /** 维保人员姓名 */
    @Excel(name = "维保人员姓名")
    private String operatorName;

    /** 维保开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "维保开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 维保结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "维保结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 维保类型 0维修 2保养 */
    @Excel(name = "维保类型 0维修 2保养")
    private String operatorType;

    /** 维保状态 0维保中 1维保结束 2维保取消 */
    @Excel(name = "维保状态 0维保中 1维保结束 2维保取消")
    private String operatorStatus;

    /** 删除标识 0未删除 1已删除 */
    @Excel(name = "删除标识 0未删除 1已删除")
    private String deleteFlag;

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
    public void setPlateNum(String plateNum)
    {
        this.plateNum = plateNum;
    }

    public String getPlateNum()
    {
        return plateNum;
    }
    public void setOperatorId(String operatorId)
    {
        this.operatorId = operatorId;
    }

    public String getOperatorId()
    {
        return operatorId;
    }
    public void setOperatorName(String operatorName)
    {
        this.operatorName = operatorName;
    }

    public String getOperatorName()
    {
        return operatorName;
    }
    public void setStartTime(Date startTime)
    {
        this.startTime = startTime;
    }

    public Date getStartTime()
    {
        return startTime;
    }
    public void setEndTime(Date endTime)
    {
        this.endTime = endTime;
    }

    public Date getEndTime()
    {
        return endTime;
    }
    public void setOperatorType(String operatorType)
    {
        this.operatorType = operatorType;
    }

    public String getOperatorType()
    {
        return operatorType;
    }
    public void setOperatorStatus(String operatorStatus)
    {
        this.operatorStatus = operatorStatus;
    }

    public String getOperatorStatus()
    {
        return operatorStatus;
    }
    public void setDeleteFlag(String deleteFlag)
    {
        this.deleteFlag = deleteFlag;
    }

    public String getDeleteFlag()
    {
        return deleteFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("vehicleId", getVehicleId())
            .append("plateNum", getPlateNum())
            .append("operatorId", getOperatorId())
            .append("operatorName", getOperatorName())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("operatorType", getOperatorType())
            .append("operatorStatus", getOperatorStatus())
            .append("deleteFlag", getDeleteFlag())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
