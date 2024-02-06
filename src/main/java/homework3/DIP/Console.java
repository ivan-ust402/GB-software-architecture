package homework3.DIP;

public class Console implements Printer{
    @Override
    public void print() {
        System.out.println("Печатаем текст в консоли");
    }
}
