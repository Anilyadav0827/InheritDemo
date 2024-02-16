  package InheritanceWithMethod;

public class EmployeeDetails {
    private String employeeName;
    private String employeeId;
    private String designation;
    public Address address;

    public EmployeeDetails(String employeeName, String employeeId, String designation, Address address) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.designation = designation;
        this.address = address;
    }
    public EmployeeDetails(String employeeName, String employeeId, String designation){
        this(employeeName,employeeId,designation,new Address());
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", designation='" + designation + '\'' +
                ", address=" + address +
                '}';
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDesignation() {
        return designation;
    }
    public EmployeeDetails employee (EmployeeDetails employeeDetails){
         //System.out.println(employeeDetails);
       return employeeDetails ;
    }


}
