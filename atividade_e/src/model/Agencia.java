package model;

import model.Conta;

import java.util.ArrayList;

public class Agencia {

    private ArrayList<Conta> contas;

    public void criarConta(Conta conta) {
        this.contas.add(conta);
    }

    public boolean logar(String numeroConta, String senha){

    }

    public void menuPadrao(){

        System.out.println("----------- Caixa Eletrônico --------------\n");
        System.out.println("1 - Depositar\n2 - Criar Conta\n3 - Acessar Conta\n");
    }

    public void depositar(Conta contaDestino, double valor){

        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
    }

    public void menuLogado(){

    }
}
