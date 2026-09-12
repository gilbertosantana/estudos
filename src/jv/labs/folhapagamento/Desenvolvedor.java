package jv.labs.folhapagamento;

public class Desenvolvedor extends Funcionario {

    private Nivel nivel;

    public Desenvolvedor(String nome, String cpf, double salarioBase, Nivel nivel) {
        super(nome, cpf, salarioBase);
        this.nivel = nivel;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    @Override
    public double calculaSalarioFinal() {
        return getSalarioBase() * nivel.getBonus();
    }
}
