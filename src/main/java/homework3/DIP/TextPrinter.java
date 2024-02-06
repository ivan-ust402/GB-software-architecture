package homework3.DIP;

public class TextPrinter {
    Printer printer;

    public TextPrinter(Printer printer) {
        this.printer = printer;
    }

//    Зависимость с переданным классом устройства печати текста
//    жесткая, недопускается модификация каких-либо
//    классов различных устройств печати
//    выход есть - изменить класс Printer на интерфейс

    void startPrint() {
        printer.print();
    }
}
