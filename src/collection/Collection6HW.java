package collection;

import java.util.*;
//https://www.hackerrank.com/challenges/mark-and-toys/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting

public class Collection6HW {
    static List<Integer> listOfPrices = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toysNumber = scanner.nextInt();
        scanner.nextLine();
        int budget = scanner.nextInt();
        scanner.nextLine();
        List<Integer> prices = generatePrices(toysNumber);
        System.out.println("prices: " + prices);
        System.out.println(canBuyToys(budget, prices));
    }

    public static List<Integer> generatePrices(int toys) {
        for (int i = 0; i < toys; i++) {
            listOfPrices.add((int) (Math.random() * 2000));
        }
        listOfPrices.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        return listOfPrices;
    }

    public static int canBuyToys(int budget, List<Integer> prices){
        int toysToBuy = 0;
        int purchase = 0;
        for (int i = 0; i < prices.size(); i++) {
            if(purchase + prices.get(i) <= budget){
                toysToBuy++;
                purchase =purchase + prices.get(i);
            }
        }
        return toysToBuy;
    }
}
