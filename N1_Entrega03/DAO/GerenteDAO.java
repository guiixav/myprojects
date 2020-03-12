package DAO;

import Models.GerenteModel;

import java.util.*;

public class GerenteDAO {
    protected Map<String, String> CriaParametros(GerenteModel gerente) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Id", String.valueOf(gerente.getId()));
        map.put("Nome", gerente.getNome());
        map.put("CPF", gerente.getCPF());
        map.put("Salario", String.valueOf(gerente.getSalario()));

        return map;
    }

    protected GerenteModel MontaModel(String registro){
        GerenteModel gerente = new GerenteModel();
        List<String> registros = Arrays.asList(registro.split("|"));
        gerente.setId(Integer.parseInt(registros.get(0)));
        gerente.setNome(registros.get(1));
        gerente.setCPF(registros.get(2));
        gerente.setSalario(Double.parseDouble(registros.get(3)));

        return gerente;
    }
}
