package com.bank.rest.api.dto;

import java.util.Date;

public class CustomerDetails {

	private Long customer_id;

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private Long mobileNum;
	private Date joinDate;
	private Date updatedDate;
	private String status;

	public CustomerDetails() {

	}

	public CustomerDetails(Long customer_id, String firstName, String lastName, String address, String city,
			String state, Long mobileNum, Date joinDate, Date updatedDate, String status) {
		super();
		this.customer_id = customer_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.mobileNum = mobileNum;
		this.joinDate = joinDate;
		this.updatedDate = updatedDate;
		this.status = status;
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(Long mobileNum) {
		this.mobileNum = mobileNum;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CustomerDetails [customer_id=" + customer_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", mobileNum=" + mobileNum
				+ ", joinDate=" + joinDate + ", updatedDate=" + updatedDate + ", status=" + status + "]";
	}

}