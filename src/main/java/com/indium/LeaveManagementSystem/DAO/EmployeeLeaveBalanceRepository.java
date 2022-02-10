package com.indium.LeaveManagementSystem.DAO;

import com.indium.LeaveManagementSystem.Model.EmployeeLeaveBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeLeaveBalanceRepository extends JpaRepository<EmployeeLeaveBalance,Integer> {

}
