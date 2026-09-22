package jv.threads.exercicio;

public class Semaforo implements Runnable {

    private Cor cor;
    private boolean parar;
    private boolean corMudou;

    public Semaforo() {
        this.cor = Cor.VERMELHO;
        parar = false;
        corMudou = false;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            while (!parar) {
                Thread.sleep(cor.getTempoEspera());
                mudarCor();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private synchronized void mudarCor() {
        switch (cor) {
            case VERMELHO:
                cor = Cor.VERDE;
                break;
            case VERDE:
                cor = Cor.AMARELO;
                break;
            case AMARELO:
                cor = Cor.VERMELHO;
                break;
            default:
                break;
        }
        corMudou = true;
        notify();
    }

    public synchronized void esperarCorMudar() {
        try {
            while (!corMudou) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        corMudou = false;
    }

    public Cor getCor() {
        return cor;
    }

    public void parar() {
        this.parar = true;
    }
}
