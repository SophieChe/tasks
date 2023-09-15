package string;

import java.util.Scanner;

public class String121 {
    public static void main(String[] args) {
        // 12 ввести предложение в консоль, вывести из этого предложения слова,
        // в которых буквы идут строго в алфавитном порядке // Слово Авгст Белы.
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Ввести текст: ");
        String str = scanner.nextLine(); // предложение
        String[] words = str.split(" "); // массив слов
        check(words);
    }

    static void check(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if(checkAlph(words[i])){
                System.out.println(words[i]);
            }
        }
    }

    static boolean checkAlph(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if ((int) word.charAt(i) > (int) word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
