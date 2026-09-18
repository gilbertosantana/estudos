package jv.threads.threads8;

public class Main {



    static void main(String[] args) {
        final String RECURSO1 = "recurso #1";
        final String RECURSO2 = "recurso #2";

        new MinhaThread(RECURSO1, RECURSO2, "Thread #1");
        new MinhaThread(RECURSO2, RECURSO1, "Thread #2");


    }
}
