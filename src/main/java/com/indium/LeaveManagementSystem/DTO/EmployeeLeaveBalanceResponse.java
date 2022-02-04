package com.indium.LeaveManagementSystem.DTO;

public class EmployeeLeaveBalanceResponse {

    private int empId;
    private int leaveTypeId;
    private int leaveAvailability;
    private String Status;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getLeaveTypeId() {
        return leaveTypeId;
    }

    public void setLeaveTypeId(int leaveTypeId) {
        this.leaveTypeId = leaveTypeId;
    }

    public int getLeaveAvailability() {
        return leaveAvailability;
    }

    public void setLeaveAvailability(int leaveAvailability) {
        this.leaveAvailability = leaveAvailability;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }


}
