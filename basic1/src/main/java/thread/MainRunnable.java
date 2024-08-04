package thread;

public class MainRunnable implements Runnable{

    @Override
    public void run() {
        //Inactive state
        try{
            Thread.sleep(102);
        } catch (InterruptedException e) {
            System.out.println("The state of thread is ");
        }
        System.out.println( "The state for t1 after it invoked join method() on thread t2"
                        + " " + ThreadState.t1.getState());
        // implementing try-catch block
        try {
            Thread.sleep(202);
        }
        catch (InterruptedException i2) {
            i2.printStackTrace();
        }
    }

    public static void main(String[] args){
        MainRunnable rm = new MainRunnable();
        Thread t1 = new Thread(rm,"Sample");
        t1.start();
        String s = t1.getName();
        System.out.println(s);
    }
}
