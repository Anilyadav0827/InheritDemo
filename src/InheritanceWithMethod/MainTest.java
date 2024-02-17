package InheritanceWithMethod;

public class MainTest {
    public static void main(String[] args) {
   Address address = new Address();
  address.countryName="United States";
   address.cityName="NewYork";
        ManagerDetails manager = new ManagerDetails("Xyz",
                "2570808", "Manager",address,"80000",
                "leading the team",3);
       ManagerDetails info= manager.managerInfo(manager,"10%");

        System.out.println(info);
       ManagerDetails latestManager= new ManagerDetails("Xyz","5555",
               "manager",address,"80000","leading the team",4);
       ManagerDetails latestInfo=latestManager.managerInfo(latestManager);
        System.out.println(latestInfo);
//        EmployeeDetails devInfo= new DeveloperDetails("Anil","5555","developer",
//        "40000","java",5);
        DeveloperDetails latestDevInfo= new DeveloperDetails("Anil","66666",
                "Developer","50000","Java Full Stack",3);
        DeveloperDetails devInfo=latestDevInfo.developerInfo(latestDevInfo,"20");
        System.out.println(devInfo);


    }
}