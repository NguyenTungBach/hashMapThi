package controller;

import entity.Contact;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactController implements AddressBookImplementing {
    Map<String, Contact> contactMap = new HashMap<>();
    @Override
    public void addTelephoneNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Phone: ");
        String phone = scanner.nextLine();
        Contact contact = new Contact(name,phone);
        contactMap.put(name,contact);
    }

    @Override
    public void Display() {
        System.out.println("Address Book");
        System.out.printf("%5s%8s%5s | %1s%21s%14s \n",
                "","entity.Contact Name", "",
                "","Phone number", "");
        for (Map.Entry<String, Contact> entry:
                contactMap.entrySet()){
            System.out.println(entry.getValue().toString());
        }
    }

    @Override
    public void findTelephoneNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        if (contactMap.containsKey(name)){
            System.out.println("Address Book");
            System.out.printf("%5s%8s%5s | %1s%21s%14s \n",
                    "","entity.Contact Name", "",
                    "","Phone number", "");
            System.out.printf("%5s%8s%5s | %1s%21s%14s \n",
                    "",contactMap.get(name).getName(), "",
                    "",contactMap.get(name).getPhone(), "");
        } else {
            System.out.println("Not Found");
        }
    }
}
