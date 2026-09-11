package jv.labs.redesocial;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Comentario {

    private Usuario autor;
    private String texto;
    private LocalDateTime dataHora;

    public Comentario(Usuario autor, String texto) {
        this.autor = autor;
        this.texto = texto;
        this.dataHora = LocalDateTime.now();
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        StringBuilder sb = new StringBuilder();
        sb.append("\nAutor: " + autor);
        sb.append("\nTexto: " + texto);
        sb.append("\n");
        sb.append(dataHora.format(dtf));
        return sb.toString();
    }
}
