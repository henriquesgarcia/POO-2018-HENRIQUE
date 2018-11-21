package model;

public enum VisibilidadeQuadro {

    /* visibilidade do QUADRO */
    PARTICULAR("Particular"),
    PUBLICO("Público");

    private String visibilidade;

    VisibilidadeQuadro(String visibilidade) {
        this.visibilidade = visibilidade;
    }

    public String getVisibilidade() {
        return visibilidade;
    }
}
