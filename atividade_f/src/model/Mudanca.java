package model;

public class Mudanca {

    private String tipo;
    private Arquivo arquivo;

    public Mudanca(String tipo, Arquivo arquivo) {
        this.tipo = tipo;
        this.arquivo = arquivo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Arquivo getArquivo() {
        return arquivo;
    }

    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }
}
