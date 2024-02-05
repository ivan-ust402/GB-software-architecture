package homework3.SRP;

public class MainRentCar {
    public static void main(String[] args) throws Exception {
        RentCar rentCar = new RentCar("mercedes", "у111уу777", 10.00);

        RentCalculator calculator = new RentCalculator(3000.00, rentCar.carRating);
        calculator.printRentCostPerADay();

        rentCar = new RentCar("ford", "м321ро34", 2);
        calculator = new RentCalculator(3000, rentCar.carRating);
        calculator.printRentCostPerADay();
    }
}
