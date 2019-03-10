public class Employee {
    public static final int ENGINEER = 0;
    public static final int ASSISTANT_MANAGER = 1;
    public static final int MANAGER = 2;
    public int calculateBaseSalary(int position) {
        int salary;

        switch (position) {
            case ENGINEER:
                salary = 200000;
                break;
            case ASSISTANT_MANAGER:
                salary = 300000;
                break;
            case MANAGER:
                salary = 400000;
                break;
            default:
                throw new IllegalArgumentException("position が不明な値です。position[" + position + "]");
        }

        return salary;
    }

    public int getManagementLevel(int position) {
        int managementLevel;

        switch (position) {
            case ENGINEER:
                managementLevel = 1;
                break;
            case ASSISTANT_MANAGER:
                managementLevel = 3;
                break;
            case MANAGER:
                managementLevel = 5;
                break;
            default:
                throw new IllegalArgumentException("position が不明な値です。position[" + position + "]");
        }

        return managementLevel;
    }

}
