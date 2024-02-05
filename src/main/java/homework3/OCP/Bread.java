package homework3.OCP;

public class Bread extends Food{
    public Bread(String name, double maxExpirationDate) {
        super(name, maxExpirationDate);
    }

    @Override
    public double getExpirationDate() {
        return super.getExpirationDate() * 0.0278;
    }
}
