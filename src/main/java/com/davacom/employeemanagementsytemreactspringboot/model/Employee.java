package com.davacom.employeemanagementsytemreactspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    private Long employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeEmail;
    private ROLE role;
    private Instant createdDate;
}
