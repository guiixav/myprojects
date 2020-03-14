package Models;

import Crud.Crud;

import java.io.IOException;

public class Usuario extends EntidadeModel {
    // Variáveis
    private String Username;
    private String Password;
    private int TipoUsuario;
    private int FuncionarioId;

    //Construtores
    public Usuario(){

    }

    public Usuario(String Username, String Password, int TipoUsuario, int FuncionarioId){
        this.Username = Username;
        this.Password = Password;
        this.TipoUsuario = TipoUsuario;
        this.FuncionarioId = FuncionarioId;
    }

    // Getters
    public String getUsername() {
        return this.Username;
    }

    public int getTipoUsuario(){ return this.TipoUsuario; }

    public String getPassword() {
        return this.Password;
    }

    public int getFuncionarioId() { return this.FuncionarioId; }

    // Setters
    public void setUsername(String Username) {
        if (Username.length() > 0) {
            this.Username = Username;
        }
    }

    public void setPassword(String Password) {
        if (Password.length() > 0) {
            this.Password = Password;
        }
    }

    public void setTipoUsuario(int TipoUsuario){
        this.TipoUsuario = TipoUsuario;
    }

    public void setFuncionarioId(int FuncionarioId) throws IOException {
        Crud crud = new Crud();
        if(crud.ListaIds("Funcionarios.txt").contains(FuncionarioId)){
            this.FuncionarioId = FuncionarioId;
        }
    }
}