public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String rg;

    public Funcionario(String nome, String departamento, double salario, String rg) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public String getRg() {
        return rg;
    }

    @Override
    public String toString(){
        String s = "\n------- FUNCIONÁRIOS -------\n";
        s += "Nome: "+ this.getNome() +"\n";
        s += "Departamento: "+ this.getDepartamento() +"\n";
        s += "Salário: R$ "+ this.getSalario() +"\n";
        s += "RG: "+ this.getRg() +"\n";

        return s;
    }
}