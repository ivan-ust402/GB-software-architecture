package homework2.task2.adapter;

public class MainComputerAdapter {
    public static void main(String[] args) {
        Computer computer = new Computer();

        Mouse mouse = new Mouse();

        computer.accept(new MouseUsbAdapter(mouse));
    }
}
