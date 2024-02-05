package homework3.OCP;

public class MainOCP {
    public static void main(String[] args) {
        Bread bread = new Bread();
        Milk milk = new Milk();

        System.out.println("Срок годности хлеба: " + bread.getExpirationDate() + " дней");
        System.out.println("Срок годности молока: " + milk.getExpirationDate() + " дней");
    }
}
