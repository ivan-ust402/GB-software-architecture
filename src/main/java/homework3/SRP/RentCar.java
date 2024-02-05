package homework3.SRP;

import java.util.Locale;
import java.util.Objects;

public class RentCar {
    public String model;
    public String defects;
    public String registrationNumber;
    public String carClass;
    public double carRating;
    public double baseRentCostPerADay;


    public RentCar(String model, String defects, String registrationNumber, String carClass, double baseRentCostPerADay) throws Exception {
        String carClassFormatString = carClassFormatter(carClass);
        if (Objects.equals(carClassFormatString, "economy")
                || Objects.equals(carClassFormatString, "super economy")
                || Objects.equals(carClassFormatString, "standard")
                || Objects.equals(carClassFormatString, "business")
        ) {
            this.carClass = carClassFormatString;
        } else {
            throw new Exception("Car class " + carClassFormatString + " is incorrect");
        }
        this.model = model;
        this.defects = defects;
        this.registrationNumber = registrationNumber;

        this.baseRentCostPerADay = baseRentCostPerADay;
        this.carRating = getCarRating();
    }

    public String carClassFormatter(String str) {
        return str.toLowerCase().replaceAll("\\s{2,}", " ").trim();
    }
    public double getCarRating() {
        double minGrade = 1;
        double carClassCoefficient;
        if (Objects.equals(carClass, "super economy")) {
            carClassCoefficient = 0.8;
        } else if (Objects.equals(carClass, "business")) {
            carClassCoefficient = 10;
        } else if (Objects.equals(carClass, "standard")) {
            carClassCoefficient = 2;
        } else {
            carClassCoefficient = 1;
        }
        return minGrade * carClassCoefficient;
    }

//    Нарушение принципа, арендная машина не должга высчитывать соимость своей аренды в день,
//    этим должен заняться другой класс!
//    public double getRentCostPerADay() {
//        return baseRentCostPerADay * carRating;
//    }
}
