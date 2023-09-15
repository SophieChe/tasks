package string;

import java.util.HashSet;
import java.util.Scanner;

public class String15 {
    public static void main(String[] args) {
        // TODO 15 ввести с консоли предложение вывести слова в которых число различных букв больше пяти
        //список постановление здесь стол предвкушение
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести текст: ");
        String str = scanner.nextLine(); // предложение
        String[] words = str.split(" "); // массив слов
        countDiffNum(words);
    }
    public static void countDiffNum(String[] words) {
        for (int i = 0; i < words.length; i++) {
                if(checkNumb(words[i])){
                    System.out.println(words[i]);
                }
        }
    }

    public static boolean checkNumb(String word) {
        int count = 0;
        int ttlcount = 0;
        HashSet<Character> setN = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            setN.add(word.charAt(i));
        }
        if(setN.size() > 5) {
            return true;
        }
        return false;
    }

}
