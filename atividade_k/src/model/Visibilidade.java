package model;

public enum Visibilidade {

    /* visibilidade do quadro */
    PARTICULAR("Particular"),
    PUBLICO("Público");

    private String visibilidade;

    Visibilidade(String visibilidade) {
        this.visibilidade = visibilidade;
    }

    public String getVisibilidade() {
        return visibilidade;
    }
}
