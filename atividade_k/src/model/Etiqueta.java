package model;

public class Etiqueta {

    private String nomeEtiqueta;
    private CorEtiqueta corEtiqueta;


    public Etiqueta(String nomeEtiqueta, CorEtiqueta corEtiqueta) {
        this.nomeEtiqueta = nomeEtiqueta;
        this.corEtiqueta = corEtiqueta;
    }

    public Etiqueta(CorEtiqueta corEtiqueta) {
        this.corEtiqueta = corEtiqueta;
    }

    public String getNomeEtiqueta() {
        return nomeEtiqueta;
    }

    public void setNomeEtiqueta(String nomeEtiqueta) {
        this.nomeEtiqueta = nomeEtiqueta;
    }

    public CorEtiqueta getCorEtiqueta() {
        return corEtiqueta;
    }

    public void setCorEtiqueta(CorEtiqueta corEtiqueta) {
        this.corEtiqueta = corEtiqueta;
    }
}
