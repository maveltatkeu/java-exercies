package exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Integer> values = new ArrayList<>();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            for (int o = 0; o <= 9; o++) {
                getPositiveValue();
            }
        } catch (DuplicatesException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("---------------------------------");
        System.out.println("Enter a number : ");
        int N = s.nextInt();
        try {
            checkOdd(N);
        } catch (OddException e) {

        }
    }

    static void getPositiveValue() throws DuplicatesException {
        System.out.print("Enter a value : ");
        int n = s.nextInt();
        if (values.contains(n)) {
            throw new DuplicatesException("The input number is duplicated !");
        } else {
            values.add(n);
            System.out.println("GOOD !!!");
        }

    }

    static void checkOdd(int n) throws OddException {
        if (n % 2 == 0) throw new OddException("The input number is not Odd !");
        System.out.println("GOOD BYE !");
    }

    static class OddException extends Exception {
        public OddException(String n) {
            System.out.println(n);
        }
    }

    static class DuplicatesException extends Exception {
        public DuplicatesException(String n) {
            System.out.println(n);
        }
    }
}
