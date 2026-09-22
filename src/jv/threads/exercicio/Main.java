package jv.threads.exercicio;

public class Main {

    static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        for (int i = 0; i < 10; i++) {
            System.out.println(semaforo.getCor());
            semaforo.esperarCorMudar();
            if ((i+1) % 3 == 0) {
                System.out.println();
            }
        }
        semaforo.parar();
    }
}
