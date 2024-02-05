package homework3.OCP;

import java.util.Objects;

public class Food {
    public String name;
    public double maxExpirationDate;


    public Food(String name, double expirationDate) {
        this.name = name;
        this.maxExpirationDate = expirationDate;
    }

    public double getExpirationDate() {
//        Как делать не нужно:
//        if (Objects.equals(name, "bread")) {
//            return maxExpirationDate * 0.0278;
//        } else if (Objects.equals(name, "milk")) {
//            return maxExpirationDate * 0.0167;
//        }
        return maxExpirationDate;
    }
}
