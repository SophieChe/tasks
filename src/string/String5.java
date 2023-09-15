package string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        //5 в русском тексте заменить каждую букву заменить ее номером в алфавите.
        //в одной строке печатать текст с 2мя пробелами между буквами
        // в след строке внизу под каждой буквой печатать ее номер
        System.out.print("Ввести текст: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] strChar = str.toLowerCase().toCharArray();

        String russianAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char space = ' ';
        char[] rusAlph = russianAlphabet.toCharArray();
        for (int i = 0; i < strChar.length; i++) {
            System.out.print(strChar[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < strChar.length; i++) {
            for (int j = 0; j < rusAlph.length; j++) {
                if(strChar[i] == rusAlph[j]){
                    if(String.valueOf(j).length() == 2){
                        System.out.print(j + " ");
                    } else {
                        System.out.print(j + "  ");
                    }
                } else if (strChar[i] == space){
                    System.out.print("   ");
                    break;
                }
            }
        }


    }
}
