public class ArCondicionado {

    int btus;
    String marca;
    String modelo;
    boolean ligado;
    int temperatura;
    int velocidade;
    boolean swing;

    void power() {
        if (this.ligado == false)
            this.ligado = true;
        else
            this.ligado = false;
    }

    void mudarTemperatura(int valorTemp) {

        if (this.ligado == true) {
            if (this.temperatura >= 16 && this.temperatura <= 30)
                if (valorTemp >= 16 && valorTemp <= 30)
                    this.temperatura = valorTemp;
        }
    }

    void velocidadeMais(){
        if (this.ligado == true)
            if (this.velocidade > 1 && this.velocidade < 3)
                this.velocidade++;
    }

    void velocidadeMenos(){
        if (this.ligado == true)
            if (this.velocidade > 1 && this.velocidade <3)
                this.velocidade--;
    }

    void powerSwing(){
        if (this.ligado == true){
            if (this.swing == false)
                this.swing = true;
            else
                this.swing = false;
        }
    }

    String status(){
        String s = "btus: " + this.btus + "\n";
        s += "marca: " + this.marca + "\n";
        s += "modelo: " + this.modelo + "\n";
        s += "ar condicionado: ";

        if (this.ligado == false)
            s += "desligado\n";
        else
            s += "ligado\n";

        s += "temperatura: " + this.temperatura + "\n";
        s += "velocidade: " + this.velocidade + "\n";
        s += "swing: ";

        if (this.swing == false)
            s += "desligado\n";
        else
            s += "ligado\n";

        return s;
    }
}
