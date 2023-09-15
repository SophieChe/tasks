package string;

import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {
        // 12 ввести предложение в консоль, вывести из этого предложения слова,
        // в которых буквы идут строго в алфавитном порядке // Слово. Август. Белый.
        boolean isAlphabetical = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести текст: ");
        String str = scanner.nextLine(); // предложение
        String[] words = str.split(" "); // массив слов
        char[] russianAlphabet = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й',
                'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч',
                'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
        int index = -1;
        for (int i = 0; i < words.length; i++) { //по длине количества слов
            char[] charLetter = words[i].toCharArray();
            for (int k = 0; k < charLetter.length - 1; k++) { // по длине каждого слова
                if (charLetter[k] > charLetter[k + 1]) {
                    System.out.println("вывод " + charLetter[k]);
                    System.out.println(charLetter[k] > charLetter[k + 1]);
                    isAlphabetical = false;
//                    break;
                }
                System.out.println("isAlphabetical " + isAlphabetical);
            }
            if (isAlphabetical) {
                System.out.println("результат " + words[i].toString());

            }

        }
    }
}
