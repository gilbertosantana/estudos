package jv.intermediario.enums.exercicio;

public class Main {
    public static void main(String[] args) {
        double x = 50.0;
        double y = 25.0;

        for (Operacoes operacao : Operacoes.values()) {
            System.out.print(x + " ");
            System.out.print(operacao + " ");
            System.out.print(y + " = ");
            System.out.println(operacao.executarOperacao(x, y));
        }
    }
}
