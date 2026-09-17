package jv.threads.threads6;

public class Main {

    public static void main(String[] args) {
        TiqueTaque tt = new TiqueTaque();
        ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
        ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);

        try {
            tique.t.join();
            taque.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
