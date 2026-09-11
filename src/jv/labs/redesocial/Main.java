package jv.labs.redesocial;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        Usuario u1 = new Usuario("beatriz", "bia@gmail.com");
        Usuario u2 = new Usuario("moises", "moises@gmail.com");
        Usuario u3 = new Usuario("erikeHilton", "erike@gmail.com");


        Post p1 = new Post(u2, "Flávio vai ganhar para presidencia!");

        for (int i = 0; i < 37; i++) {
            p1.curtir();
        }

        Comentario c1 = new Comentario(u1, "Que vai ganhar é Auguto");
        Comentario c2 = new Comentario(u3, "Faz o L");

        p1.adicionarComentario(c1);
        p1.adicionarComentario(c2);

        System.out.println(p1.exibirPostCompleto());
    }
}
