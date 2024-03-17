package interfaces.paymentinterface;

public class PaymentViaUPI implements PaymentIntegration {

    String environment = "stage";

    @Override
    public boolean isStaging() {
        return "stage".equals(environment);
    }

    @Override
    public String authenticationCode() {
        return getAuthCodeFromDataBase();
    }

    private String getAuthCodeFromDataBase() {
        return "1111";
    }

    @Override
    public void clickOnPaymentOption() {
        System.out.println("click on google pay button...");
        System.out.println("open google pay app...");
    }

    @Override
    public void verifyPayment() {
        System.out.println("Verifying payment with UPI provider");
        System.out.println("Verifying UPI user details");

    }

    @Override
    public String getTransactionId() {
        return "s2k3c45u6ep25e-sd4sn342df3-od1s5n7d";
    }

    @Override
    public void showSuccessMessageWithTransaction(String s ) {
        System.out.println("Amount credited from google pay. Transaction ID" + s);
    }
}
