package model;

import java.util.ArrayList;

public class Quadro {

    private String nomeQuadro;
    private VisibilidadeQuadro visibilidadeQuadro; // PARTICULAR OU PÚBLICA
    private ArrayList<Lista> listas;
    private boolean fechado;

    public Quadro(String nomeQuadro, VisibilidadeQuadro visibilidadeQuadro) {
        this.nomeQuadro = nomeQuadro;
        this.visibilidadeQuadro = visibilidadeQuadro.PARTICULAR;
        this.listas = new ArrayList<>();
        this.fechado = false;
    }

    public void criarLista(String nome){
        Lista lista = new Lista(nome);

        listas.add(lista);
    }

    public void toggleFechado(){
        this.fechado = !this.fechado;
    }

    public boolean isFechado() {
        return fechado;
    }

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

    public Lista getListas(int i) {
        return listas.get(i);
    }
}
