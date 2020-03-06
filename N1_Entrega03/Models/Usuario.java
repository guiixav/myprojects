package com.source.repos.GitGuilherme.myprojects.N1_Entrega03.Models;

public class Usuario {
    // Variáveis
    private String Username;
    private String Password;

    // Getters
    public String getUsername() {
        return this.Username;
    }

    public String getPassword() {
        return this.Password;
    }

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
}