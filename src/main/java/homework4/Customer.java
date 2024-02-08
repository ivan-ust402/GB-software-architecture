package homework4;

import java.util.ArrayList;
import java.util.UUID;

public class Customer {
    private UUID customerId;
    private String name;

    private String email;
    private ArrayList<Ticket> tickets;
    private CashProvider cashProvider;


    public Customer(UUID customerId,
                    String name, String email,
                    ArrayList<Ticket> tickets) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.tickets = tickets;
        this.cashProvider = new CashProvider();
    }

    /**
     * метод покупки билета, используется объект события и объект провайдера билетов
     * в результате взаимодействия данных объектов возвращаем булеан значение успешности
     * или провала выполнения покупки
     * */
    public boolean buyTicket(Event event, TicketProvider ticketProvider) {
        return true;
    }

    /**
     * метод возврата билета, входящим аргументом является объект билета
     * в результате отработки данного метода возвращаем булеан значение успешности
     * или провала выполнения возврата билета
     * */
    public boolean repealTicket(Ticket ticket) {
        return true;
    }

    /**
     * метод поиска билетов, входящим аргументом является ID билета
     * в результате отработки данного метода возвращаем массив найденных билетов
     * */
    public ArrayList<Ticket> searchTicket(int ticketId) {
        return new ArrayList<Ticket>();
    }
}
