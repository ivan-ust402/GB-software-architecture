package homework3.OCP;

public class Milk extends Food{
    public Milk(String name, double maxExpirationDate) {
        super(name, maxExpirationDate);
    }

    @Override
    public double getExpirationDate() {
        return maxExpirationDate * 0.0167;
    }
}
