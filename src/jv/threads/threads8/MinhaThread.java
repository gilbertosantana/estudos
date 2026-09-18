package jv.threads.threads8;

public class MinhaThread implements Runnable {

    private String recurso1;
    private String recurso2;

    public MinhaThread(String recurso1, String recurso2, String nome) {
        this.recurso1 = recurso1;
        this.recurso2 = recurso2;
        new Thread(this, nome).start();
    }


    @Override
    public void run() {
        String nome = Thread.currentThread().getName();
        synchronized (recurso1) {
            System.out.println(STR."\{nome}: bloqueou \{recurso1}");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(STR."\{nome}: tentando o acesso ao \{recurso2}");
            synchronized (recurso2) {
                System.out.println(STR."\{nome}: bloqueou \{recurso2}");
            }
        }

    }
}
