public class Engineer extends Employee {
    @Override
    public int calculateBaseSalary() {
        return 200000;
    }

    @Override
    public int getManagementLevel() {
        return 1;
    }
}
