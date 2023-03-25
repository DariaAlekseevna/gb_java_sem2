import java.util.Scanner;

/**
 * task1
 * Дано четное число N и символы с1 и с2
 * Написать метод, который вернет строку длины N, состоящую из чередующихся символов с1 и с2.
 * ввод 4
 * вывод с1с2с1с2
 */

public class task1 {

    private static char getChar(Scanner scanner, String message) {
        System.out.print(message);
        char symbol = scanner.nextLine().charAt(0);
        return symbol;
    }

    private static String generateString(int length, char symbol1, char symbol2) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length/2; i++)
            builder.append(new char[]{symbol1,symbol2});
        return builder.toString();
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter length of string: ");
        int length = scanner.nextInt();
        scanner.nextLine(); // нужно для считывания /n с предыдущего ввода иначе ошибка
        char symbol1 = getChar(scanner, "Enter first symbol of string: ");
        char symbol2 = getChar(scanner, "Enter last symbol of string:  ");
        System.out.printf("Your result string: %s", generateString(length, symbol1, symbol2));
        
        scanner.close();
    }
}