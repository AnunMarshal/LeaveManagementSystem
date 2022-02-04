package com.indium.LeaveManagementSystem.Service;

import com.indium.LeaveManagementSystem.DAO.EmployeeDetailsRepository;
import com.indium.LeaveManagementSystem.DAO.EmployeeLeaveBalanceRepository;
import com.indium.LeaveManagementSystem.DAO.LeaveTypeRepository;
import com.indium.LeaveManagementSystem.DTO.EmployeeDetailsResponse;
import com.indium.LeaveManagementSystem.DTO.EmployeeLeaveBalanceResponse;
import com.indium.LeaveManagementSystem.DTO.LeaveTypeResponse;
import com.indium.LeaveManagementSystem.Model.EmployeeDetails;
import com.indium.LeaveManagementSystem.Model.EmployeeLeaveBalance;
import com.indium.LeaveManagementSystem.Model.LeaveType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LMSService {

    @Autowired
    private EmployeeDetailsRepository repository;
    @Autowired
    private EmployeeLeaveBalanceRepository elbRepository;
    @Autowired
    private LeaveTypeRepository leaveTypeRepository;

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

    public LeaveTypeResponse createLeaveType(LeaveType leaveType){

        LeaveTypeResponse response=new LeaveTypeResponse();

        leaveType.setCreatedAt(System.currentTimeMillis());

        leaveTypeRepository.save(leaveType);

        response.setId(leaveType.getId());
        response.setType(leaveType.getType());
        response.setStatus(leaveType.getStatus());

        return response;
    }




   
}