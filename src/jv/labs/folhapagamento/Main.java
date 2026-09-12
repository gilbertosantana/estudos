package jv.labs.folhapagamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Cicília", "00000000000", 11000, 1000));
        funcionarios.add(new Desenvolvedor("Gilberto", "11111111111", 5000, Nivel.JUNIOR));
        funcionarios.add(new Desenvolvedor("Moises", "22222222222", 7000, Nivel.SENIOR));
        funcionarios.add(new Vendedor("Hosana", "33333333333", 1612.23, 20, 300));

        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirContraCheque();
            System.out.print("Salário Final: ");
            System.out.println(String.format("%.2f", funcionario.calculaSalarioFinal()));
            System.out.println();
        }
    }
}
