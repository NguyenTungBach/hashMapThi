package entity;

import java.util.*;

public class Contact {
    String name;
    String phone;
//    List<entity.Contact> contactList = new ArrayList<>();

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
}
