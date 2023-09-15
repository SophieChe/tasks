package string;

import java.util.Scanner;

public class String13 {
    public static void main(String[] args) {
        //TODO //13 ввести предложение c консоли, вывести слова, где количество гласных и согласных одинаковое
        //кожа нога стол стул

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести текст: ");
        String str = scanner.nextLine(); // предложение
        String[] words = str.split(" "); // массив слов
        countLetters(words);
    }
    public static void countLetters(String[] words) {
        int countC = 0;
        int countV = 0;
        for (int i = 0; i < words.length; i++) {
            //char[] word = words[i].toCharArray();
            for (int j = 0; j < words[i].length(); j++) {
                if ("бвгджзйклмнпрстфхцчшщ".indexOf(Character.toLowerCase(words[i].charAt(j))) != -1) {
                    countC = countC+1;
                } else {
                    countV = countV+1;
                }
            }
            if (countC == countV) {
                System.out.print(words[i] +" ");
            }
            countC = 0;
            countV = 0;
        }
    }
}
