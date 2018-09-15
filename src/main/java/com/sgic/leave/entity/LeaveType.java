package com.sgic.leave.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LeaveType {
	@Id
	private Integer id;
	private String leaveType;
	private String allocatedDays;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getAllocatedDays() {
		return allocatedDays;
	}

	public void setAllocatedDays(String allocatedDays) {
		this.allocatedDays = allocatedDays;
	}

}
