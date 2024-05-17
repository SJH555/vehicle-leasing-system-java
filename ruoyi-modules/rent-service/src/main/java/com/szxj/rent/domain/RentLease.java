package com.szxj.rent.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 租赁订单对象 rent_lease
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public class RentLease extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** 租车人id */
    @Excel(name = "租车人id")
    private String customerId;

    /** 租车人姓名 */
    @Excel(name = "租车人姓名")
    private String customerName;

    /** 车辆id */
    @Excel(name = "车辆id")
    private String vehicleId;

    /** 车牌号 */
    @Excel(name = "车牌号")
    private String plateNum;

    /** 订单负责人id */
    @Excel(name = "订单负责人id")
    private String operatorId;

    /** 订单负责人姓名 */
    @Excel(name = "订单负责人姓名")
    private String operatorName;

    /** 租车开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "租车开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 租车结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "租车结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 租赁状态：0已结束 1进行中 2已续约 */
    @Excel(name = "租赁状态：0已结束 1进行中 2已续约")
    private String leaseStatus;

    /** 结算金额 */
    @Excel(name = "结算金额")
    private Long balance;

    /** 删除标识：0未删除 1已删除 */
    @Excel(name = "删除标识：0未删除 1已删除")
    private String deleteFlag;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setCustomerId(String customerId)
    {
        this.customerId = customerId;
    }

    public String getCustomerId()
    {
        return customerId;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerName()
    {
        return customerName;
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
    public void setLeaseStatus(String leaseStatus)
    {
        this.leaseStatus = leaseStatus;
    }

    public String getLeaseStatus()
    {
        return leaseStatus;
    }
    public void setBalance(Long balance)
    {
        this.balance = balance;
    }

    public Long getBalance()
    {
        return balance;
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
            .append("customerId", getCustomerId())
            .append("customerName", getCustomerName())
            .append("vehicleId", getVehicleId())
            .append("plateNum", getPlateNum())
            .append("operatorId", getOperatorId())
            .append("operatorName", getOperatorName())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("leaseStatus", getLeaseStatus())
            .append("balance", getBalance())
            .append("deleteFlag", getDeleteFlag())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
