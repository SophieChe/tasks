package string;

import java.util.ArrayList;
import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        //10 Найти и  напечатать, сколько раз повторяется в тексте каждое слово
        // предложение для проверки: это слово слово не повторяется ни ни разу
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести текст: ");
        String str = scanner.nextLine();
        String[] arraystr = str.split(" ");
        ArrayList<String> words = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < arraystr.length; i++) {
            for (int j = i + 1; j < arraystr.length; j++) {
                if (arraystr[i].equals(arraystr[j])) {
                    count = count + 1;
                }
            }
            if (count >= 1 && words.contains(arraystr[i])) {
                count = 1;
            } else {
                words.add(arraystr[i]);
                System.out.println(arraystr[i] + " встречается " + count);
                count = 1;
            }
        }
    }
}
