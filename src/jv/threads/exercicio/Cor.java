package jv.threads.exercicio;

public enum Cor {

    VERMELHO(1000),
    VERDE(2000),
    AMARELO(300);


    private int tempoEspera;

    Cor(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
}
