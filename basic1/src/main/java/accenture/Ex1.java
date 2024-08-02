package accenture;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your First Name : ");
        String fname = s.next();
        System.out.print("\nEnter your Last Name : ");
        String lname = s.next();

        System.out.println("\nHello \n"+fname+" "+lname);
    }
}
