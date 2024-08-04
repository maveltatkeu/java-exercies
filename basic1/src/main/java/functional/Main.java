package functional;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

interface SumCalculator {
    int fact(int s);

}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SumCalculator sumCalculator = (x) -> {
            int res = 1;
            for (int l = 1; l <= x; l++) {
                res *= l;
            }
            return res;
        };

        System.out.print("\nEnter first value : ");
        //int a = s.nextInt();
        System.out.print("\nEnter second value : ");
        //String b = s.next();

        //System.out.println("Factorial(" + a + ") = " + sumCalculator.fact(a));
        List<String> stringList = List.of("Red", "Green", "Blue", "Pink", "Brown","dskjEd", "dop pcsoo", "OkjEd", "oJEwpfj", "djklhfhs", "OPPEeddfef");
        stringList.stream().forEach(x -> {
            System.out.println(x.toLowerCase());
            System.out.println(x.toUpperCase());
        });
        System.out.print("\n\n------------ Lowercase strings:  ---------------------\n");
        stringList.stream().map(x -> x.toLowerCase()).forEach(System.out::println);
        System.out.print("\n\n------------ Uppercase strings:  ---------------------\n");
        stringList.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
        System.out.print("\n\nBonjour \n");

        List<Integer> numbers = List.of(2, 3, 19,1,23, 23, 5, 7, 5, 3, 1, 2);

        System.out.print("\n\n------------ Even sum:  ---------------------\n");
        int sumOfevens = numbers.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of even numbers: " + sumOfevens);

        System.out.print("\n\n------------ Odd sum :  ---------------------\n");
        int sumOdds = numbers.stream()
                .filter(x -> x % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of odd numbers: " + sumOdds);

        System.out.print("\n------------ Max stream:  ---------------------\n");
        double max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(00);

        System.out.println("Average of numbers: " + max);


        System.out.print("\n------------ Min stream:  ---------------------\n");
        double min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);

        System.out.println("Average of numbers: " + min);

        System.out.print("\n------------ Average stream:  ---------------------\n");
        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Average of numbers: " + avg);

        System.out.print("\n------------ Remove duplicates stream:  ---------------------\n");
        numbers.stream()
                .distinct()
                .forEach(aa -> System.out.print(" "+aa));

        // count the number of strings in a list that start with a specific letter using streams.
        System.out.print("\n------------ Counting Strings :  ---------------------\n");
        String ll = "o";

        long numStrings = stringList.stream()
                .map(x -> x.toLowerCase())
                .filter(x -> x.startsWith(ll.toLowerCase()))
                .count();

        System.out.print("\nNumber of string starting with \'"+ll+"\' : " +numStrings);

        //sort a list of strings in alphabetical order, ascending and descending using streams.
        stringList.stream()
                .map(d -> d.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(aa -> System.out.println(" "+aa.toUpperCase()));


        //find the second smallest and largest elements in a list of integers using streams.
        double nn = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(-11111);

        System.out.print("\n Second Bigest -- "+nn);

        double ss = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst().orElse(11111);

        System.out.print("\n Second Smalest -- "+ss);
    }

}
