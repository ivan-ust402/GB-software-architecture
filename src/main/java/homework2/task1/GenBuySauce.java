package homework2.task1;

public class GenBuySauce implements GenTodoItem{
    @Override
    public ITodoItem createProduct() {
        return new BuySauce();
    }
}
