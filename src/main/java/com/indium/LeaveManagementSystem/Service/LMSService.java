package com.indium.LeaveManagementSystem.Service;

import com.indium.LeaveManagementSystem.DAO.EmployeeDetailsRepository;
import com.indium.LeaveManagementSystem.DAO.EmployeeLeaveBalanceRepository;
import com.indium.LeaveManagementSystem.DTO.EmployeeDetailsResponse;
import com.indium.LeaveManagementSystem.DTO.EmployeeLeaveBalanceResponse;
import com.indium.LeaveManagementSystem.Model.EmployeeDetails;
import com.indium.LeaveManagementSystem.Model.EmployeeLeaveBalance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LMSService {

    @Autowired
    private EmployeeDetailsRepository repository;
    @Autowired
    private EmployeeLeaveBalanceRepository elbRepository;

    public EmployeeDetailsResponse createEmployeeDetails(EmployeeDetails employeeDetails) {
        EmployeeDetailsResponse response = new EmployeeDetailsResponse();

        employeeDetails.setCreatedAt(System.currentTimeMillis());

        repository.save(employeeDetails);

        response.setEmpId(employeeDetails.getEmpId());
        response.setName(employeeDetails.getName());
        response.setRole(employeeDetails.getRole());
        response.setAddress(employeeDetails.getAddress());
        response.setPhone(employeeDetails.getPhone());
        response.setEmail(employeeDetails.getEmail());
        response.setStatus(employeeDetails.getStatus());

        return response;
    }
    public EmployeeLeaveBalanceResponse createEmployeeLeaveBalance(EmployeeLeaveBalance employeeLeaveBalance){
        EmployeeLeaveBalanceResponse elbResponse = new EmployeeLeaveBalanceResponse();
       employeeLeaveBalance.setCreatedAt(System.currentTimeMillis());
        elbRepository.save(employeeLeaveBalance);

        elbResponse.setEmpId(employeeLeaveBalance.getEmpId());
        elbResponse.setLeaveTypeId(employeeLeaveBalance.getLeaveTypeId());
        elbResponse.setLeaveAvailability(employeeLeaveBalance.getLeaveAvailability());
        elbResponse.setStatus(employeeLeaveBalance.getStatus());
        return elbResponse;


    }



   
}