package com.indium.LeaveManagementSystem.Controller;

import com.indium.LeaveManagementSystem.Model.EmployeeDetails;
import com.indium.LeaveManagementSystem.Service.LMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LMSController {
    @Autowired
    private LMSService service;

    String response=null;

    @PostMapping("/EmployeeDetails")
    public String createEmplyeeDetails(@RequestBody EmployeeDetails employeeDetails){

        response=service.createEmployeeDetails(employeeDetails);
        return response;

    }

}