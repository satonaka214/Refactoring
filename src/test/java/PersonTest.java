import org.junit.Test;

public class PersonTest {
    @Test
    public void personTest() {
        Person alice = new Person(BloodGroup.A, EmployeeType.ENGINEER);

        switch (alice.getBloodGroup()) {
            case O:
                System.out.println("bloodGroup: O");
                break;
            case A:
                System.out.println("bloodGroup: A");
                break;
            case B:
                System.out.println("bloodGroup: B");
                break;
            case AB:
                System.out.println("bloodGroup: AB");
                break;
            default:
                System.out.println("bloodGroup: error");
                break;
        }

        switch (alice.getEmployeeType()) {
            case ENGINEER:
                System.out.println("employeeType: engineer");
                break;
            case MANAGER:
                System.out.println("employeeType: manager");
                break;
            default:
                System.out.println("employeeType: error");
        }

//        // 型不一致でコンパイルエラーになる
//        switch (alice.getBloodGroup()) {
//            case ENGINEER:
//                System.out.println("employeeType: engineer");
//                break;
//            case MANAGER:
//                System.out.println("employeeType: manager");
//                break;
//            default:
//                System.out.println("employeeType: error");
//        }
    }
}
