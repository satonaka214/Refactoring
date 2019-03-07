import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OperateOrderTest {
    @Test
    public void numberOfOrdersForTest() {
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("Alice"));
        orderList.add(new Order("Bob"));
        orderList.add(new Order("Bob"));

        Assert.assertEquals(1, OperateOrder.numberOfOrdersFor(orderList, "Alice"));
        Assert.assertEquals(2, OperateOrder.numberOfOrdersFor(orderList, "Bob"));
    }
}
