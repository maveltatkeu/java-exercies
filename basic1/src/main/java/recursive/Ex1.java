package recursive;

public class Ex1 {
    public static void main(String[] args){
        System.out.println("!10 = "+fact(10));
        System.out.println("SUM(10) = "+sum(10));
    }

    static int fact(int i){
        if (i <= 1) {
            return 1;
        }else{
            return i * fact(i-1);
        }
    }

    static int sum(int n){
        if (n <= 1) {
            return 1;
        }else{
            return n + sum(n-1);
        }
    }
}
