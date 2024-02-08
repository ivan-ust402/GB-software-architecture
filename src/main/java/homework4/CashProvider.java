package homework4;

public class CashProvider {
    private long cardNumber;
    private boolean isAuth;

    public boolean processPayment(float amount) {
        return true;
    }

    public boolean cancelPayment(float amount) {
        return true;
    }

    public boolean customerAuth(Customer customer) {
        return true;
    }
}
