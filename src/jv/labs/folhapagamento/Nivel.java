package jv.labs.folhapagamento;

public enum Nivel {

    JUNIOR(1.10),
    PLENO(1.25),
    SENIOR(1.50);

    private double bonus;

    Nivel(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
