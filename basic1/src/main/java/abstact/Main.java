package abstact;

public class Main {
    public static void main(String[] args){
        Employee manager = new Manager("Jean Paul", 350000, 142000 );
        Employee programmer = new Programmer("Mavel Picsou", 280000, 34, 2500);

        // Printing a separator line
        System.out.println("---------------------------------------------");
        manager.displayInfo();
        // Printing a separator line
        System.out.println("---------------------------------------------");
        programmer.displayInfo();
        // Printing a separator line
        System.out.println("---------------------------------------------");


    }
}
