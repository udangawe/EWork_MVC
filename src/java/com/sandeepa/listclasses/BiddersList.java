package com.sandeepa.listclasses;

import java.sql.Date;

public class BiddersList {

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getYourbid() {
        return yourbid;
    }

    public void setYourbid(String yourbid) {
        this.yourbid = yourbid;
    }

    public String getEmployeeusername() {
        return employeeusername;
    }

    public void setEmployeeusername(String employeeusername) {
        this.employeeusername = employeeusername;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEstimatedvalue() {
        return estimatedvalue;
    }

    public void setEstimatedvalue(String estimatedvalue) {
        this.estimatedvalue = estimatedvalue;
    }

    public Date getTaskdate() {
        return taskdate;
    }

    public void setTaskdate(Date taskdate) {
        this.taskdate = taskdate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String taskid;
    private String yourbid;
    private String employeeusername;
    private String task;
    private String category;
    private String estimatedvalue;
    private Date taskdate;
    private String username;
}
