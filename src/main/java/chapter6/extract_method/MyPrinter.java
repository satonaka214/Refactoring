package chapter6.extract_method;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MyPrinter {
    private final String name;

    public void printOwing(double amount) {
        printBanner();
        printDetails(amount);
    }

    private void printBanner() {
        System.out.println("バナー出力");
    }

    private void printDetails(double amount) {
        System.out.println("name: " + name);
        System.out.println("amount: " + amount);
    }

}
