package jv.labs.concessionaria.model;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private double precoBase;
    private boolean disponivel;

    public Veiculo(String marca, String modelo, int ano, double precoBase, boolean disponivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        setPrecoBase(precoBase);
        this.disponivel = disponivel;
    }

    public Veiculo(String marca, String modelo, double precoBase, boolean disponivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = 2026;
        setPrecoBase(precoBase);
        this.disponivel = disponivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano < 1886) {
            throw new IllegalArgumentException("Erro: Ano invalido! Ano deve ser maior do que 1886");
        }
        this.ano = ano;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if(precoBase < 0) {
            throw new IllegalArgumentException("Erro: Preço inválido! Preço não pode ser negativo.");
        }
        this.precoBase = precoBase;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
