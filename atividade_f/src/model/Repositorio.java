package model;

import java.util.ArrayList;

public class Repositorio {

    private String nomeRepositorio;
    private ArrayList<Arquivo> arquivos;

    public Repositorio(String nomeRepositorio, ArrayList<Arquivo> arquivos) {
        this.nomeRepositorio = nomeRepositorio;
        this.arquivos = arquivos;
    }

    public void criarArquivo(Arquivo arquivo) {
        arquivos.add(arquivo);
    }

    public void apagarArquivo(Arquivo arquivo){
        arquivos.remove(arquivo);
    }

    public void commit(){

    }

    public void push(){

    }

    public String getNomeRepositorio() {
        return nomeRepositorio;
    }

    public void setNomeRepositorio(String nomeRepositorio) {
        this.nomeRepositorio = nomeRepositorio;
    }

    public ArrayList<Arquivo> getArquivos() {
        return arquivos;
    }

    public void setArquivos(ArrayList<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }
}
