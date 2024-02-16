package InheritanceWithMethod;

public class ManagerDetails extends EmployeeDetails {
    private String salary;
    private String leadership;
    public int experience;

    public ManagerDetails(String employeeName, String employeeId,
                          String designation, Address address,String salary,String leadership,int experience) {
        super(employeeName, employeeId, designation, address);
        this.salary=salary;
        this.leadership=leadership;
        this.experience=experience;
    }
    @Override
    public String toString() {
        return "ManagerDetails{" + "employeeName='" + getEmployeeName()+ '\'' +
                ", employeeId='" + getEmployeeId() + '\'' +
                ", address=" + address + '\'' +
                ", designation='" + getDesignation() + '\'' +
                "salary='" + salary + '\'' +
                ", leadership='" + leadership + '\'' +"experience="+ experience + '\'' +
                '}';
    }
    public ManagerDetails managerInfo(ManagerDetails managerDetails) {
        super.employee(managerDetails);
        return managerDetails;
    }
    public ManagerDetails managerInfo(ManagerDetails managerDetails,String hike){
        if(experience>=2){
            System.out.println("you are eligible for hike");

        }
        else{
            System.out.println("you are not eligible for hike");
        }
        return managerDetails;

    }

}
