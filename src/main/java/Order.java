public class Order {
    private Customer customer;

    public Order(String customer) {

        this.customer = new Customer(customer);
    }

    public void setCustomer(String customer) {
        this.customer = new Customer(customer);
    }

    public String getCustomer() {
        return this.customer.getName();
    }
}
