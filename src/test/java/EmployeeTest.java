import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {
    @Test
    public void calculateEngineerSalary() {
        Employee engineer = new Engineer();

        int salary = engineer.calculateBaseSalary();

        Assert.assertEquals(salary, 200000);
    }

    @Test
    public void calculateAssistantManagerSalary() {
        Employee assistantManager = new AssistantManager();

        int salary = assistantManager.calculateBaseSalary();

        Assert.assertEquals(salary, 300000);
    }

    @Test
    public void calculateManagerSalary() {
        Employee manager = new Manager();

        int salary = manager.calculateBaseSalary();

        Assert.assertEquals(salary, 400000);
    }

    @Test
    public void getEngineerManagementLevel() {
        Employee engineer = new Engineer();

        int managementLevel = engineer.getManagementLevel();

        Assert.assertEquals(managementLevel, 1);
    }

    @Test
    public void getAssistantManagerManagementLevel() {
        Employee assistantManager = new AssistantManager();

        int managermentLevel = assistantManager.getManagementLevel();

        Assert.assertEquals(managermentLevel, 3);
    }

    @Test
    public void calculateManagerManagementLevel() {
        Employee manager = new Manager();

        int managermentLevel = manager.getManagementLevel();

        Assert.assertEquals(managermentLevel, 5);
    }

}
