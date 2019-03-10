public class AssistantManager extends Employee {
    @Override
    public int calculateBaseSalary() {
        return 300000;
    }

    @Override
    public int getManagementLevel() {
        return 3;
    }
}
