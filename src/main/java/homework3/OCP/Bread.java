package homework3.OCP;

public class Bread extends Food{
    public Bread() {
        super("bread", 180);
    }

    @Override
    public double getExpirationDate() {
        return super.getExpirationDate() * 0.0278;
    }
}
