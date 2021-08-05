import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();
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
                    contact.Display();
                    break;
                case 3:
                    contact.findTelephoneNumber();
                    break;
            }
            if (choice == 4){
                System.out.println("Finnish\n");
                break;
            }
        }
    }
}
