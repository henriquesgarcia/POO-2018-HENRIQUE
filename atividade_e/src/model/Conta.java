package model;

public class Conta {

    private String numeroConta;
    private String nome;
    private String cpf;
    private String senha; // no mínimo 4 caracteres
    private double saldo;

    public Conta(String numeroConta, String nome, String cpf, String senha, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.saldo = saldo;
        String agencia = "401";
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
