package homework3.SRP;

public class RentCalculation {
        double baseCarRentPerDay;
        double coefficient;

        public RentCalculation(double baseCarRentPerDay, double coefficient) {
            this.baseCarRentPerDay = baseCarRentPerDay;
            this.coefficient = coefficient;
        }

        public double calculateRate() {
            return baseCarRentPerDay * coefficient;
        }
}
