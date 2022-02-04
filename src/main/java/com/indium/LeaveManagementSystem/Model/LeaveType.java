package com.indium.LeaveManagementSystem.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class LeaveType {

    @Id
    private int id;
    private String type;
    private Date createdAt;
    private Date UpdatedAt;
    private String createdBy;
    private String updatedBy;
    private String Status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        Date d = new Date(createdAt);
        this.createdAt = d;
    }

    public Date getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        Date d = new Date(updatedAt);
        UpdatedAt = d;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
