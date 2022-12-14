package com.Bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

	private AddressBook addressBook;

    private Scanner sc = new Scanner(System.in);

    public AddressBookMain(){
        addressBook = new AddressBook();
    }
    public void addContact(){

        System.out.println("Enter first: ");
        String firstName = sc.next();
        System.out.println("enter last name");
        String lastName = sc.next();
        System.out.println("Enter street : ");
        String street = sc.next();
        System.out.println("Enter city ");
        String city = sc.next();
        System.out.println("state");
        String state = sc.next();
        System.out.println("Enter zip : ");
        int zip = sc.nextInt();
        System.out.println("Enter contact number : ");
        long phoneNo = sc.nextLong();
        System.out.println("Enter email id : ");
        String email = sc.next();
                     
        addressBook.createContact(firstName,lastName,street,city,state,zip,phoneNo,email);

    }

    public void editContact(String name){
        for(Contact contact : addressBook.contacts){
            if(contact.getFirstName().equals(name) || contact.getLastName().equals(name)){
                System.out.println("What you want to edit : \n" +
                        "1.first name \t" +
                        "2.last name \t" +
                        "3.street \t" +
                        "4.city \t" +
                        "5.state \t" +
                        "6.zip \t" +
                        "7.contact number \t" +
                        "8.email");
                int ch = sc.nextInt();
                switch (ch){
                    case 1:
                        System.out.println("Enter first name :");
                        String firstName = sc.next();
                        contact.setFirstName(firstName);
                        break;
                    case 2:
                        System.out.println("Enter last name :");
                        String lastName = sc.next();
                        contact.setLastName(lastName);
                        break;
                    case 3:
                        System.out.println("Enter street :");
                        String street = sc.next();
                        contact.setStreet(street);
                        break;
                    case 4:
                        System.out.println("Enter city :");
                        String city = sc.next();
                        contact.setCity(city);
                        break;
                    case 5:
                        System.out.println("Enter state :");
                        String state = sc.next();
                        contact.setState(state);
                        break;
                    case 6:
                        System.out.println("Enter zip :");
                        int zip = sc.nextInt();
                        contact.setZip(zip);
                        break;
                    case 7:
                        System.out.println("Enter contact number :");
                        long contactNo = sc.nextLong();
                        contact.setPhoneNo(contactNo);
                        break;
                    case 8:
                        System.out.println("Enter email :");
                        String email = sc.next();
                        contact.setEmail(email);
                        break;
                    default:
                        System.out.println("Invalid input.");
                }
                return;
            }
        }
        System.out.println(name + " not found!");
    }
    public void deleteContact(String name){
        for(Contact contact : addressBook.contacts){
            if(contact.getFirstName().equals(name) || contact.getLastName().equals(name)){
                addressBook.contacts.remove(contact);
                return;
            }
        }
        System.out.println(name + " not found!");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBookMain addressBookMain = new AddressBookMain();

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("1.Add contact \t " +
                    "2.Edit existing contact \t" +
                    "3.Delete contact \t" +
                    "0.Exit");
            int ch = scan.nextInt();
            switch (ch){
                    case 0:
                    System.exit(0);
                    break;
                   case 1:
                    addressBookMain.addContact();
                    break;
                   case 2:
                    System.out.println("Enter person name");
                    String name = scan.next();
                    addressBookMain.editContact(name);
                    break;
                    case 3:
                    System.out.println("Enter person name");
                    String name1 = scan.next();
                    addressBookMain.deleteContact(name1);
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }

    }
	}
class AddressBook {
	ArrayList<Contact> contacts = new ArrayList<>();

    public void createContact(String firstName, String lastName, String street, String city, String state, int zip, long phoneNo, String email){
        Contact contact = new Contact(firstName,lastName,street,city,state,zip,phoneNo,email);
        contacts.add(contact);
    }
	}
