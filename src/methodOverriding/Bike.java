package methodOverriding;

public class Bike extends Vehicle {
    private String fuelType;

    public Bike(String vehicleName, String vehicleType, String model,
                String fuelType) {
        super(vehicleName, vehicleType, model);
        this.fuelType=fuelType;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "fuelType='" + fuelType + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    public Bike bikeInfo(Bike bike){
        super.vehicleInfo(bike);
        return bike;
    }
    @Override
    public double mileageInfo(int kiloMeters, double liters) {
        return super.mileageInfo(kiloMeters,liters);
    }
}
