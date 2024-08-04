package thread;

import java.util.Arrays;
import java.util.List;

public class MainThread extends Thread {
    public int a = 5, b = 7, c;

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 19,1,23, 23, 5, 7, 5, 3, 1, 2);
        MainThread m = new MainThread();
        m.start();

        MainThread m2 = new MainThread();
        m2.start();
        System.out.println("\n\n------------ Even numbers:  ---------------------\n");
        m.displayEven(numbers);
        System.out.println("\n\n------------ Odd numbers:  ---------------------\n");
        m2.displayOdd(numbers);
        System.out.println("\n\n------------ Even numbers:  ---------------------\n");
        m.printEven();
        System.out.println("\n\n------------ Odd numbers:  ---------------------\n");
        m2.printOdd();


    }

    void printOdd(){
        for(int o = 1; o<=20; o++){
            System.out.print(o % 2 != 0 ? " "+o : " ");
        }
    }
    void printEven(){
        for(int o = 1; o<=20; o++){
            System.out.print(o % 2 == 0 ? " "+o : " ");
        }
    }
    void displayOdd(List<Integer> numbers) {
        numbers.stream()
                .filter(x -> x%2 != 0)
                .mapToInt(Integer::intValue)
                .forEach(x -> System.out.print(" "+x));
    }

    void displayEven(List<Integer> numbers) {
        numbers.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .forEach(x -> System.out.print(" "+x));
    }

    public void run() {
        System.out.println("Hello world !");
    }
}
