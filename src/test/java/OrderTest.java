import org.junit.Assert;
import org.junit.Test;

public class OrderTest {
    @Test
    public void constructTest() {
        Order order = new Order("Alice");

        Assert.assertEquals(order.getCustomerName(), "Alice");
    }

    @Test
    public void setCustomerTest() {
        Order order = new Order("Alice");

        order.setCustomer("Bob");

        Assert.assertEquals(order.getCustomerName(), "Bob");
    }
}
