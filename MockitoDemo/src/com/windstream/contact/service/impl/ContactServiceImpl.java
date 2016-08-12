package com.windstream.contact.service.impl;

import com.windstream.contact.dao.ContactDao;
import com.windstream.contact.model.Contact;
import com.windstream.contact.service.ContactService;

public class ContactServiceImpl implements ContactService {

	private ContactDao dao;

	public ContactServiceImpl(ContactDao contactDao) {
		this.dao = contactDao;
	}

	@Override
	public Contact getContact(int contactId) throws Exception {

		try {
			dao.getContact(contactId);
			dao.getContact(contactId);
			return  dao.getContact(contactId);

		}catch(Exception exception){
			throw new IllegalArgumentException(exception);
			
			
		}

	}

	@Override
	public boolean updateContact(Contact contact) throws Exception {
		Contact existingContact =  dao.getContact(123);
		return  dao.updateContact(existingContact);
	}

	@Override
	public void deleteContact(Contact contact) throws Exception {
		
		 dao.getContact(contact.getContactId());
		dao.deleteContact(contact);
	}

	@Override
	public boolean addContact(Contact contact) throws Exception {
		
		Contact existingContact = getContact(contact.getContactId());	
		if(existingContact == null)
			throw new IllegalStateException();

		return dao.addContact(contact);
	}

}
