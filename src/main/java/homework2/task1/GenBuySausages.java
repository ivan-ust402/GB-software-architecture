package homework2.task1;

public class GenBuySausages implements GenTodoItem{
    @Override
    public ITodoItem createProduct() {
        return new BuySausages();
    }
}
