package model;

import java.util.ArrayList;

public class Quadro {

    private String nomeQuadro;
    private VisibilidadeQuadro visibilidadeQuadro; // PARTICULAR OU PÚBLICA
    private ArrayList<Lista> listas = new ArrayList<>();

    public Quadro(String nomeQuadro, VisibilidadeQuadro visibilidadeQuadro) {
        this.nomeQuadro = nomeQuadro;
        this.visibilidadeQuadro = visibilidadeQuadro.PARTICULAR;
    }

    // adicionarLista();

    public VisibilidadeQuadro getVisibilidadeQuadro() {
        return visibilidadeQuadro;
    }

    public void setVisibilidadeQuadro(VisibilidadeQuadro visibilidadeQuadro) {
        this.visibilidadeQuadro = visibilidadeQuadro;
    }

    public String getNomeQuadro() {
        return nomeQuadro;
    }

    public void setNomeQuadro(String nomeQuadro) {
        this.nomeQuadro = nomeQuadro;
    }

    public ArrayList<Lista> getListas() {
        return listas;
    }
}
