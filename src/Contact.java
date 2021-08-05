import java.util.*;

public class Contact implements AddressBookImplementing {
    String name;
    String phone;
//    List<Contact> contactList = new ArrayList<>();
    Map<String, Contact> contactMap = new HashMap<>();
    public Contact() {
    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("%5s%6s%5s | %1s%21s%14s",
                "",getName(), "",
                "",getPhone(), "");
    }

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
                "","Contact Name", "",
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
                    "","Contact Name", "",
                    "","Phone number", "");
            System.out.printf("%5s%8s%5s | %1s%21s%14s \n",
                    "",contactMap.get(name).getName(), "",
                    "",contactMap.get(name).getPhone(), "");
        } else {
            System.out.println("Not Found");
        }
    }
}
