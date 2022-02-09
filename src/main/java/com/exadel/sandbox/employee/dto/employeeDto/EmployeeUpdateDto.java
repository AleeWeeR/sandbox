package com.exadel.sandbox.employee.dto.employeeDto;

import com.exadel.sandbox.employee.dto.tgInfoDto.TgInfoResponseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
public class EmployeeUpdateDto extends EmployeeBaseDto{
    private Integer preferredSeat;
    private LocalDateTime employmentStart;
    private LocalDateTime employmentEnd;
}
