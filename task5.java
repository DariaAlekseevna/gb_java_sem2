import java.io.BufferedReader;
import java.io.FileReader;

/*
 * напишите метод, который вернет содержимое текущей папки в виде массива строк
 * напишите метод, который запишет массив, возвращенный предыдущим методом в файл
 * обработайте ошибки с помощью try catch коснтрукции. в случае возникновения исключения,
 * оно должно записаться в log file
 */

public class task5 {
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new FileReader("fortask5"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}
