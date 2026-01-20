import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String originalString = sc.nextLine();

        if(checkPalindrome(originalString)) {
            System.out.println("Result: " + originalString + " is a palindrome.");
        }
        else {
            System.out.println("Result: " + originalString + " is not a palindrome.");
        }
        sc.close();
        
    }
    public static boolean checkPalindrome(String str) {
            int left = 0;
            int right = str.length()-1;

            while(left < right) {
                if(str.charAt(left) != str.charAt(right)) {
                    return false;
                } else {
                    right--;
                    left++;
                }
            }
            return true;
        }
}