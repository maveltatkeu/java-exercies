package thread;

public class MainThread extends Thread{

    public  void run(){
        System.out.println("Hello world !");
    }

    public static void main(String[] args) {
        MainThread m = new MainThread();
        m.start();
    }
}
