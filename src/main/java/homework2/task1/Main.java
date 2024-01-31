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


//  Для случая работы с класами todoItems напрямую
//        List<ITodoItem> defaultTodoItemList = new ArrayList<>();
//
//        defaultTodoItemList.add(new BuyBread());
//        defaultTodoItemList.add(new BuySausages());
//        defaultTodoItemList.add(new BuySauce());
//
//        createAndMarkAsDoneRandomTodoItems1(defaultTodoItemList);
    }

    static void createAndMarkAsDoneRandomTodoItems(List<GenTodoItem> list) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 20; i++) {
            int index = Math.abs(rnd.nextInt() % list.size());
            ITodoItem todoItem = list.get(index).createTodoItem();
            todoItem.markAsDone();
        }
    }

//    static void createAndMarkAsDoneRandomTodoItems1(List<ITodoItem> list) {
//        Random rnd = ThreadLocalRandom.current();
//        for (int i = 0; i < 20; i++) {
//            int index = Math.abs(rnd.nextInt() % list.size());
//            ITodoItem todoItem = list.get(index);
//            todoItem.markAsDone();
//        }
//    }
}
