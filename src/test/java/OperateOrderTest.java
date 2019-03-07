import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OperateOrderTest {
    @Test
    public void numberOfOrdersForTest() {
        Customer.loadCustomers();
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("Alice"));
        orderList.add(new Order("Bob"));
        orderList.add(new Order("Bob"));

        Assert.assertEquals(OperateOrder.numberOfOrdersFor(orderList, "Alice"), 1);
        Assert.assertEquals(OperateOrder.numberOfOrdersFor(orderList, "Bob"), 2);
    }
}
