package DAO;

import java.util.Map;

public abstract class PadraoDAO<T> {
    protected String Chave = "id";
    protected String Tabela;
    protected String Arquivo;

    protected abstract void SetTabela();
    protected PadraoDAO(){ SetTabela(); }
    protected abstract T MontaModel(String registro);
    protected abstract Map<String, String> CriaParametros(T model);
}