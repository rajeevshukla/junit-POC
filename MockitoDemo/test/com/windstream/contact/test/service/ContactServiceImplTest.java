package com.windstream.contact.test.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.windstream.contact.dao.ContactDao;
import com.windstream.contact.model.Contact;
import com.windstream.contact.service.impl.ContactServiceImpl;


public class ContactServiceImplTest {

	@Mock
	ContactDao contactDao;
    
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	

	@Test
	public void shouldAddContact(){
      
		
	}
	
	@Test
	public void shouldGetContact() throws Exception{
		
		Contact contact = new Contact(123);
		contact.setContactId(123);
        ContactServiceImpl contactServiceImpl = new ContactServiceImpl(contactDao);
        when(contactDao.getContact(123)).thenReturn(contact);
        
        Contact contact1 =  contactServiceImpl.getContact(123);
        
        assertEquals(contact, contact1);
        verify(contactDao,atLeast(2)).getContact(123);
	}

	@Test(expected= IllegalArgumentException.class)
	public void shouldThrowExceptionWhileGetingContact() throws Exception{
		Contact contact = new Contact(0);
		contact.setContactId(123);
        ContactServiceImpl contactServiceImpl = new ContactServiceImpl(contactDao);
        when(contactDao.getContact(0)).thenThrow(IllegalArgumentException.class);
        contactServiceImpl.getContact(0);
	}

	@Test
	public void shouldDeleteContact() throws SQLException,Exception{
         //stubbing void method 
		ContactServiceImpl contactServiceImpl = new ContactServiceImpl(contactDao);
		when(contactDao.getContact(123)).thenReturn(new Contact(123));
		doNothing().when(contactDao).deleteContact(new Contact(123));
		
		contactServiceImpl.deleteContact(new Contact(123));
		
		verify(contactDao).getContact(123);
		verify(contactDao).deleteContact(new Contact(123));
		
	}

	@Test
	public void shouldUpdateContact(){
   
		
		
	}
	

}
