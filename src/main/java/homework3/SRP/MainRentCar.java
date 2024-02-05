package homework3.SRP;

public class MainRentCar {
    public static void main(String[] args) throws Exception {
        RentCar businessCar = new RentCar("mercedes", "no defects", "у111уу777", "business", 3000.00);
        RentCar economyCar = new RentCar("lada", "has 2 defects", "т004ка19", "economy", 3000.00);
        RentCar standardCar = new RentCar("ford", "no defects", "у111уу78", "standard", 3000.00);
        RentCar superEconomyCar = new RentCar("daewoo", "has 4 defects", "м295уу78", "super economy", 3000.00);

        RentCalculation rentCalculator = new RentCalculation(businessCar.baseRentCostPerADay, businessCar.carRating);
        rentCalculator.calculateRate();

        rentCalculator = new RentCalculation(economyCar.baseRentCostPerADay, economyCar.carRating);
        rentCalculator.calculateRate();

        rentCalculator = new RentCalculation(standardCar.baseRentCostPerADay,standardCar.carRating);
        rentCalculator.calculateRate();

        rentCalculator = new RentCalculation(superEconomyCar.baseRentCostPerADay, superEconomyCar.carRating);
        rentCalculator.calculateRate();
    }
}
