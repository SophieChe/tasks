package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection2 {
    //создать array  и linked list положить в оба по 1000000 элементов
    //после засечь время поиска 10 тыс рандомных элементов в обоих
    //тип данных Double

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        LinkedList<Double> listL = new LinkedList<>();

        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(Math.random());
        }
        System.out.println("ArrayList:" + (System.currentTimeMillis() - time));


        long timeL = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            listL.add(Math.random());
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - timeL));

        long timeToFind = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int indexList = (int) (Math.random() * listL.size());
            list.get(indexList);
        }
        System.out.println("time to find 10k in ArrayList:" + (System.currentTimeMillis() - timeToFind));

        long timeToFindl = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            int indexListL = (int) (Math.random() * listL.size());
            listL.get(indexListL);
        }

        System.out.println("time to find 10k in LinkedList:" + (System.currentTimeMillis() - timeToFind));
    }
}
