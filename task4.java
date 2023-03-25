/*
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST 
 * и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
 */

import java.io.FileWriter;
import java.io.IOException;

public class task4 {

    private static String repeat100(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append(text);
        }
        text = builder.toString();
        return text;
    }

    private static void WriteToFile(String FileName, String FileText) {
        try (FileWriter fw = new FileWriter(FileName, false)) {
            fw.write(FileText);
            fw.flush();
            // fw.close();
            System.out.printf("File %s was written!", FileName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        String text = "TEST ";
        text = repeat100(text);
        WriteToFile("text100.txt", text);
    }

}

// метод flash принудительно очищает буфер, если маленький объем данный, но лучше всегда писать
// метод close закрывает доступ от операционной системы
// если есть ресурсный try catch то можно не писать close, они сами закроют