import java.util.Scanner;
public class usecase3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      PALINDROME CHECKER APP        ");
        System.out.println("====================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = "";

        for(int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);

        if(input.equals(reversed)) {
            System.out.println("Result : The given string is a PALINDROME");
        } else {
            System.out.println("Result : The given string is NOT a PALINDROME");
        }

        scanner.close();
    }
}
