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

    public void criarNovaEtiqueta(){
    // service
    }

    public void editarEtiqueta(){
    // service
    }

    public void excluirEtiqueta(){
        // service
    }
}
