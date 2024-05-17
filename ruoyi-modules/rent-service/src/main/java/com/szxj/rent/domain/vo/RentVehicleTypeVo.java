package com.szxj.rent.domain.vo;

import com.szxj.rent.domain.RentVehicleType;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class RentVehicleTypeVo extends RentVehicleType {

//    /** 是否含有子集 */
//    private Boolean hasChildren = false;

    /** 子集 */
    private List<RentVehicleTypeVo> children = new ArrayList<>();

}
