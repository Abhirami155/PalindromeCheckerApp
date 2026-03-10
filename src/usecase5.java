import java.util.Scanner;

public class usecase5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      PALINDROME CHECKER APP        ");
        System.out.println("====================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = processed.length() - 1;
        boolean isPalindrome = true;

        while(start < end) {
            if(processed.charAt(start) != processed.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome) {
            System.out.println("Result : The given string is a PALINDROME");
        } else {
            System.out.println("Result : The given string is NOT a PALINDROME");
        }

        scanner.close();
    }
}