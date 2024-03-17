package interfaces.paymentinterface;

import java.util.Scanner;

public class PaymentViaCard implements PaymentIntegration {

    String tesNetwork = "prod";

    @Override
    public boolean isStaging() {
        return "stage".equals(tesNetwork);
    }

    @Override
    public String authenticationCode() {
        System.out.println("Enter auth code");
        String authCode = new Scanner(System.in).nextLine();
        return authCode;
    }


    @Override
    public void clickOnPaymentOption() {
        System.out.println("click on credit card pay button...");
    }

    @Override
    public void verifyPayment() {
        System.out.println("Verifying card payment methods. Connecting with debit card payment system");
    }

    @Override
    public String getTransactionId() {
        return "f31-333-2d4-7rvt-3qc-df5";
    }

    @Override
    public void showSuccessMessageWithTransaction(String s) {
        System.out.println("Debit card payment successful. Transaction ID : " + s);
    }
}
