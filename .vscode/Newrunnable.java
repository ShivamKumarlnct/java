

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

public class Newrunnable {
    public static void main(String[] args) {
        MyRunnable runn = new MyRunnable();
        Thread thread1 = new Thread(runn);
        thread1.start();
    }
}
