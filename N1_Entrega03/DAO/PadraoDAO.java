package DAO;

import Crud.Crud;

import java.util.Map;

public abstract class PadraoDAO<T> extends Crud {
    protected String Chave = "id";
    protected String Tabela;
    protected String Arquivo;

    protected abstract void SetTabela();
    protected PadraoDAO(){ SetTabela(); }
    protected abstract T MontaModel(String registro);
    protected abstract Map<String, String> CriaParametros(T model);
}