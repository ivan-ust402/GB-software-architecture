package homework2.task1;

public class GenBuyBread implements GenTodoItem{
    @Override
    public ITodoItem createTodoItem() {
        return new BuyBread();
    }
}
