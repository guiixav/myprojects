package com.source.repos.GitGuilherme.myprojects.N1_Entrega03.Models;

public class GerenteModel extends FuncionarioModel {
    private int TipoFuncionario;

    public int getTipoFucionario() {
        return this.TipoFuncionario;
    }

    public void setTipoFuncionario(int TipoFuncionario) {
        if (TipoFuncionario == 0) {
            this.TipoFuncionario = TipoFuncionario;
        } else {
            this.TipoFuncionario = 1;
        }
    }
}