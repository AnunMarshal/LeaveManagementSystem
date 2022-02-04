package com.indium.LeaveManagementSystem.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter @Setter
public class EmployeeDetailsRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;
    private String name;
    private String role;
    private String address;
    private String phone;
    private String email;
    private Date createdAt;
    private Date UpdatedAt;
    private String createdBy;
    private String updatedBy;
    private String Status;


    public void setCreatedAt(Long createdAt) {
        Date d = new Date(createdAt);
        this.createdAt = d;
    }

    public void setUpdatedAt(Long updatedAt) {
        Date d = new Date(updatedAt);
        this.UpdatedAt = d;
    }
}