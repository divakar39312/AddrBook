package com.Bridgelabz;

import java.util.ArrayList;

public class AddressBookMain {

	public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();


      }
	}
	class AddressBook {

	    ArrayList<Contact> contacts = new ArrayList<>();

	    public void createContact(String firstName, String lastName, String street, String city, String state, int zip, long phoneNo, String email){
	        Contact contact = new Contact(firstName,lastName,street,city,state,zip,phoneNo,email);
	        contacts.add(contact);
	    }
	}
