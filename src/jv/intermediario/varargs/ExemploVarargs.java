package jv.intermediario.varargs;

import java.util.Arrays;

public class ExemploVarargs {
    public static void main(String[] args) {

        System.out.println(soma(1, 2));
        System.out.println(soma(1, 2, 3));

        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println(soma(vetor));

        System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    }

    static int soma(int a, int b) {
        return a + b;
    }

    static int soma(int a, int b, int c) {
        return a + b + c;
    }

    static int soma(int[] vetor) {
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    static int soma(int a, int b, int... vetor) {
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }
}
