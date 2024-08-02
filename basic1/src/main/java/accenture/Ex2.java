package accenture;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first value : ");
        int a = s.nextInt();
        System.out.print("Enter second value : ");
        int b = s.nextInt();

        System.out.println(a+" + "+b+" = "+(a+b));
    }
}
