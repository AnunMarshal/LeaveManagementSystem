package com.indium.LeaveManagementSystem.DAO;

import com.indium.LeaveManagementSystem.Model.LeaveType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveTypeRepository extends JpaRepository<LeaveType,Integer> {
}
