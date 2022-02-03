package com.indium.LeaveManagementSystem.Service;

import com.indium.LeaveManagementSystem.DAO.EmployeeLeaveBalanceRepository;
import com.indium.LeaveManagementSystem.Model.EmployeeLeaveBalance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeLeaveBalanceService {
    @Autowired
 private EmployeeLeaveBalanceRepository elbRepository;


    public String saveEmployeeLeaveBalance(EmployeeLeaveBalance elbalance){
        elbRepository.save(elbalance);
        return "Employee Leave balance added";
    }
}
