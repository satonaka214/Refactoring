import org.junit.Test;

public class PersonTest {
    @Test
    public void personTest() {
        Person alice = new Person(Person.A, Person.ENGINEER);

        switch (alice.getBloodGroup()) {
            case Person.O:
                System.out.println("bloodGroup: O");
                break;
            case Person.A:
                System.out.println("bloodGroup: A");
                break;
            case Person.B:
                System.out.println("bloodGroup: B");
                break;
            case Person.AB:
                System.out.println("bloodGroup: AB");
                break;
            default:
                System.out.println("bloodGroup: error");
                break;
        }

        switch (alice.getEmployeeType()) {
            case Person.ENGINEER:
                System.out.println("employeeType: engineer");
                break;
            case Person.MANAGER:
                System.out.println("employeeType: manager");
                break;
            default:
                System.out.println("employeeType: error");
        }

        switch (alice.getBloodGroup()) {
            case Person.ENGINEER:
                System.out.println("employeeType: engineer");
                break;
            case Person.MANAGER:
                System.out.println("employeeType: manager");
                break;
            default:
                System.out.println("employeeType: error");
        }
    }
}
