package jv.labs.folhapagamento;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calculaSalarioFinal();

    public void exibirContraCheque() {
        System.out.println("====== CONTRACHEQUE ======");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Funcionario:" +
                "Nome = " + nome +
                "\nCPF = " + cpf +
                "\nSalario Base = " + String.format("%.2f", salarioBase);
    }
}
