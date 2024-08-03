package accenture;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        // Print a pattern of asterisks and equal signs to create a design
        System.out.println("* * * * * * * * * * * * ==================================");
        System.out.println(" * * * * * * * * * * *  ==================================");
        System.out.println("* * * * * * * * * * * * ==================================");
        System.out.println(" * * * * * * * * * * *  ==================================");
        System.out.println("* * * * * * * * * * * * ==================================");
        System.out.println(" * * * * * * * * * * *  ==================================");
        System.out.println("* * * * * * * * * * * * ==================================");
        System.out.println(" * * * * * * * * * * *  ==================================");
        System.out.println("* * * * * * * * * * * * ==================================");

// Display a pattern to create an ASCII art representation of a simple face
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");

        System.out.println("######################################################################################");
        System.out.println("######################################################################################");
        System.out.println("###########  ######      #################################      ######################");
        System.out.println("###########  ####  ######  ####  #################  ####  ######  ####################");
        System.out.println("###########  ###  ########  ####  ###############  ####  ########  ###################");
        System.out.println("###########  ###  ########  #####  #############  #####  ########  ###################");
        System.out.println("###########  ###  ########  ######  ###########  ######  ########  ###################");
        System.out.println("###########  ###  #      #  #######  #########  #######  #      #  ###################");
        System.out.println("###########  ###  ########  ########  #######  ########  ########  ###################");
        System.out.println("###########  ###  ########  #########  #####  #########  ########  ###################");
        System.out.println("#  ########  ###  ########  ##########  ###  ##########  ########  ###################");
        System.out.println("##         #####  ########  ###########     ###########  ########  ###################");
        System.out.println("######################################################################################");
        System.out.println("######################################################################################");


        Scanner s = new Scanner(System.in);
        System.out.print("Enter first value : ");
        int a = s.nextInt();
        System.out.print("Enter second value : ");
        int b = s.nextInt();
        try{
            System.out.println(a+" + "+b+" = "+(a+b));
            System.out.println(a+" - "+b+" = "+(a-b));
            System.out.println(a+" * "+b+" = "+(a*b));
            System.out.println(a+" / "+b+" = "+(a/b));
        }catch (Exception e){
            System.out.print("Operation impossible !");
        }

    }
}
