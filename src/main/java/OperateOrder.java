import java.util.List;

public class OperateOrder {
    public static long numberOfOrdersFor(List<Order> orderList, String customer) {
        return orderList.stream()
                .filter(order -> order.getCustomer().equals(customer))
                .count();
    }
}
