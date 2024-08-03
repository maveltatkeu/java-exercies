package accenture;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long valOct = 0, valHex = 0;
        boolean t = false;

        System.out.print("Enter a value : ");
        int D, r;
        D = s.nextInt();

        // Binary Conversion - Convert an integer number to a binary number.
        System.out.println("convert an integer number to a binary number.");
        System.out.println(D + "(2) = " + dec2bin(D));

        // Octal conversion
        System.out.println("convert a decimal number to a hexadecimal number.");
        System.out.println(D + "(8) = " + dec2oct(D));

        //Convert a decimal number to an octal number.
        System.out.println("Convert a decimal number to an octal number.");
        System.out.println(D + "(16) = " + dec2hex(D));


        //convert a binary number to a decimal number.
        System.out.println("Convert a binary number to a hexadecimal  number.");

        do {
            System.out.print("Enter Binary value : ");
            String a = s.next();
            if (Pattern.matches("[0-1]+", a)) {
                t = true;
                valOct = Long.valueOf(a);
            } else {
                System.out.println("Wrong input !\n");
                t = false;
            }
        } while (t == false);
        System.out.println(D + "(2) = " + dec2hex(bin2dec(valOct))+"(16)");

        //convert a binary number to a decimal number.
        System.out.println("Convert a binary number to an octal number.");

        do {
            System.out.print("Enter Binary value : ");
            String a = s.next();
            if (Pattern.matches("[0-1]+", a)) {
                t = true;
                valOct = Long.valueOf(a);
            } else {
                System.out.println("Wrong input !\n");
                t = false;
            }
        } while (t == false);
        System.out.println(D + "(2) = " + dec2oct(bin2dec(valOct))+"(8)");


    }

    static long bin2dec(long B) {
        int r, i =0;
        long res = 0;
        while (B != 0) {
            r = (int) B % 10;
            res = r* (long) Math.pow(2,i)+ res;
            B = B / 10;
            i++;
        }
        return res;
    }

    static String dec2bin(long B) {
        int r;
        String res = "";
        while (B != 0) {
            r = (int) B % 2;
            res = r + res;
            B = B / 2;
        }

        return res;
    }

    static String dec2oct(long B) {
        int r;
        String res = "";

        while (B != 0) {
            r = (int) B % 8;
            res = r + res;
            B = B / 8;
        }
        return res;
    }

    static String dec2hex(long B) {
        int r;
        String res = "";
        while (B != 0) {
            r = (int) B % 16;
            switch (r) {
                case 10:
                    res = "A" + res;
                    break;
                case 11:
                    res = "B" + res;
                    break;
                case 12:
                    res = "C" + res;
                    break;
                case 13:
                    res = "D" + res;
                    break;
                case 14:
                    res = "E" + res;
                    break;
                case 15:
                    res = "F" + res;
                    break;

                default:
                    res = r + res;
            }

            B = B / 16;
        }
        return res;
    }

    ;
}
