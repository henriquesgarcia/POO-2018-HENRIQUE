package model;

import java.time.format.DateTimeFormatter;

public class Commit {

    private String id;
    private String autor;
    private String mensagem;

    public Commit(String id, String autor, String mensagem) {
        this.id = id;
        this.autor = autor;
        this.mensagem = mensagem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        String s = "id: " + getId() + "\n";
        s += "Autor: " + getAutor() + "\n";
        s += "Mensagem: " + getMensagem() + "\n";
        s += "Data: " + java.time.LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n";
        s += "Hora: " + java.time.LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "\n";
        return s;
    }
}
