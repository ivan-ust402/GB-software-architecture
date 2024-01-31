package homework2.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<GenTodoItem> defaultTodoItemList = new ArrayList<>();

        defaultTodoItemList.add(new GenBuyBread());
        defaultTodoItemList.add(new GenBuySausages());
        defaultTodoItemList.add(new GenBuySauce());

        createAndMarkAsDoneRandomTodoItems(defaultTodoItemList);
    }

    static void createAndMarkAsDoneRandomTodoItems(List<GenTodoItem> list) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 20; i++) {
            int currentValue = Math.abs(rnd.nextInt() % list.size());
            int index = currentValue == 0
                    ? 0 : currentValue == 1
                    ? 1 : 2;
            ITodoItem todoItem = list.get(index).createTodoItem();
            todoItem.markAsDone();
        }
    }
}
