package com.indium.LeaveManagementSystem.Controller;

import com.indium.LeaveManagementSystem.Model.EmployeeDetails;
import com.indium.LeaveManagementSystem.Model.EmployeeLeaveBalance;
import com.indium.LeaveManagementSystem.Service.EmployeeLeaveBalanceService;
import com.indium.LeaveManagementSystem.Service.LMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LMSController {
    @Autowired
    private LMSService service;
    @Autowired
    private EmployeeLeaveBalanceService elbService;

    String response=null;

    @PostMapping("/EmployeeDetails")
    public String createEmplyeeDetails(@RequestBody EmployeeDetails employeeDetails){

        response=service.createEmployeeDetails(employeeDetails);
        return response;

    }
    @PostMapping("/leaveBalance")
    public String saveEmployeeLeaveBalance(@RequestBody EmployeeLeaveBalance elbalance){
        System.out.println("leave");
        elbService.saveEmployeeLeaveBalance(elbalance);
        return null;
    }


}
