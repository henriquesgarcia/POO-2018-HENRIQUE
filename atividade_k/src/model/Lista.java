package model;

import java.util.ArrayList;

public class Lista {

    private String nomeLista;
    private ArrayList<Cartao> cartoes;
    private boolean fechado;

    public Lista(String nomeLista) {
        this.nomeLista = nomeLista;
        this.cartoes = new ArrayList<>();
        this.fechado = false;
    }

    public void criarCartao(String nome, String descricao){
        Cartao cartao = new Cartao(nome, descricao);

        cartoes.add(cartao);
    }

    public void toggleFechado(){
        this.fechado = !this.fechado;
    }

    public boolean isFechado() {
        return fechado;
    }

    public Cartao getCartoes(int i) {
        return cartoes.get(i);
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }
}
