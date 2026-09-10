package jv.intermediario.enums.enum3;

import jv.intermediario.enums.enum2.DiaSemana;

public class Main {
    public static void main(String[] args) {
        DiaSemana[] dias = DiaSemana.values();

        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }

        System.out.println();

        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia);
        }
    }
}
