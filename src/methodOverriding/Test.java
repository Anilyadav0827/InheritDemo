package methodOverriding;

public class Test {
    public static void main(String[] args) {
        Vehicle info = new Bike("Fz", "2 wheeler", "2022", "petrol");
        System.out.println(info.vehicleInfo(info));
        System.out.println(info.mileageInfo(200, 5));
        Vehicle latestInfo= new Car("Swift","4 wheeler",
                "2020","diesel");
        System.out.println(latestInfo.vehicleInfo(latestInfo));
        System.out.println(latestInfo.mileageInfo(100,5));
    }
}
