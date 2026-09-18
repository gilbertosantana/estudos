package jv.threads.threads7;

public class Main {

    static void main(String[] args) {

        MinhaThread t1 = new MinhaThread("#1");
        MinhaThread t2 = new MinhaThread("#2");

        System.out.println("Pausando a thread #1");

        t1.suspend();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Pausando a thread #2");
        t2.suspend();

        System.out.println("Resumindo a thread #1");
        t1.resume();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Resumindo a thread #2");
        t2.resume();

        System.out.println("Terminando a thread #2");
        t2.stop();
    }
}
