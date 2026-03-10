import java.util.Scanner;
import java.util.Stack;

public class usecase13{

    // Reverse String Method
    public static boolean reverseMethod(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        return input.equals(reversed);
    }

    // Two Pointer Method
    public static boolean twoPointerMethod(String input) {

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

    // Stack Method
    public static boolean stackMethod(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        return input.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println(" PALINDROME PERFORMANCE COMPARISON ");
        System.out.println("====================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse method timing
        long start1 = System.nanoTime();
        boolean r1 = reverseMethod(input);
        long end1 = System.nanoTime();

        // Two pointer timing
        long start2 = System.nanoTime();
        boolean r2 = twoPointerMethod(input);
        long end2 = System.nanoTime();

        // Stack timing
        long start3 = System.nanoTime();
        boolean r3 = stackMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");

        System.out.println("Reverse Method Result : " + r1);
        System.out.println("Execution Time (ns)   : " + (end1 - start1));

        System.out.println("\nTwo Pointer Result    : " + r2);
        System.out.println("Execution Time (ns)   : " + (end2 - start2));

        System.out.println("\nStack Method Result   : " + r3);
        System.out.println("Execution Time (ns)   : " + (end3 - start3));

        scanner.close();
    }
}