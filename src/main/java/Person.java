public class Person {
    public static final int O = 0;
    public static final int A = 1;
    public static final int B = 2;
    public static final int AB = 3;

    public static final int ENGINEER = 0;
    public static final int MANAGER = 1;

    private int bloodGroup;
    private int employeeType;

    public Person(int bloodGroup, int employeeType) {
        this.bloodGroup = bloodGroup;
        this.employeeType = employeeType;
    }

    public int getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(int bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

}
