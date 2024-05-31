package com.szxj.rent.domain;

import io.swagger.models.auth.In;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 客户信息对象 rent_customer
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class RentCustomer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Integer id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 年龄 */
    @Excel(name = "年龄")
    private Integer age;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String idCard;

    /** 驾驶证档案号 */
    @Excel(name = "驾驶证档案号")
    private String driverLicenseId;

    /** 租车状态 0非 1是 */
    @Excel(name = "租车状态 0非 1是")
    private Boolean rentalStatus;

    /** 禁止租车 0非 1是 */
    @Excel(name = "禁止租车 0非 1是")
    private Boolean banStatus;

    /** 删除标识 0非 1是 */
    @Excel(name = "删除标识 0非 1是")
    private Integer deleteFlag;

    /** 客户照片 */
    private String customerImg;

    /** 身份证照片 */
    @Excel(name = "身份证照片")
    private String idCardImg;

    /** 驾驶证照片 */
    @Excel(name = "驾驶证照片")
    private String driverLicenseImg;

}
