package jv.intermediario.enums.enum2;

public class Main {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.DOMINGO;
        System.out.println(dia + " - " + dia.getValor());

        Data data = new Data(31, 8, 2026, DiaSemana.SEGUNDA);
    }
}