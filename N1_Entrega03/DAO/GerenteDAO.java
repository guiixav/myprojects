package DAO;

import Models.GerenteModel;

import java.util.*;

public class GerenteDAO extends PadraoDAO<GerenteModel>{
    @Override
    protected Map<String, String> CriaParametros(GerenteModel gerente) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Id", String.valueOf(gerente.getId()));
        map.put("Nome", gerente.getNome());
        map.put("CPF", gerente.getCPF());
        map.put("Salario", String.valueOf(gerente.getSalario()));

        return map;
    }

    @Override
    protected void SetTabela(){
        Arquivo = "Gerentes.txt";
    }
}
