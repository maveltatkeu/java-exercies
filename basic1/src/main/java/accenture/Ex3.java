package accenture;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first value : ");
        int a = s.nextInt();
        System.out.print("Enter second value : ");
        int b = s.nextInt();
        try{

            System.out.println(a+" / "+b+" = "+(a/b));
        }catch (Exception e){
            System.out.print("Operation impossible !");
        }
    }
}
