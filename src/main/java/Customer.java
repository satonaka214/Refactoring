public class Customer {
    private final String name;

    public static Customer create(String name) {
        return new Customer(name);
    }

    public String getName() {
        return name;
    }

    private Customer(String name) {
        this.name = name;
    }
}
