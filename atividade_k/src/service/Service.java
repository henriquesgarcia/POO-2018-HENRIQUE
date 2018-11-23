package service;

import model.Quadro;
import model.VisibilidadeQuadro;

import java.util.ArrayList;

public class Service {

    private ArrayList<Quadro> quadros = new ArrayList<>();

    /* QuadroService */
    public void criarNovoQuadro(String nome){
        Quadro quadro = new Quadro(nome, VisibilidadeQuadro.PARTICULAR);
        quadros.add(quadro);
    }

    public void toggleQuadro(int i){
        quadros.get(i).toggleFechado();
    }

    public void removerQuadro(int i){
        if (quadros.get(i).isFechado()){
            quadros.remove(i);
        }
    }

    public String listarQuadros(){

        String listaDeQuadros = "";

        if (quadros.isEmpty())
            listaDeQuadros = "Não existem quadros criados\n";
        else {
            for (int i = 0; i < quadros.size(); i++) {

                listaDeQuadros += (i+1) + ") " + quadros.get(i).getNomeQuadro() + "\n";
            }
        }

        return listaDeQuadros;
    }


    /* ListaService */
    public void criarNovaLista(int i, String nome){
        quadros.get(i).criarLista(nome);
    }


    /* Cartao */
    public void criarCartao(int numeroQuadro, int numeroLista, String nome, String descricao){
        quadros.get(numeroQuadro).getListas(numeroLista).criarCartao(nome, descricao);
    }


}
