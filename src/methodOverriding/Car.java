package methodOverriding;

public class Car extends Vehicle {
    String fuelType;


    public Car(String vehicleName, String vehicleType, String model,String fuelType) {
        super(vehicleName, vehicleType, model);
        this.fuelType= fuelType;
    } public Car carInfo(Car car){
        super.vehicleInfo(car);
        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelType='" + fuelType + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    @Override
    public double mileageInfo(int kiloMeters, double liters) {
        return super.mileageInfo(kiloMeters, liters);
    }
}
