package string;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class String18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести текст: ");
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        System.out.println(compareChars(line1, line2));
        
    }
    public static int compareChars(String line1, String line2){
        int count = 0;
        char[] line11 = line1.toCharArray();
        char[] line22 = line2.toCharArray();
        for (int i = 0; i < line11.length; i++) {
            for (int j = 0; j < line22.length; j++) {
                if(line11[i] == line22[j])
                    count++;
            }
        }
        return count;
    }
    
}
