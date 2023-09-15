package string;

import java.util.Scanner;

public class String14 {
    public static void main(String[] args) {
        // TODO 14 ввести с консоли предложение вывести самый большой номер в алфавите в каждом слове
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести текст: ");
        String str = scanner.nextLine(); // предложение
        String[] words = str.split(" "); // массив слов
        getLetterNum(words);

    }
    static void getLetterNum(String[] words){
        int number = 0;
        int numberForCalc = (int) 'a';
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if((int) words[i].charAt(j) > number){
                    number = (int) words[i].charAt(j);
                }
            }
            System.out.println(words[i] + " " + (number - numberForCalc));
            number = 0;
        }
    }
}
