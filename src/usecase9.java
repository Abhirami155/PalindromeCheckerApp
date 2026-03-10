import java.util.Scanner;

public class usecase9{

    // Method 1: Reverse String
    public static boolean reverseCheck(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }

    // Method 2: Two Pointer
    public static boolean twoPointerCheck(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      PALINDROME CHECKER APP        ");
        System.out.println("====================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("\nChoose Palindrome Check Method:");
        System.out.println("1. Reverse String Method");
        System.out.println("2. Two Pointer Method");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        boolean result = false;

        switch (choice) {

            case 1:
                result = reverseCheck(input);
                break;

            case 2:
                result = twoPointerCheck(input);
                break;

            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        if (result) {
            System.out.println("Result : The given string is a PALINDROME");
        } else {
            System.out.println("Result : The given string is NOT a PALINDROME");
        }

        scanner.close();
    }
}