package model;

import java.util.ArrayList;

public class Repositorio {

    private String nomeRepositorio;
    private ArrayList<Arquivo> arquivos;

    public Repositorio(String nomeRepositorio, ArrayList<Arquivo> arquivos) {
        this.nomeRepositorio = nomeRepositorio;
        this.arquivos = arquivos;
    }

    public void novoArquivo() {

    }

    public void apagarArquivo(){

    }

    public void add(){

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