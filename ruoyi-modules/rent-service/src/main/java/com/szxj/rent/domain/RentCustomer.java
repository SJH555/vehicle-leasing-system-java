package com.szxj.rent.domain;

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
public class RentCustomer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 年龄 */
    @Excel(name = "年龄")
    private String age;

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
    private String rentalStatus;

    /** 禁止租车 0非 1是 */
    @Excel(name = "禁止租车 0非 1是")
    private String banStatus;

    /** 删除标识 0非 1是 */
    @Excel(name = "删除标识 0非 1是")
    private String deleteFlag;

    /** 身份证照片 */
    @Excel(name = "身份证照片")
    private String idCradImg;

    /** 驾驶证照片 */
    @Excel(name = "驾驶证照片")
    private String driverLicenseImg;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setAge(String age)
    {
        this.age = age;
    }

    public String getAge()
    {
        return age;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone()
    {
        return phone;
    }
    public void setIdCard(String idCard)
    {
        this.idCard = idCard;
    }

    public String getIdCard()
    {
        return idCard;
    }
    public void setDriverLicenseId(String driverLicenseId)
    {
        this.driverLicenseId = driverLicenseId;
    }

    public String getDriverLicenseId()
    {
        return driverLicenseId;
    }
    public void setRentalStatus(String rentalStatus)
    {
        this.rentalStatus = rentalStatus;
    }

    public String getRentalStatus()
    {
        return rentalStatus;
    }
    public void setBanStatus(String banStatus)
    {
        this.banStatus = banStatus;
    }

    public String getBanStatus()
    {
        return banStatus;
    }
    public void setDeleteFlag(String deleteFlag)
    {
        this.deleteFlag = deleteFlag;
    }

    public String getDeleteFlag()
    {
        return deleteFlag;
    }
    public void setIdCradImg(String idCradImg)
    {
        this.idCradImg = idCradImg;
    }

    public String getIdCradImg()
    {
        return idCradImg;
    }
    public void setDriverLicenseImg(String driverLicenseImg)
    {
        this.driverLicenseImg = driverLicenseImg;
    }

    public String getDriverLicenseImg()
    {
        return driverLicenseImg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("age", getAge())
            .append("phone", getPhone())
            .append("idCard", getIdCard())
            .append("driverLicenseId", getDriverLicenseId())
            .append("rentalStatus", getRentalStatus())
            .append("banStatus", getBanStatus())
            .append("deleteFlag", getDeleteFlag())
            .append("idCradImg", getIdCradImg())
            .append("driverLicenseImg", getDriverLicenseImg())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
