import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        int vowelCount = 0;
        boolean isVowelPresent = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                isVowelPresent = true;
                vowelCount++;
            }
        }

        if (isVowelPresent) {
            System.out.println("Vowels are present.");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels are present.");
        }

        scanner.close();
    }
}
