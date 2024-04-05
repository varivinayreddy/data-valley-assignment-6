import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpenses = quantity * pricePerItem;
        double discount = 0.0;

        if (quantity > 50) {
            discount = 0.10 * totalExpenses;
        } else if (quantity >= 25) {
            discount = 0.05 * totalExpenses;
        }

        totalExpenses -= discount;

        System.out.println("Total expenses after discount: Rs. " + totalExpenses);

        scanner.close();
    }
}
