  import java.util.*;
public class Palindrome {
    
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        // Convert to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        int isPalindrome = 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = 0;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome);
    }
}