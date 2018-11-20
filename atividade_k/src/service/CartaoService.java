package service;

import model.Cartao;

import java.util.ArrayList;

public class CartaoService {

    private ArrayList<Cartao> cartoes;

    public void adicionarCartao(Cartao cartao){
        cartoes.add(cartao);
    }
}
