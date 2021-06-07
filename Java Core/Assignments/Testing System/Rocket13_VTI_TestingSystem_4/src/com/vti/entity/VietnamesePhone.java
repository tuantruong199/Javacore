package com.vti.entity;

import java.util.ArrayList;
import java.util.Iterator;
public class VietnamesePhone extends Phone{
	private ArrayList<Contacts> contacts;
	public VietnamesePhone() {
		contacts = new ArrayList<Contacts>();
	}

	@Override
	public void insertContact(String name, String phone) {
		Contacts contact= new Contacts(name, phone);
		contacts.add(contact);
	}

	@Override
	public void removeContact(String name) {
		contacts.removeIf(contact -> contact.getName().equals(name));
	}

	@Override
	public void updateContact(String name, String newPhone) {
		for (Contacts contacts2 : contacts) {
			if (contacts2.getName().equals(name)) {
				contacts2.setPhone(newPhone);
			}
		}
		
	}

	@Override
	public void searchContact(String name) {
		for (Contacts contacts2 : contacts) {
			if (contacts2.getName().equals(name)) {
				System.out.println(contacts2);
			}
		}
		
	}

	@Override
	public void showContact() {
		for (Contacts contacts2 : contacts) {
				System.out.println(contacts2);
			
		}
		
	}
	
}
