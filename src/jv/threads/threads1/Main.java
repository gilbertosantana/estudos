package jv.threads.threads1;

public class Main {

    public static void main(String[] args) {
        MinhaThread thread = new MinhaThread("Thread #1", 600);
        //thread.start();

        MinhaThread thread1 = new MinhaThread("Thread #2", 900);

    }
}
