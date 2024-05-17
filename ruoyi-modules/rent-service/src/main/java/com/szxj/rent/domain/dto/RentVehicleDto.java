package com.szxj.rent.domain.dto;

import com.szxj.rent.domain.RentVehicle;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;


@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RentVehicleDto extends RentVehicle {

    /** 开始时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String startTime;

    /** 结束时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String endTime;
}
