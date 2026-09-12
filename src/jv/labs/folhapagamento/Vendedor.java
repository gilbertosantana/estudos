package jv.labs.folhapagamento;

public class Vendedor extends  Funcionario {

    private int totalVendas;
    private double comissao;

    public Vendedor() {

    }

    public Vendedor(String nome, String cpf, double salarioBase, int totalVendas, double comissao) {
        super(nome, cpf, salarioBase);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calculaSalarioFinal() {
        return getSalarioBase() + (totalVendas * comissao);
    }


}
