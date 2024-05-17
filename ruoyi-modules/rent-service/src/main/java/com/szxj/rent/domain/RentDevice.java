package com.szxj.rent.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 车载设备信息对象 rent_device
 *
 * @author ruoyi
 * @date 2024-05-11
 */
public class RentDevice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** 设备号 */
    @Excel(name = "设备号")
    private String deviceNum;

    /** 设备类型id */
    @Excel(name = "设备类型id")
    private String deviceTypeId;

    /** 所属厂家id */
    @Excel(name = "所属厂家id")
    private String venderId;

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
    public void setDeviceNum(String deviceNum)
    {
        this.deviceNum = deviceNum;
    }

    public String getDeviceNum()
    {
        return deviceNum;
    }
    public void setDeviceTypeId(String deviceTypeId)
    {
        this.deviceTypeId = deviceTypeId;
    }

    public String getDeviceTypeId()
    {
        return deviceTypeId;
    }
    public void setVenderId(String venderId)
    {
        this.venderId = venderId;
    }

    public String getVenderId()
    {
        return venderId;
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
            .append("deviceNum", getDeviceNum())
            .append("deviceTypeId", getDeviceTypeId())
            .append("venderId", getVenderId())
            .append("deleteFlag", getDeleteFlag())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
