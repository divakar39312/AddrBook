package com.Bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

	private AddressBook addressBook;

    public AddressBookMain(){
        addressBook = new AddressBook();
    }
    public void addContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first and last name : ");
        String firstName = sc.next();
        String lastName = sc.next();
        System.out.println("Enter street : ");
        String street = sc.next();
        System.out.println("Enter city and state : ");
        String city = sc.next();
       
        String state = sc.next();
        System.out.println("Enter zip : ");
        int zip = sc.nextInt();
        System.out.println("Enter contact number : ");
        long phoneNo = sc.nextLong();
        System.out.println("Enter email id : ");
        String email = sc.next();

        addressBook.createContact(firstName,lastName,street,city,state,zip,phoneNo,email);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.addContact();
        

    }
	}
class AddressBook {
ArrayList<Contact> contacts = new ArrayList<>();

public void createContact(String firstName, String lastName, String street, String city, String state, int zip, long phoneNo, String email){
    Contact contact = new Contact(firstName,lastName,street,city,state,zip,phoneNo,email);
    contacts.add(contact);
}
	}
