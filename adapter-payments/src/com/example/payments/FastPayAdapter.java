package com.example.payments;

public class FastPayAdapter implements PaymentGateway{
    private FastPayClient fastPay;

    public FastPayAdapter(FastPayClient fastPay) {
        this.fastPay = fastPay;
    }
    @Override
    String charge(String customerId, int amountCents){
        fastPay.payNow(customerId, amountCents);
    }
    
}
