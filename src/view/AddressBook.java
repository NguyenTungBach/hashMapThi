package view;

import controller.ContactController;

import java.util.Scanner;

public class AddressBook{
    Scanner scanner = new Scanner(System.in);
    ContactController contact = new ContactController();
    public void genarateMenu(){
        while (true) {
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    contact.addTelephoneNumber();
                    break;
                case 2:
                    contact.findTelephoneNumber();
                    break;
                case 3:
                    contact.Display();
                    break;
            }
            if (choice == 4){
                System.out.println("Finnish\n");
                break;
            }
        }
    }
}
