package jv.threads.threads5;

import jv.threads.threads4.MinhaThreadRunnable;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        MinhaThreadSoma mt1 = new MinhaThreadSoma("#1", array);
        MinhaThreadSoma mt2 = new MinhaThreadSoma("#2", array);
    }
}
