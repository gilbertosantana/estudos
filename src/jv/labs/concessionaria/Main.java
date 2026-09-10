package jv.labs.concessionaria;

import jv.labs.concessionaria.model.Veiculo;
import jv.labs.concessionaria.services.VeiculoService;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Honda", "Civic", 266.500, true);
        //Veiculo v2 = new Veiculo("Honda", "Civic", 0, true);
//        Veiculo v2 = new Veiculo("Honda", "Civic", 0, true);
//        v2.setAno(1885);

        Veiculo v4 = new Veiculo("Volkswagen", "Gol", 60.000, true);

        VeiculoService vs1 = new VeiculoService(v1);
        vs1.aplicarDesconto(5);
        vs1.exibirFichaTecnica();
        vs1.vender(253.174);



    }
}
