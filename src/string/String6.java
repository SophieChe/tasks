package string;
import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        //6  из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами
//        String russianAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя ";
//        char [] alph = new char [33];
//        for (int i = 0; i < alph.length; i++) {
//            alph[i] = (char) ('а' + i);
//        }
        System.out.print("Ввести текст: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isLetter(c) || c == ' '){
                newString = newString + String.valueOf(c);
            }
        }
        System.out.println(newString);
    }
}
