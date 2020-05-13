package com.tanmay.spring.constructor.injection;

public class Customer {
	private int custId;
	private String custName;
	private String emailId;
	private long contactNo;

	/**
	 * @param custId
	 * @param custName
	 * @param emailId
	 * @param contactNo
	 */
	public Customer() {
	}

	public Customer(int custId, String custName, String emailId, long contactNo) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.emailId = emailId;
		this.contactNo = contactNo;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	public void printCustomerDetails() {
		System.out.println("Customer Id:  "+custId);
		System.out.println("Customer Name:  "+custName);
		System.out.println("EmailID:  "+emailId);
		System.out.println("Contact No:  "+contactNo);
	}

}
