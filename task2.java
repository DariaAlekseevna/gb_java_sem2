import java.util.Scanner;

/*
 * Напишите метод, который сжимает строку
 * пример aaaabbbcdd
 * вывод a4b3cd2
 */

public class task2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String st = scanner.nextLine();
        System.out.println(LineCompression(st));
        scanner.close();
    }

    public static String LineCompression(String EnteredText) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        int count = 1;
        while (i < EnteredText.length()-1) {
            if ((EnteredText.charAt(i) == EnteredText.charAt(i+1)) && (i!=EnteredText.length()-2))
                count++;
            else {
                builder.append(EnteredText.charAt(i));
                if (count != 1) {
                    if ((EnteredText.charAt(i) == EnteredText.charAt(i+1)) && (i==EnteredText.length()-2))
                        count++;
                    builder.append(count);
                    if ((EnteredText.charAt(i) != EnteredText.charAt(i+1)) && (i == EnteredText.length()-2))
                        builder.append(EnteredText.charAt(i+1));
                }
                count = 1;
            }
            i++;
        }
        String ResText = builder.toString(); 
        return ResText;
    }

}
