package com.szxj.rent.domain;

import io.swagger.models.auth.In;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
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
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Data
public class RentDevice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 设备号 */
    @Excel(name = "设备号")
    private String deviceNum;

    /** 设备类型id */
    @Excel(name = "设备类型id")
    private Integer deviceTypeId;

    /** 设备类型名称 */
    @Excel(name = "设备类型名称")
    private String deviceTypeName;

    /** 所属厂家id */
    @Excel(name = "所属厂家id")
    private Integer vendorId;

    /** 所属厂家id */
    @Excel(name = "所属厂家名称")
    private String vendorName;

    /** 删除标识：0未删除 1已删除 */
    @Excel(name = "删除标识：0未删除 1已删除")
    private Integer deleteFlag;
}
