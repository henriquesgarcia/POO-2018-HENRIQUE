package service;

import model.Quadro;
import model.VisibilidadeQuadro;

import java.util.ArrayList;

public class QuadroService {

    private ArrayList<Quadro> quadros = new ArrayList<>();

    public void criarNovoQuadro(String nome){
        Quadro quadro = new Quadro(nome, VisibilidadeQuadro.PARTICULAR);
        quadros.add(quadro);
    }

    public String listarQuadros(){

        String listaDeQuadros = "";

        if (quadros.isEmpty()){
            listaDeQuadros = "Não existem quadros criados\n";
        } else {
            for (int i = 0; i < quadros.size(); i++) {

                listaDeQuadros += " " + quadros.get(i).getNomeQuadro() + "\n";
            }
        }

        return listaDeQuadros;
    }

    public void criarNovaLista(int i, String nome){
        quadros.get(i).criarLista(nome);
    }
}
