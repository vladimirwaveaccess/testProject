package com.company.LS7OOP;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("8067123456789", "Apple", 4.6);
        Phone phone2 = new Phone("050987654321", "Samsung");
        Phone phone3 = new Phone();

//        System.out.println(phone1.getModel());
//        System.out.println(phone1.getWeight());
//        System.out.println(phone1.getNumber());

//        phone1.receiveCall("Mother", "123456789");
//        System.out.println("Phone number is " + phone1.getNumber());
//        phone1.receiveCall("Father");
//        phone1.sendMessage("Hello!!!", "123456789", "987654321", "123", "456", "789");
//        phone1.sendMessage("Bye!!!!", "123", "456", "789");
        System.out.println(Phone.getCount());

    }
}
