package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//проанализировать реультаты олимпиад за последние Т лет
//каждая команда задается тройкой имен, их порядок мб различным
//ккое максимальное число раз побеждала команда в одном и том же составе.
//формат ввода данных: в 1 строке задано одно целое число N (1<=N<=10^3) - количество лет, за которые есть данные
//в след N строках заданы команды-победители: в каждой строке указаны 3 разделенных пробелом имени.
//Каждое имя имеет длину от 1 до 10 символов, а так же состоит из заглавных латинских символов.
//формат выходных данных: В единственной строке выведите число - максимальное число побед команды в одинаковом составе.
public class Collection7HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        System.out.println(findChampions(createTeams(N)));
    }

    public static int findChampions(String[] teams) {
        int count = 0;
        int max = 1;
        String winners = "";
        String[] teamJ = null;
        for (int i = 0; i < teams.length; i++) {
            String[] teamI = teams[i].split(" ");
            Arrays.sort(teamI);
            teams[i] = creatSortedTeam(teamI);
        }
        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams.length; j++) {
                if(teams[i].equals(teams[j])){
                    count++;
                }
            }
            if(count >max){
                max = count;
            }
            count = 0;
        }
        System.out.println("winners: " + winners);
        return max;
    }

    public static String creatSortedTeam(String[] team) {
        String sortedTeam = "";
        for (int i = 0; i < team.length; i++) {
            sortedTeam = sortedTeam + " " + team[i] + " ";
        }
        return sortedTeam;
    }

    public static String[] createTeams(int N) {
        String[] teams = new String[N];
        for (int i = 0; i < N; i++) {
            teams[i] = createMamber() + " " + createMamber() + " " + createMamber();
            System.out.println(teams[i]);
        }
        return teams;
    }

    public static String createMamber() {
        List<String> listOfName = new ArrayList<>();
        listOfName.add("Сергей");
        listOfName.add("Михаил");
        listOfName.add("Дмитрий");
//        listOfName.add("Евгений");
//        listOfName.add("Андрей");
//        listOfName.add("Александр");

        return listOfName.get((int) (Math.random() * listOfName.size()));
    }
}

