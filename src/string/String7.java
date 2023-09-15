package string;

import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        //7 между последовательностями подряд идущих букв оставить хотя бы один пробел (если рядом одинаковые буквы - пробел)
        System.out.print("Ввести текст: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] words = str.toCharArray(); // массив слов
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i] == words[i + 1]) {
                System.out.print(words[i] + " ");
            } else {
                System.out.print(words[i]);
            }
        }
        System.out.println(words[words.length-1]);
    }
}
