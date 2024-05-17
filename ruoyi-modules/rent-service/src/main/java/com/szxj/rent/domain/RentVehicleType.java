package com.szxj.rent.domain;

import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;
import lombok.*;

/**
 * 车辆配置对象 rent_vehicle_type
 *
 * @author ruoyi
 * @date 2024-05-14
 */
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentVehicleType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Integer id;

    /** 父级id */
    @Excel(name = "父级id")
    private Integer parentId;

    private String ancestors;

    /** 类型 0品牌 1型号 2颜色 */
    @Excel(name = "类型 0品牌 1型号 2颜色")
    private Integer type;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 排序 */
    @Excel(name = "排序")
    private Integer orderNum;

    /** 逻辑删除 0未删除 1已删除 */
    @Excel(name = "逻辑删除 0未删除 1已删除")
    private Integer deleteFlag;
}
