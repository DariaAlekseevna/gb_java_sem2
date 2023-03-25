import java.util.Scanner;

/*
 * являтся ли строка полиндромом
 * на вход стринг
 * на выход булл
 */

public class task3 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter palindrom: ");
        String text = scanner.nextLine();
        System.out.println(IsPalindrome(text));
        scanner.close();
    }

    public static boolean IsPalindrome(String text) {
        StringBuilder builder = new StringBuilder();
        builder = ClearText(builder, text);
        for (int i = 0; i < builder.length()/2; i++)
            if (builder.charAt(i) != builder.charAt(builder.length()-1-i))
                return false;
        return true;
    }
    public static StringBuilder ClearText(StringBuilder builder, String text) {
        for (int i = 0; i < text.length(); i++)
        if (text.charAt(i) != ' ')
            builder.append(text.charAt(i));
        return builder;
    }
}
