package com.indium.LeaveManagementSystem.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeLeaveBalanceResponse {

    private int empId;
    private int leaveTypeId;
    private int leaveAvailability;
    private String Status;


} 
