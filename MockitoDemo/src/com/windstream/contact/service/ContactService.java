package com.windstream.contact.service;

import com.windstream.contact.model.Contact;

public interface ContactService {
	public Contact getContact(int contactId) throws Exception;
	public boolean updateContact(Contact contact) throws Exception;
	public void deleteContact(Contact contact) throws Exception;
	public boolean addContact(Contact contact) throws Exception;
}
