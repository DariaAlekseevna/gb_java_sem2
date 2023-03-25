import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task4_3 {

    static String buildText(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++)
            builder.append(text);
        return builder.toString();
    }
    
    static void saveToFile(String nameFile, String s) {
        try (FileWriter fw = new FileWriter(nameFile, false)) {
            fw.write(s);
            System.out.println(nameFile + ": Данные записаны");
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");

        String text = buildText(scanner.nextLine());
        System.out.println(text);

        saveToFile("text.txt", text);
        scanner.close();
    }
}
