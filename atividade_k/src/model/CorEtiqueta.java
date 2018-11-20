package model;

public enum CorEtiqueta {

    VERDE("Verde"),
    AMARELO("Amarelo"),
    VERMELHO("Vermelho");

    private String cor;

    CorEtiqueta(String cor){
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
}
