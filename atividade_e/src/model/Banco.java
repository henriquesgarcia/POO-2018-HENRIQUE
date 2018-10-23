package model;

import model.Conta;

import java.util.ArrayList;

public class Banco {

    private ArrayList<Conta> contas;
    private String nome;

    public void novaConta(Conta conta) {
        this.contas.add(conta);
    }

//    public boolean logar(String numeroConta, String senha){
//
//    }

    public void menuLogado(){

    }
}
