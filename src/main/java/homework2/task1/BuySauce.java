package homework2.task1;

public class BuySauce extends ITodoItem {
    @Override
    public void markAsDone() {
        if (isDone) {
            System.out.println("Мы уже купили соус!");
        } else {
            isDone = true;
            System.out.println("Купили соус");
        }
    }
}
