package jv.threads.threads7;

import org.w3c.dom.ls.LSOutput;

public class MinhaThread implements Runnable{

    private String nome;
    private boolean estaSuspensa;
    private boolean foiTerminada;

    public MinhaThread(String nome) {
        this.nome = nome;
        this.estaSuspensa = false;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {

        System.out.println(STR."Executando \{nome}");

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(STR."Thread \{nome}, \{i}");
                Thread.sleep(200);
                synchronized (this) {
                    while (estaSuspensa) {
                        wait();
                    }
                    if (foiTerminada) {
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
                throw new RuntimeException(e);

        }

        System.out.println(STR."Thread \{nome} terminada.");
    }

    void suspend() {
        estaSuspensa = true;
    }

    synchronized void resume() {
        estaSuspensa = false;
        notify();
    }

    synchronized void stop() {
        this.foiTerminada = true;
        notify();
    }
}