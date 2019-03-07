public class Order {
    private Customer customer;

    public Order(String customerName) {

        this.customer = new Customer(customerName);
    }

    public void setCustomer(String customerName) {
        this.customer = new Customer(customerName);
    }

    public String getCustomerName() {
        return this.customer.getName();
    }
}
