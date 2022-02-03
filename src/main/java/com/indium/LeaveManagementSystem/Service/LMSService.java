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
        System.out.println("**** inside service");
        repository.save(employeeDetails);
        System.out.println("**** inside manish");
        return "Employee Details Added";


    }
}