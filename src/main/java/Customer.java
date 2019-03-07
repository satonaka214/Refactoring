import java.util.HashMap;
import java.util.Map;

public class Customer {
    private static Map<String, Customer> instances = new HashMap<>();
    private final String name;

    public static void loadCustomers() {
        new Customer("Alice").store();
        new Customer("Bob").store();
    }

    private void store() {
        instances.put(this.getName(), this);
    }

    public static Customer create(String name) {
        return instances.get(name);
    }

    public String getName() {
        return name;
    }

    private Customer(String name) {
        this.name = name;
    }
}
