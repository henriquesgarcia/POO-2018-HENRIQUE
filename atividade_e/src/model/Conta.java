package model;

public class Conta {

    private String numeroConta;
    private Pessoa titular;
    private String senha; // no mínimo 4 caracteres
    private double saldo;

    public Conta(String numeroConta, Pessoa titular, String senha, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.senha = senha;
        this.saldo = saldo;
    }

    public boolean sacar(double valor, String senha){
        if (verificaSenha(senha)){
            if (valor <= this.saldo){
                this.saldo -= valor;
                return true;
            }
            return false;
        }
        return false;
    }

    public void depositar(Conta contaDestino, double valor){

        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
    }

    public boolean verificaSenha(String senha){

        return this.senha.length() >= 4 && this.senha.equals(senha);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
