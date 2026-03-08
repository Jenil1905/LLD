package com.example.payments;

public class SafeCashAdapter implements PaymentGateway{
    private SafeCashClient safeCashClient;

    public SafeCashAdapter(SafeCashClient safeCashClient) {
        this.safeCashClient = safeCashClient;
    }
    @Override
    String charge(String customerId, int amountCents){
        safeCashClient.createPayment(amountCents, customerId);
    }
    
}
