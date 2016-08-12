package com.windstream.contact.dao;

import java.sql.SQLException;

import com.windstream.contact.model.Contact;

public interface ContactDao {

	public Contact getContact(int contactId) throws SQLException;
	public boolean updateContact(Contact contact) throws SQLException;
	public void deleteContact(Contact contact) throws SQLException;
	public boolean addContact(Contact contact) throws SQLException;
	
}
