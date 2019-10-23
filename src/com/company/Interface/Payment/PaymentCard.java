package com.company.Interface.Payment;

import com.company.Interface.Payment.Payment;

public class PaymentCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment card");
    }
}
