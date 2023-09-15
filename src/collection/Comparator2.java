package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Comparator2 {
    public static void main(String[] args) {
        //ввести предложение и вывести 5 самых длинных слов
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<String> list = new ArrayList<>();

        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }
}
