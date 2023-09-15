package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();
        countries.add("Russia");
        countries.add("Belarus");
        countries.add("Ukraine");
        countries.add("Uganda");
        countries.add("Uganda");


        for (String i: countries) {
            System.out.println(i);
        }
    }
}
