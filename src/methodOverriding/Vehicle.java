package methodOverriding;

public class Vehicle {
    public String vehicleName;
    public String vehicleType;
    public String model;
   public double mileage;

    public Vehicle(String vehicleName, String vehicleType,
                   String model) {
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleName='" + vehicleName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    public Vehicle vehicleInfo(Vehicle vehicle){
        return vehicle;
    }
    public double mileageInfo( int kiloMeters,double fuelConsumption){
        mileage=kiloMeters/fuelConsumption;
        return mileage;
    }









}
