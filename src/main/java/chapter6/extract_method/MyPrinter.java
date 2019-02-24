package chapter6.extract_method;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MyPrinter {
    private final String name;

    public void printOwing(double amount) {
        printBanner();

        // 明細の表示
        System.out.println("name: " + name);
        System.out.println("amount: " + amount);
    }

    private void printBanner() {
        System.out.println("バナー出力");
    }
}
