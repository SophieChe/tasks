package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Collection4Comparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 50));
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
        sortList(list);
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void sortList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Integer k = list.get(j);
                    Integer l = list.get(j + 1);
                    list.set(j, l);
                    list.set(j + 1, k);
                }
            }
        }
    }
}
