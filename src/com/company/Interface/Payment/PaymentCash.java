package com.company.Interface.Payment;

import com.company.Interface.Payment.Payment;

public class PaymentCash implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment cash");
    }
}
