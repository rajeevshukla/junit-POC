package com.windstream.contact.model;

public class Contact {

	private int contactId;
	private String name;
	private String address;
	private String mobileNumber;
	public Contact(int contactId) {

		this.contactId = contactId;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		Contact contact = (Contact) obj;
		return this.getContactId() == contact.getContactId();
		
	}
	
}
