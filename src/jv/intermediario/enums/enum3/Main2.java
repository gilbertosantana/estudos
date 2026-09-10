package jv.intermediario.enums.enum3;

import jv.intermediario.enums.enum1.DiaSemana;

public class Main2 {
    public static void main(String[] args) {

        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
        System.out.println(dia);
    }
}
