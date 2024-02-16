package InheritanceWithMethod;

public class MainTest {
    public static void main(String[] args) {
        Address address = new Address();
      address.countryName="United States";
     address.cityName="NewYork";
        ManagerDetails manager = new ManagerDetails("Sravya",
                "2570808", "Manager", address,"80000",
                "leading the team",3);
       ManagerDetails info= manager.managerInfo(manager,"10%");

        System.out.println(info);
    }
}