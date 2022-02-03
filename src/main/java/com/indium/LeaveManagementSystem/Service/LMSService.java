package com.indium.LeaveManagementSystem.Service;

import com.indium.LeaveManagementSystem.DAO.EmployeeDetailsRepository;
import com.indium.LeaveManagementSystem.DTO.EmployeeDetailsResponse;
import com.indium.LeaveManagementSystem.Model.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LMSService {

    @Autowired
    private EmployeeDetailsRepository repository;

    public EmployeeDetailsResponse createEmployeeDetails(EmployeeDetails employeeDetails){
        EmployeeDetailsResponse response=new EmployeeDetailsResponse();

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
}