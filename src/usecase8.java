import java.util.Scanner;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class usecase8{

    // Create linked list from string
    public static Node createList(String input) {

        Node head = null;
        Node tail = null;

        for (int i = 0; i < input.length(); i++) {

            Node newNode = new Node(input.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    // Reverse linked list
    public static Node reverse(Node head) {

        Node prev = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // Palindrome check
    public static boolean isPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Find middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow.next);
        Node firstHalf = head;

        while (secondHalf != null) {

            if (firstHalf.data != secondHalf.data) {
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
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

        Node head = createList(input);

        if (isPalindrome(head)) {
            System.out.println("Result : The given string is a PALINDROME");
        } else {
            System.out.println("Result : The given string is NOT a PALINDROME");
        }

        scanner.close();
    }
}