package com.indium.LeaveManagementSystem.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Data
@Setter
@Getter
@Entity
public class EmployeeLeaveBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;
    private int leaveTypeId;
    private int leaveAvailability;
    private Date createdAt;
    private Date UpdatedAt;
    private String createdBy;
    private String updatedBy;
    private String Status;

    public void setCreatedAt(Long createdAt) {
     Date date = new Date(createdAt);

        this.createdAt = date;
    }
    public void setUpdatedAt(Long updatedAt) {
        Date date = new Date(updatedAt);
        UpdatedAt = date;
    }






}
