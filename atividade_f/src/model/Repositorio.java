package model;

import java.util.ArrayList;

public class Repositorio {

    private String nomeRepositorio;
    private ArrayList<Arquivo> arquivos;

    public Repositorio(String nomeRepositorio, ArrayList<Arquivo> arquivos) {
        this.nomeRepositorio = nomeRepositorio;
        this.arquivos = arquivos;
    }

    public void addArquivo(Arquivo arquivo) {
        for (int i = 0; i < arquivos.size(); i++) {
            if (!arquivos.contains(arquivo)){
                arquivos.add(arquivo);
            }
        }
    }

    public void apagarArquivo(Arquivo arquivo){

        for (int i = 0; i < arquivos.size(); i++) {

            if (arquivos.contains(arquivo)){

                arquivos.remove(arquivo);
                arquivo.setStatus("Deletado");
            }
            else
                System.out.println("Arquivo Inexistente");
        }

        arquivos.remove(arquivo);
        arquivo.setStatus("Deletado");
    }

    public void commit(){

    }

    public void push(){

    }

    public String listarArquivos(){

        String s = "Arquivos no repositório: " + getNomeRepositorio() + "\n";

        for (int i = 0; i < arquivos.size(); i++) {
            s += " > " + (i+1) + " - " + getArquivos() + "\n";
        }

        return s;
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
