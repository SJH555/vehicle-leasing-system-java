package com.szxj.rent.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 车辆异常信息对象 rent_vehicle_violation
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public class RentVehicleViolation extends BaseEntity
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

    /** 租车人id */
    @Excel(name = "租车人id")
    private String customerId;

    /** 租车人姓名 */
    @Excel(name = "租车人姓名")
    private String customerName;

    /** 异常类型：0超速 1汽车状态告警 2超出电子围栏范围 */
    @Excel(name = "异常类型：0超速 1汽车状态告警 2超出电子围栏范围")
    private String violationType;

    /** 异常信息描述 */
    @Excel(name = "异常信息描述")
    private String desc;

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
    public void setViolationType(String violationType)
    {
        this.violationType = violationType;
    }

    public String getViolationType()
    {
        return violationType;
    }
    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public String getDesc()
    {
        return desc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("vehicleId", getVehicleId())
            .append("leaseId", getLeaseId())
            .append("customerId", getCustomerId())
            .append("customerName", getCustomerName())
            .append("violationType", getViolationType())
            .append("desc", getDesc())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
