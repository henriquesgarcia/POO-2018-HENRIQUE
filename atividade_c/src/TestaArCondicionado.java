public class TestaArCondicionado {

    public static void main(String[] args) {

        ArCondicionado split01 = new ArCondicionado();
        split01.btus = 9000;
        split01.marca = "LG";
        split01.modelo = "x";
        split01.ligado = false;
        split01.temperatura = 23;
        split01.velocidade = 2;
        split01.swing = false;

        System.out.println(split01.status());

        split01.power();
        split01.mudarTemperatura(16);
        split01.velocidadeMais();
        split01.powerSwing();
        System.out.println(split01.status());
    }
}