package com.company.Interface.Payment;

import com.company.Interface.Payment.Payment;

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p = new PaymentCard();
        System.out.println("go to shop");
        System.out.println("get goods");
        p.pay();
        System.out.println("go go");
    }
}
