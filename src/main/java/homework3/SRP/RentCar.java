package homework3.SRP;

import java.util.Locale;
import java.util.Objects;

public class RentCar {
    public String model;
    public String registrationNumber;
    public double carRating;
//    public double baseRentCostPerADay;

    public RentCar(String model, String registrationNumber, double carRating) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.carRating = carRating;
    }

//    public RentCar(String model, String registrationNumber, double carRating, double baseRentCostPerADay) {
//        this.model = model;
//        this.registrationNumber = registrationNumber;
//        this.carRating = carRating;
//        this.baseRentCostPerADay = baseRentCostPerADay;
//
//    }


//    Нарушение принципа, арендная машина не должна высчитывать соимость своей аренды в день,
//    этим должен заняться другой класс!
//    public void printRentCostPerADay() {
//        System.out.println(baseRentCostPerADay * carRating);
//    }
}
