package Models;

import Crud.Crud;

import java.io.IOException;

public class FuncionarioModel extends EntidadeModel {
    // Variáveis
    private String Idd;
    private String Nome;
    private String CPF;
    private double Salario;
    private String Username;
    private String Password;

    // Construtores
    public FuncionarioModel() {

    }

    public FuncionarioModel(String Nome, String CPF, double Salario, String Username, String Password) {

        this.Nome = Nome;
        this.CPF = CPF;
        this.Salario = Salario;
        this.Username = Username;
        this.Password = Password;

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

    public String getUsername() {
        return this.Username;
    }

    public String getPassword() {
        return this.Password;
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

    public void setUsername(String Username) {
        if (Username != "") {
            this.Username = Username;
        }
    }
    public void setPassword(String Password) {
        if (Password != "") {
            this.Password = Password;
        }
    }


}