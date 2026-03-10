import java.util.Scanner;
import java.util.Stack;

public class usecase7{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println("====================================");
        System.out.println("      PALINDROME CHECKER APP        ");
        System.out.println("====================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Push characters to stack
        for(int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters to form reversed string
        String reversed = "";
        while(!stack.isEmpty()) {
            reversed = reversed + stack.pop();
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