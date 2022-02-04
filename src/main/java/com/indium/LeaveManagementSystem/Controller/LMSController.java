package com.indium.LeaveManagementSystem.Controller;

import com.indium.LeaveManagementSystem.DTO.EmployeeDetailsResponse;
import com.indium.LeaveManagementSystem.DTO.EmployeeLeaveBalanceResponse;
import com.indium.LeaveManagementSystem.DTO.LeaveTypeResponse;
import com.indium.LeaveManagementSystem.Model.EmployeeDetails;
import com.indium.LeaveManagementSystem.Model.EmployeeLeaveBalance;
import com.indium.LeaveManagementSystem.Model.LeaveType;
import com.indium.LeaveManagementSystem.Service.LMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LMSController {

    @Autowired
    private LMSService service;

    @PostMapping("/EmployeeDetails")
    public EmployeeDetailsResponse createEmplyeeDetails(@RequestBody EmployeeDetails employeeDetails){

        EmployeeDetailsResponse response=new EmployeeDetailsResponse();

        response=service.createEmployeeDetails(employeeDetails);

        return response;

    }
    @PostMapping("/LeaveBalance")
    public EmployeeLeaveBalanceResponse createEmployeeLeaveBalance(@RequestBody EmployeeLeaveBalance employeeLeaveBalance){

        EmployeeLeaveBalanceResponse elbResponse = new EmployeeLeaveBalanceResponse();
        elbResponse=service.createEmployeeLeaveBalance(employeeLeaveBalance);
      return elbResponse;

    }


    @PostMapping("/createLeaveType")
    public LeaveTypeResponse createLeaveType(@RequestBody LeaveType leaveType){

        LeaveTypeResponse response=new LeaveTypeResponse();

        response=service.createLeaveType(leaveType);

        return response;

    }


}
