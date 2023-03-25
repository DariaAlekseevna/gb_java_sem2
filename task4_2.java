import java.io.FileInputStream; // вывод из файла по байтово, дучще для картинок не для текста
import java.io.FileOutputStream; // запись в файл по байтово, лучше не для текса а для img например

public class task4_2 {
    
    public static void main(String[] args) {
        String text1 = "text";
        String text = Text(text1);
        try {
            FileOutputStream fileOutput = new FileOutputStream("C:\\Users\\HP\\Desktop\\даша\\geekbrains\\java_classes\\seminars\\sem2\\test.txt", true);
            byte buff[] = text.getBytes();
            fileOutput.write(buff);
            fileOutput.close();
            System.out.println("Запись прошла успешно!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        

        StringBuffer s = new StringBuffer();
        try {
            final FileInputStream inputStream = new FileInputStream("C:\\Users\\HP\\Desktop\\даша\\geekbrains\\java_classes\\seminars\\sem2\\test.txt");
            int i = -1;
            while ((i = inputStream.read()) != -1) {
                s.append((char)i);
            }
            inputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(s);
    }

    static String Text(String data) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            str.append(data);
        }
        return str.toString();
    }
}
