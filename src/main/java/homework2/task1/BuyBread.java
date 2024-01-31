package homework2.task1;

public class BuyBread extends ITodoItem {
    @Override
    public void markAsDone() {
        if (isDone) {
            System.out.println("Мы уже купили хлеб!");
        }
        isDone = true;
        System.out.println("Купили хлеб");
    }
}
