package homework3.DIP;

public class Browser implements Printer{
    @Override
    public void print() {
        System.out.println("Отображаем текст в браузерном окне");
    }
}
