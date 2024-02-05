package homework3.OCP;

public class Milk extends Food{
    public Milk() {
        super("milk", 180);
    }

    @Override
    public double getExpirationDate() {
        return maxExpirationDate * 0.0167;
    }
}
