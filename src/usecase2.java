public class usecase2 {
    public static void main(String[] args) {

        String input = "madam";
        String reversed = "";

        for(int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Input String : " + input);
        System.out.println("Reversed String : " + reversed);

        if(input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
