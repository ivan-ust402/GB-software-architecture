package homework3.DIP;

public class JetPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("Запустили печать текста на струйном принтере");
    }
}
