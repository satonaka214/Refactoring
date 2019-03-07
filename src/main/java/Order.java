public class Order {
    private Customer customer;

    public Order(String customerName) {
        this.customer = Customer.getNamed(customerName);
    }

    public void setCustomer(String customerName) {
        this.customer = Customer.getNamed(customerName);
    }

    public String getCustomerName() {
        return this.customer.getName();
    }
}
