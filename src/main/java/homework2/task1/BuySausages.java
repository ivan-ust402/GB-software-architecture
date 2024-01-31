package homework2.task1;

public class BuySausages extends ITodoItem{
    @Override
    public void markAsDone() {
        if (isDone) {
            System.out.println("Мы уже купили сосиски!");
        }
        isDone = true;
        System.out.println("Купили сосиски");
    }
}
