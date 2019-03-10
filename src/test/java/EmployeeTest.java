import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {
    @Test
    public void calculateEngineerSalary() {
        Employee engineer = new Employee();

        int salary = engineer.calculateBaseSalary(Employee.ENGINEER);

        Assert.assertEquals(salary, 200000);
    }

    @Test
    public void calculateAssistantManagerSalary() {
        Employee assistantManager = new Employee();

        int salary = assistantManager.calculateBaseSalary(Employee.ASSISTANT_MANAGER);

        Assert.assertEquals(salary, 300000);
    }

    @Test
    public void calculateManagerSalary() {
        Employee manager = new Employee();

        int salary = manager.calculateBaseSalary(Employee.MANAGER);

        Assert.assertEquals(salary, 400000);
    }

    @Test
    public void getEngineerManagementLevel() {
        Employee engineer = new Employee();

        int managementLevel = engineer.getManagementLevel(Employee.ENGINEER);

        Assert.assertEquals(managementLevel, 1);
    }

    @Test
    public void getAssistantManagerManagementLevel() {
        Employee assistantManager = new Employee();

        int managermentLevel = assistantManager.getManagementLevel(Employee.ASSISTANT_MANAGER);

        Assert.assertEquals(managermentLevel, 3);
    }

    @Test
    public void calculateManagerManagementLevel() {
        Employee manager = new Employee();

        int managermentLevel = manager.getManagementLevel(Employee.MANAGER);

        Assert.assertEquals(managermentLevel, 5);
    }

}
