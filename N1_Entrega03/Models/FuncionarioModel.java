package com.source.repos.GitGuilherme.myprojects.N1_Entrega03.Models;

public class Funcionario {
    // Variáveis
    // #region
    private int Id;
    private String Nome;
    private String CPF;
    private double Salario;
    // #endregion

    // Construtores
    // #region
    public Funcionario() {

    }

    public Funcionario(int Id, String Nome, String CPF, double Salario) {
        this.Id = Id;
        this.Nome = Nome;
        this.CPF = CPF;
        this.Salario = Salario;
    }
    // #endregion

    // Getters
    // #region
    public int getId() {
        return this.Id;
    }

    public String getNome() {
        return this.Nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public String getSalario() {
        return this.Salario;
    }
    // #endregion

    // Setters
    // #region
    public void setId(int Id) {
        if (Id >= 0) {
            this.Id = Id;
        }
    }

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