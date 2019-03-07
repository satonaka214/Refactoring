public class Person {
    private BloodGroup bloodGroup;
    private EmployeeType employeeType;

    public Person(BloodGroup bloodGroup, EmployeeType employeeType) {
        this.bloodGroup = bloodGroup;
        this.employeeType = employeeType;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

}
