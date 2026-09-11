package jv.labs.redesocial;

import java.util.ArrayList;
import java.util.List;

public class Post {

    private Usuario autor;
    private String conteudo;
    private int quantidadeCurtidas;

    private List<Comentario> comentarios = new ArrayList<>();

    public Post(Usuario autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.quantidadeCurtidas = 0;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getQuantidadeCurtidas() {
        return quantidadeCurtidas;
    }

    public void setQuantidadeCurtidas(int quantidadeCurtidas) {
        this.quantidadeCurtidas = quantidadeCurtidas;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void adicionarComentario(Usuario usuario, Comentario comentario) {
        comentario.setAutor(usuario);
        this.comentarios.add(comentario);
    }

    public void adicionarComentario(Comentario comentario) {
        this.comentarios.add(comentario);
    }


    public String exibirPostCompleto() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autor: ");
        sb.append(autor);
        sb.append("\n");
        sb.append(conteudo);
        sb.append("\n");
        sb.append("Curtidas: ");
        sb.append(quantidadeCurtidas);
        sb.append("\n\n");
        sb.append("Comentarios: ");

        for (Comentario comentario : comentarios) {
            sb.append(comentario);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void curtir() {
        quantidadeCurtidas++;
    }
}
