package Models;

import Crud.Crud;

import java.io.IOException;

public class ClienteModel extends EntidadeModel{
    // Variáveis
    private String Nome;
    private String CPF;

    // Construtores
    public ClienteModel() {

    }

    public ClienteModel( String Nome, String CPF) {
        this.Nome = Nome;
        this.CPF = CPF;
    }

    // Getters
        public String getNome() {
        return this.Nome;
    }

    public String getCPF() {
        return this.CPF;
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
}