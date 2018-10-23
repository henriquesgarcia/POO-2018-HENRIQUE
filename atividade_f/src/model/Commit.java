package model;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Commit {

    private String id;
    private String autor;
    private String mensagem;

    public Commit(String id, String autor, String mensagem) {
        this.id = id;
        this.autor = autor;
        this.mensagem = mensagem;
        String data = (java.time.LocalDate.now()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String hora = (java.time.LocalTime.now()).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
