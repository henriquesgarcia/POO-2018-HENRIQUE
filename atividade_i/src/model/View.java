package model;

public class View {

    private String altura; // em %
    private String largura; // em %

    public View(String altura, String largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }
}
