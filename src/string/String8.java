package string;

import java.util.Scanner;

public class String8 {
    public static void main(String[] args) {
        //8 из текста удалить все слова заданной длины, начинающиеся на согласную букву
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести текст: ");
        String str = scanner.nextLine();
        System.out.print("Ввести длину удаляемых слов: ");
        int n = scanner.nextInt();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if((word.length() == n && "бвгджзйклмнпрстфхцчшщ".indexOf(Character.toLowerCase(word.charAt(0))) != -1)
            || ((word.length() == n+1 && "бвгджзйклмнпрстфхцчшщ".indexOf(Character.toLowerCase(word.charAt(0))) != -1
            && !Character.isLetter(word.charAt(word.length() - 1))))) {
                words[i] = "";
            }
        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
