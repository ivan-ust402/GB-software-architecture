package homework4;

public class CashProvider {
    private long cardNumber;
    private boolean isAuth;


    /**
     * метод оплаты, входящим аргументом является стоимость
     * в результате отработки данного метода возвращаем булеан значение успешности
     * или провала выполнения возврата билета
     * */
    public boolean processPayment(float amount) {
        return true;
    }

    /**
     * метод отмены оплаты, входящим аргументом является стоимость
     * в результате отработки данного метода возвращаем булеан значение успешности
     * или провала выполнения возврата билета
     * */
    public boolean cancelPayment(float amount) {
        return true;
    }

    /**
     * метод проверки авторизации покупателя, входящим аргументом является покупатель
     * в результате отработки данного метода возвращаем булеан значение
     * подтверждения или опровержения авторизации покупателя
     * */
    public boolean customerAuth(Customer customer) {
        return true;
    }
}
