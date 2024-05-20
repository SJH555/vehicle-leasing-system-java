package com.szxj.rent.domain.vo;

import com.szxj.rent.domain.RentVehicle;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Data
public class RentVehicleVo extends RentVehicle {

    /** 品牌名称 */
    private String brandName;

    /** 品牌名称 */
    private String modelName;

      /** 颜色名称 */
    private String colorName;

    /** 负责人名称 */
    private String principalName;

}
