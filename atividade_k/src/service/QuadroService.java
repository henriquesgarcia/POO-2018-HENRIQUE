package service;

import model.Lista;
import model.Quadro;
import model.VisibilidadeQuadro;

import java.util.ArrayList;

public class QuadroService {

    private ArrayList<Lista> listas = new ArrayList<>();

    public Quadro criarNovoQuadro(String nome){
        Quadro quadro = new Quadro(nome, VisibilidadeQuadro.PARTICULAR);
        
    }
}
