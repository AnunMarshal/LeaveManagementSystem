package com.indium.LeaveManagementSystem.Controller;

import com.indium.LeaveManagementSystem.DTO.EmployeeDetailsResponse;
import com.indium.LeaveManagementSystem.DTO.EmployeeLeaveBalanceResponse;
import com.indium.LeaveManagementSystem.DTO.LeaveTypeResponse;
import com.indium.LeaveManagementSystem.Model.EmployeeDetails;
import com.indium.LeaveManagementSystem.Model.EmployeeLeaveBalance;
import com.indium.LeaveManagementSystem.Model.LeaveType;
import com.indium.LeaveManagementSystem.Service.LMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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


      return service.createEmployeeLeaveBalance(employeeLeaveBalance);

    }
        @GetMapping("/getLeaveBalance")
	    public List<EmployeeLeaveBalance> getLeaveBalance(){
	    	return service.getLeaveBalance();
	    }

        @PutMapping("/updateLeaveBalance")
       public void updateLeaveBalance(@RequestBody EmployeeLeaveBalance leaveBalance){
       // return service.updateLeaveBalance(leaveBalance);


       }
       @DeleteMapping("/deleteLeaveBalance/{id}")
       public void deleteLeaveBalance(@PathVariable int id){
        service.deleteLeaveBalance(id);

       }

     @PostMapping("/createLeaveType")
     public LeaveTypeResponse createLeaveType(@RequestBody LeaveType leaveType){

        LeaveTypeResponse response=new LeaveTypeResponse();

        response=service.createLeaveType(leaveType);

        return response;

    }


}
