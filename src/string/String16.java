package string;

import java.util.Scanner;

public class String16 {
    public static void main(String[] args) {
        //TODO 16 из текста удалить все алфабетики (русский и английский) знаки
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести текст: ");
        String str = scanner.nextLine(); // предложение
        char[] words = str.toCharArray(); // массив слов
       checkChars(words);
    }




    public static void checkChars(char[] words) {
        for (int i = 0; i < words.length; i++) {
            if(!Character.isAlphabetic(words[i])){
                System.out.print(words[i]);
            }
        }
    }



}
