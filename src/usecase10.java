import java.util.Scanner;

public class usecase10{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      PALINDROME CHECKER APP        ");
        System.out.println("====================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 1: Normalize the string
        // Remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Check palindrome using two-pointer method
        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Original String   : " + input);
        System.out.println("Processed String  : " + normalized);

        if (isPalindrome) {
            System.out.println("Result : The given string is a PALINDROME");
        } else {
            System.out.println("Result : The given string is NOT a PALINDROME");
        }

        scanner.close();
    }
}