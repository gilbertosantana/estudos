package jv.labs.concessionaria.services;

import jv.labs.concessionaria.model.Veiculo;

public class VeiculoService {

    private Veiculo veiculo;

    public VeiculoService(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void aplicarDesconto(double porcentagem) {
        double desconto = veiculo.getPrecoBase() / 100 * porcentagem;
        double precoFinal = veiculo.getPrecoBase() - desconto;
        veiculo.setPrecoBase(precoFinal);
    }

    public void vender(double valor) {
        if (veiculo.getDisponivel()) {
            if (valor < veiculo.getPrecoBase()) {
                System.out.println("Erro: O valor R$ " + valor + " é inferior ao preço base R$ " + veiculo.getPrecoBase());
            }
            else {
                System.out.println("Sucesso: Venda confirmada do veículo: " + veiculo.getModelo());
            }
        }
        else {
            System.out.println("Erro: Veículo vendido anteriormente!");
        }

    }

    public void exibirFichaTecnica() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ficha de tecnica:\n");
        sb.append("Marca: ");
        sb.append(veiculo.getMarca());
        sb.append("\nModelo: ");
        sb.append(veiculo.getModelo());
        sb.append("\nAno: ");
        sb.append(veiculo.getAno());
        sb.append("\nPreço: ");
        sb.append(veiculo.getPrecoBase());
        System.out.println(sb);

    }
}
