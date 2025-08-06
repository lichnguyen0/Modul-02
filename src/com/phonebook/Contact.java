package com.phonebook;

public class Contact {

    private String phoneNumber;
    private String name;
    private String email;

    // khoi tao
    public Contact(String phoneNumber, String name, String email) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
    }

    public Contact() {
    }

    ;

    //get & set
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Phuong thuc in ra thong tin duoi dang chuoi
    @Override
    public String toString() {
        return phoneNumber + ", " + name + ", " + email;
    }


    public String toDataString() {
        return phoneNumber + "," + name + "," + email;
    }

    public static Contact fromDataString(String line) {
        String[] parts = line.split(",");
        if (parts.length == 3) {
            return new Contact(parts[0].trim(), parts[1].trim(), parts[2].trim());
        }
        return null;
    }
}
