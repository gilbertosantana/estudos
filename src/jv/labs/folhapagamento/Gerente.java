package jv.labs.folhapagamento;

public class Gerente extends Funcionario {

    private double bonus;

    public Gerente() {
    }

    public Gerente(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calculaSalarioFinal() {
        return getSalarioBase() + bonus;
    }
}
