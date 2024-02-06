package homework3.DIP;

public class MainDIP {
    public static void main(String[] args) {
        Browser browserPrinter = new Browser();
        Console consolePrinter = new Console();
        JetPrinter jetPrinter = new JetPrinter();

        TextPrinter textPrinter = new TextPrinter(browserPrinter);
        textPrinter.startPrint();

        textPrinter = new TextPrinter(consolePrinter);
        textPrinter.startPrint();

        textPrinter = new TextPrinter(jetPrinter);
        textPrinter.startPrint();
    }
}
