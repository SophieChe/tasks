package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        //считать предложение и вывести все слова по 1 разу
        // вывести те,  у которых все буквы уникальные

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(compare(words[i])){
                System.out.println(words[i]);
            }
        }
    }

    public static boolean compare(String word){
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
           set.add(word.charAt(i));
        }
        if(set.size() == word.length()){
            return true;
        }
        return false;
    }
}
