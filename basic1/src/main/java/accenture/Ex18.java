package accenture;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex18 {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        long valA = 0, valB = 0;
        boolean t = false;

        do {
            System.out.print("Enter first value : ");
            String a = s.next();
            if (Pattern.matches("[0-1]+", a)) {
                t = true;
                valA = Long.valueOf(a);
            } else {
                System.out.println("Wrong input !\n");
                t = false;
            }
        } while (t == false);

        do {
            System.out.print("Enter second value : ");
            String a = s.next();
            if (Pattern.matches("[0-1]+", a)) {
                t = true;
                valB = Long.valueOf(a);
            } else {
                System.out.println("Wrong input !\n");
                t = false;
            }
        } while (t == false);

        int k = 0;
        String res = "0";
        while (valB != 0) {
            long a = valA * (valB % 10) * (long) Math.pow(10, k);
            res = addition(a, Long.valueOf(res));
            k++;
            valB /= 10;
        }
        System.out.println(res);
    }

    static String addition(long valA, long valB) {
        int[] res = new int[40];
        int r = 0;
        int i = 0;
        while (valA != 0 || valB != 0) {
            res[i] = (int) (valA % 10 + valB % 10 + r) % 2;
            r = (int) (valA % 10 + valB % 10 + r) / 2;
            valA = valA / 10;
            valB = valB / 10;
            i++;
        }
        res[i] = r != 0 ? r : 0;
        String result = "";
        while (i >= 0) {
            result += "" + res[i--];
        }
        return result;
    }
}
