package com.source.repos.GitGuilherme.myprojects.N1_Entrega03.Models;

public class Usuario {
    // Variáveis
    // #region
    private String Username;
    private String Password;
    // #endregion

    // Getters
    // #region
    public String getUsername() {
        return this.Username;
    }

    public String getPassword() {
        return this.Password;
    }
    // #endregion

    // Setters
    // #region
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
    // #endregion
}