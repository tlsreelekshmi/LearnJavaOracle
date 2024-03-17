package interfaces.paymentinterface;

public interface PaymentIntegration {

    boolean isStaging();

    String authenticationCode();

    void clickOnPaymentOption();

    void verifyPayment();

    String getTransactionId();

    void showSuccessMessageWithTransaction(String s);
}
