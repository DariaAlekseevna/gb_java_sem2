import java.util.Scanner;

public class task3_2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter text: ");
        String inputText = scanner.next();
        System.out.println(isPalindrome(inputText));
        scanner.close();
    }

    private static Boolean isPalindrome(String inputText) {
        Boolean result;
        StringBuilder reverseText = new StringBuilder();
        for (int i = inputText.length()-1; i >= 0; i--) {
            reverseText.append(inputText.charAt(i));
        }
        result = inputText.equals(reverseText.toString());
        return result;
    }
}
