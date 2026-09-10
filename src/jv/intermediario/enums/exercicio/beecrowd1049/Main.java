package jv.intermediario.enums.exercicio.beecrowd1049;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next().toUpperCase();
        String b = sc.next().toUpperCase();
        String c = sc.next().toUpperCase();

        Animal animal = Animal.buscarAnimal(a, b, c);

        System.out.println(animal.name().toLowerCase());

        sc.close();
    }
}

enum Animal {
    AGUIA(Classificacao.VERTEBRADO, ReinoAnimalia.AVE, Grupo.CARNIVORO),
    POMBA(Classificacao.VERTEBRADO, ReinoAnimalia.AVE, Grupo.ONIVORO),
    HOMEM(Classificacao.VERTEBRADO, ReinoAnimalia.MAMIFERO, Grupo.ONIVORO),
    VACA(Classificacao.VERTEBRADO, ReinoAnimalia.MAMIFERO, Grupo.HERBIVORO),
    PULGA(Classificacao.INVERTEBRADO, ReinoAnimalia.INSETO, Grupo.HEMATOFAGO),
    LAGARTA(Classificacao.INVERTEBRADO, ReinoAnimalia.INSETO, Grupo.HERBIVORO),
    SANGUESSUGA(Classificacao.INVERTEBRADO, ReinoAnimalia.ANELIDEO, Grupo.HEMATOFAGO),
    MINHOCA(Classificacao.INVERTEBRADO, ReinoAnimalia.ANELIDEO, Grupo.ONIVORO);

    private Classificacao classificacao;
    private ReinoAnimalia reinoAnimalia;
    private Grupo grupo;

    Animal(Classificacao classificacao, ReinoAnimalia reinoAnimalia, Grupo grupo) {
        this.classificacao = classificacao;
        this.reinoAnimalia = reinoAnimalia;
        this.grupo = grupo;
    }

    public static Animal buscarAnimal(String strClassificacao, String strReinoAnimalia, String strGrupo) {
        Classificacao c = Enum.valueOf(Classificacao.class, strClassificacao.toUpperCase());
        ReinoAnimalia r = Enum.valueOf(ReinoAnimalia.class, strReinoAnimalia.toUpperCase());
        Grupo g = Enum.valueOf(Grupo.class, strGrupo.toUpperCase());
        Animal animal = null;
        for (Animal a : Animal.values()) {
            if(c == a.classificacao && r == a.reinoAnimalia && g == a.grupo) {
                animal = a;
            }
        }
        return animal;
    }
}

enum Grupo {
    CARNIVORO,
    HERBIVORO,
    ONIVORO,
    HEMATOFAGO
}

enum ReinoAnimalia {
    AVE,
    MAMIFERO,
    INSETO,
    ANELIDEO
}

enum Classificacao {
    VERTEBRADO,
    INVERTEBRADO
}