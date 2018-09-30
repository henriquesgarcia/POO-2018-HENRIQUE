public class Empresa {

    private String nome;
    private String cnpj;
    public Funcionario[] empregados;
    private int pos = 0;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.empregados = new Funcionario[10];
    }

    public void adiciona(Funcionario f){
        this.empregados[pos] = f;
        pos++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        String s = "Nome da Empresa: "+ this.getNome() +"\n";
        s += "CNPJ: "+ this.getCnpj() +"\n\n";

        for (int i = 0; i < 3; i++) {
            s += "> "+ this.empregados[i].toString();
        }
        return s;
    }
}