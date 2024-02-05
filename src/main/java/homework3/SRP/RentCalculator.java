package homework3.SRP;

public class RentCalculator {
        double baseCarRentPerDay;
        double coefficient;

        public RentCalculator(double baseCarRentPerDay, double coefficient) {
            this.baseCarRentPerDay = baseCarRentPerDay;
            this.coefficient = coefficient;
        }

        public void printRentCostPerADay() {
            System.out.println(baseCarRentPerDay * coefficient);
        }
}
