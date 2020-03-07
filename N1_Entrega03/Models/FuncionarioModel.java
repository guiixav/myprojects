package Models;

public class FuncionarioModel extends EntidadeModel{
    // Variáveis
    // #region
    private String Nome;
    private String CPF;
    private double Salario;
    // #endregion

    // Construtores
    // #region
    public FuncionarioModel() {

    }

    public FuncionarioModel(String Nome, String CPF, double Salario) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Salario = Salario;
    }
    // #endregion

    // Getters
    // #region
    public String getNome() {
        return this.Nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public double getSalario() {
        return this.Salario;
    }
    // #endregion

    // Setters
    // #region
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
    // #endregion
}