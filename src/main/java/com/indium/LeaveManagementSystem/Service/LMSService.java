package com.indium.LeaveManagementSystem.Service;

import com.indium.LeaveManagementSystem.DAO.EmployeeDetailsRepository;
import com.indium.LeaveManagementSystem.Model.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LMSService {

    @Autowired
    private EmployeeDetailsRepository repository;

    public String createEmployeeDetails(EmployeeDetails employeeDetails){

        repository.save(employeeDetails);

        return "Employee Details Added";


    }
}