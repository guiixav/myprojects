package Models;

public class FuncionarioModel extends EntidadeModel{
    // Variáveis
    private String Nome;
    private String CPF;
    private double Salario;

    // Construtores
    public FuncionarioModel() {

    }

    public FuncionarioModel(String Nome, String CPF, double Salario) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Salario = Salario;
    }

    // Getters
    public String getNome() {
        return this.Nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public double getSalario() {
        return this.Salario;
    }

    // Setters
    public void setNome(String Nome) {
        if (Nome.length() > 0) {
            this.Nome = Nome;
        }
    }

    public void setCPF(String CPF) {
        if (CPF.length() > 0) {
            this.CPF = CPF;
        }
    }

    public void setSalario(double Salario) {
        if (Salario >= 0) {
            this.Salario = Salario;
        }
    }
}