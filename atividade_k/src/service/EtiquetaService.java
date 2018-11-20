package service;

import model.Etiqueta;

import java.util.ArrayList;

public class EtiquetaService {

    private ArrayList<Etiqueta> etiquetas;

    public void criarNovaEtiqueta(Etiqueta etiqueta){
        etiquetas.add(etiqueta);
    }

    public void editarEtiqueta(){

    }

    public void excluirEtiqueta(Etiqueta etiqueta){
        etiquetas.remove(etiqueta);
    }
}
