package com.exadel.hotdesk.parking_spot.dto;

import com.exadel.hotdesk.parking.dto.ParkingResponseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
public class ParkingSpotResponseDto extends ParkingSpotBaseDto {

    private Long id;
    private ParkingResponseDto parkingResponseDto;
    private LocalDateTime created;
    private LocalDateTime modified;

}
