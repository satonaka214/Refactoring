import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void getManagerTest() {
        Person alice = new Person();
        alice.setName("alice");
        Department personnel = new Department(alice);
        Person bob = new Person();
        bob.setName("bob");
        bob.setDepartment(personnel);

        Person manager = bob.getDepartment().getManager();

        Assert.assertEquals("alice", manager.getName());
    }
}
