package com.szxj.rent.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;
import io.swagger.models.auth.In;
import lombok.*;

import java.util.Date;

/**
 * 车辆信息对象 rent_vehicle
 *
 * @author ruoyi
 * @date 2024-05-11
 */
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentVehicle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Integer id;

    /** 车辆品牌id */
    @Excel(name = "车辆品牌id")
    private Integer brandId;

    /** 车辆型号id */
    @Excel(name = "车辆型号id")
    private Integer modelId;

    /** 车辆颜色id */
    @Excel(name = "车辆颜色id")
    private Integer colorId;

    /** 车牌号 */
    @Excel(name = "车牌号")
    private String plateNumber;

    /** 车架号 */
    @Excel(name = "车架号")
    private String frameNumber;

    /** 绑定设备id */
    @Excel(name = "绑定设备id")
    private Integer deviceId;

    /**
     * 购置日期
     */
    @Excel(name = "购置日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date purchaseTime;

    /**
     * 租赁价格
     */
    @Excel(name = "租赁价格")
    private Double price;

    /** 负责人id */
    @Excel(name = "负责人id")
    private Integer principalId;

    /** 车辆状态：0闲置 1出租 2维修 3保养 4停用 */
    @Excel(name = "车辆状态：0闲置 1出租 2维修 3保养 4停用")
    private Integer vehicleStatus;

    /** 删除标识：0未删除 1已删除 */
    @Excel(name = "删除标识：0未删除 1已删除")
    private Integer deleteFlag;

    /** 车辆图片 */
    @Excel(name = "车辆图片")
    private String vehicleImg;
}
