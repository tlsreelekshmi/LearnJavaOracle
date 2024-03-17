package interfaces.paymentinterface;

import java.util.Scanner;

public class PaymentTest {

    static PaymentIntegration payment;

    public static void main (String[] args) {
        payment.clickOnPaymentOption();
        makePayment(payment.isStaging(), payment.authenticationCode());
        payment.verifyPayment();
        payment.showSuccessMessageWithTransaction(payment.getTransactionId());
    }

    public static void makePayment(boolean isStaging, String AuthCode) {
        String code = isStaging ? "stg" : "prd";
        String password = code + "_" + AuthCode;
        System.out.println("Making payment with password - " + password);
    }

    static {
        //This block will run first
        System.out.println("Enter payment method - card or upi");
        String paymentMethod = new Scanner(System.in).nextLine();

        if (paymentMethod.equalsIgnoreCase("card")) {
            payment = new PaymentViaCard();
        } else if (paymentMethod.equalsIgnoreCase("upi")) {
            payment = new PaymentViaUPI();
        }
    }
}
