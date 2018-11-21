package model;

public class Etiqueta {

    private String nomeEtiqueta;
    private String corEtiqueta;


    public Etiqueta(String nomeEtiqueta, String corEtiqueta) {
        this.nomeEtiqueta = nomeEtiqueta;
        this.corEtiqueta = corEtiqueta;
    }

    public void alterarCor (String corEtiqueta) {
        this.corEtiqueta = corEtiqueta;
    }

    public String getCorEtiqueta() {
        return corEtiqueta;
    }

    public String getNomeEtiqueta() {
        return nomeEtiqueta;
    }

    public void setNomeEtiqueta(String nomeEtiqueta) {
        this.nomeEtiqueta = nomeEtiqueta;
    }
}
