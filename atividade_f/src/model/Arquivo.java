package model;

public class Arquivo {

    private String nomeArquivo;
    private boolean tracked;

    public Arquivo(String nome, boolean tracked) {
        this.nomeArquivo = nome;
        this.tracked = tracked;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public boolean isTracked() {
        return tracked;
    }

    public void setTracked(boolean tracked) {
        this.tracked = tracked;
    }
}
