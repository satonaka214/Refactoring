public class Manager extends Employee {
    @Override
    public int calculateBaseSalary() {
        return 400000;
    }

    @Override
    public int getManagementLevel() {
        return 5;
    }
}
