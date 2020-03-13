package Models;

import Crud.Crud;

import java.io.IOException;

public class ClienteModel extends EntidadeModel{
    // Variáveis
    private String Idd;
    private String Nome;
    private String CPF;

    // Construtores
    public ClienteModel() {

    }

    public ClienteModel(String Idd, String Nome, String CPF) {
        this.Idd = Idd;
        this.Nome = Nome;
        this.CPF = CPF;
    }

    // Getters
    public String getIdd() {
        return this.Idd;
    }
    public String getNome() {
        return this.Nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    // Setters
    public void setIdd(String Idd) throws IOException {
        Crud crud = new Crud();

        if (Idd.length() > 0 && crud.ListaIds("Clientes.txt").contains(Idd)) {
            this.Idd = Idd;
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
}