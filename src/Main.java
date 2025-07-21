package tpm;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Making Coffee ---");
        BeverageMaker coffee = new CoffeeMaker();
        coffee.makeBeverage();

        System.out.println("\n--- Making Tea ---");
        BeverageMaker tea = new TeaMaker();
        tea.makeBeverage();
    }
}
