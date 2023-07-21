import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = in.nextLine();
        boolean palindrome = isPalindrome(str);
        in.close();
        
        if (palindrome) {
            System.out.println("The String is Palindrome");
        } else {
            System.out.println("The String is not Palindrome");
        }
    }

    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        char start, end;
        for (int i = 0; i < str.length() / 2; i++) {
            start = str.charAt(i);
            end = str.charAt(str.length() - 1 - i);
            
            if (start != end) {
                return false; // If any pair of characters doesn't match, it's not a palindrome
            }
        }
        return true; // If all pairs of characters match, it's a palindrome
    }
}
