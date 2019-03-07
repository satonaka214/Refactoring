public class Order {
    private Customer customer;

    public Order(String customerName) {
        this.customer = Customer.create(customerName);
    }

    public void setCustomer(String customerName) {
        this.customer = Customer.create(customerName);
    }

    public String getCustomerName() {
        return this.customer.getName();
    }
}
