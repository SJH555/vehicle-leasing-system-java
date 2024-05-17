package com.szxj.rent.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;
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
    private String id;

    /** 车辆品牌id */
    @Excel(name = "车辆品牌id")
    private String brandId;

    /** 车辆型号id */
    @Excel(name = "车辆型号id")
    private String modelId;

    /** 车牌号 */
    @Excel(name = "车牌号")
    private String plateNumber;

    /** 车架号 */
    @Excel(name = "车架号")
    private String frameNumber;

    /** 车辆颜色id */
    @Excel(name = "车辆颜色id")
    private String colorId;

    /** 绑定设备id */
    @Excel(name = "绑定设备id")
    private String deviceId;

    /**
     * 购置日期
     */
    @Excel(name = "购置日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date purchaseTime;

    /**
     * 租赁价格
     */
    @Excel(name = "租赁价格")
    private Double price;

    /** 负责人id */
    @Excel(name = "负责人id")
    private String principalId;

    /** 车辆状态：0闲置 1出租 2维修 3保养 4停用 */
    @Excel(name = "车辆状态：0闲置 1出租 2维修 3保养 4停用")
    private Long vehicleStatus;

    /** 删除标识：0未删除 1已删除 */
    @Excel(name = "删除标识：0未删除 1已删除")
    private String deleteFlag;

    /** 车辆图片 */
    @Excel(name = "车辆图片")
    private String vehicleImg;
}
