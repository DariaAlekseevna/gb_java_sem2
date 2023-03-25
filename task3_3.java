import java.util.Scanner;

public class task3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(palindrom(scanner));
    }
    public static boolean palindrom(Scanner scanner) {
        System.out.printf("Enter a line: ");
        String str1 = scanner.nextLine();
        String str2 = reverseStr(str1);
        return str2.equals(str1);
    }
    public static String reverseStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
