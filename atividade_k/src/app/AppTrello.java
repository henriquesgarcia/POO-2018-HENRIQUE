package app;

import service.Service;

import javax.swing.*;

public class AppTrello {

    private static int opcao;
    private static String s;

    public static void main(String[] args) {

        Service service = new Service();

        do {

            opcao = Integer.valueOf(JOptionPane.showInputDialog(menuInicial()));

            switch (opcao){
                case 1:
                    String nomeQuadro = JOptionPane.showInputDialog(menuCriarQuadro());
                    service.criarNovoQuadro(nomeQuadro);
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null,service.listarQuadros());
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Insira um valor válido!");
            }

        } while (opcao != 0);
    }

    private static String menuInicial(){
//        String s;

        s = "---------------- TRELLO TRISTE :( ----------------\n\n";
        s += "1 - Criar Quadro\n";
        s += "2 - Listar Quadros\n";
        s += "3 - Acessar quadro\n\n";

        s += "-------------\n";
        s += "Quadros:\n";


        return s;
    }

    private static String menuCriarQuadro(){
//        String s;

        s = "---------------- CRIAR QUADRO ----------------\n\n";
        s += "Nome:";

        return s;
    }

    private static String menuListarQuadros(){
        s = "---------------- LISTAGEM DE QUADROS ----------------\n\n";

        return s;
    }
}
