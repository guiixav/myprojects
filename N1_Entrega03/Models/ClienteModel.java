package com.source.repos.GitGuilherme.myprojects.N1_Entrega03.Models;

public class ClienteModel {
    // Variáveis
    // #region
    private String Nome;
    private String CPF;
    // #endregion

    // Construtores
    // #region
    public ClienteModel() {

    }

    public ClienteModel(String Nome, String CPF) {
        this.Nome = Nome;
        this.CPF = CPF;
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
    // #endregion
}