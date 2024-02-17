package InheritanceWithMethod;

public class DeveloperDetails extends EmployeeDetails {
    private String salary;
    public String programmingSkills;
    public int experience;

    public DeveloperDetails(String employeeName, String employeeId, String designation, String salary,
                            String programmingSkills, int experience) {
        super(employeeName, employeeId, designation);
        this.salary = salary;
        this.programmingSkills = programmingSkills;
        this.experience = experience;
    }


    @Override
    public String toString() {
        return "DeveloperDetails{" + "employeeName='" + getEmployeeName() + '\'' +
                ", employeeId='" + getEmployeeId() + '\'' +
                ", address=" + address + '\'' +
                ", designation='" + getDesignation() + '\'' +
                "salary='" + salary + '\'' + "experience=" + experience +
                ", programmingSkills='" + programmingSkills + '\'' +
                '}';
    }

    public DeveloperDetails developerInfo(DeveloperDetails developerDetails) {
        super.employee(developerDetails);
        return developerDetails;
    }

    public DeveloperDetails developerInfo(DeveloperDetails developerDetails, String hike) {
        if (experience >= 2) {
            System.out.println("you are eligible for hike");

        } else {
            System.out.println("you are not eligible for hike");
        }
        return developerDetails;
    }
}