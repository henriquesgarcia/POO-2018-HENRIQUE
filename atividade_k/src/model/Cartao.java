package model;

import java.util.ArrayList;

public class Cartao {

    private String tituloCartao;
    private String descricao;
    private ArrayList<Etiqueta> etiquetas;


    public Cartao(String tituloCartao, String descricao) {
        this.tituloCartao = tituloCartao;
        this.descricao = descricao;
        this.etiquetas = new ArrayList<>();
    }

    public void criarEtiqueta(String nome, String cor){
        Etiqueta etiqueta = new Etiqueta(nome,cor);

        etiquetas.add(etiqueta);
    }

    public String getTituloCartao() {
        return tituloCartao;
    }

    public void setTituloCartao(String tituloCartao) {
        this.tituloCartao = tituloCartao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
