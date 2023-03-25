import java.util.Scanner;

public class task2_2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a line: ");
        String inputText = scanner.next();
        StringBuilder editText = GetCrypt(inputText);
        System.out.printf("Output: %s", editText);
        scanner.close();
    }

    public static StringBuilder GetCrypt(String inputText) {
        StringBuilder editText = new StringBuilder();
        int count = 1;
        for (int i = 1; i < inputText.length(); i++) {
            if (inputText.charAt(i) == inputText.charAt(i-1))
                count++;
            else {
                editText.append(inputText.charAt(i-1));
                if (count != 1) editText.append(count);
                count = 1;
            }
        }
        editText.append(inputText.charAt(inputText.length()-1));
        editText.append(count);
        return editText;
    }
}
