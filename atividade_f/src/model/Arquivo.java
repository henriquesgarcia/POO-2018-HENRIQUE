package model;

public class Arquivo {

    private String nomeArquivo;
    private String status; // tracked e untracked

    public Arquivo(String nomeArquivo, String status) {
        this.nomeArquivo = nomeArquivo;
        this.status = status;
    }

    public void editarArquivo(Arquivo arquivo){
        arquivo.setStatus("Tracked");
    }

    public void reset(Arquivo arquivo) {
        arquivo.setStatus("Untracked");
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}