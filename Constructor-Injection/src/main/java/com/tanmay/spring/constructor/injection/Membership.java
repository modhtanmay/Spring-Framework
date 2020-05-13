package com.tanmay.spring.constructor.injection;

public class Membership {
	private int membershipId;
	private String membershipType;
	private int visitsPerYear;
	private Customer customer;

	/**
	 * @param membershipId
	 * @param membershipType
	 * @param visitsPerYear
	 * @param customer
	 */
	public Membership() {

	}

	public Membership(int membershipId, String membershipType, int visitsPerYear, Customer customer) {
		super();
		this.membershipId = membershipId;
		this.membershipType = membershipType;
		this.visitsPerYear = visitsPerYear;
		this.customer = customer;
	}

	public int getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(int membershipId) {
		this.membershipId = membershipId;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

	public int getVisitsPerYear() {
		return visitsPerYear;
	}

	public void setVisitsPerYear(int visitsPerYear) {
		this.visitsPerYear = visitsPerYear;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void printMembershipDetails() {
		System.out.println("MemberShip ID:  "+membershipId);
		System.out.println("MemberShip Type:  "+membershipType);
		System.out.println("Member VisitsPerYear:  "+visitsPerYear);

		System.out.println("Invoking Customer Object and Print Customer Details");
		customer.printCustomerDetails();

		

	}
	

}
