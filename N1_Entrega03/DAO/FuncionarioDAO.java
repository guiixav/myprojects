package DAO;

import Models.FuncionarioModel;

import java.util.HashMap;
import java.util.Map;

public class FuncionarioDAO extends PadraoDAO<FuncionarioModel>{


    @Override
    protected Map<String, String> CriaParametros(FuncionarioModel funcionario) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("Id", String.valueOf(funcionario.getId()));
        map.put("Nome", funcionario.getNome());
        map.put("CPF", funcionario.getCPF());
        map.put("Salario", String.valueOf(funcionario.getSalario()));

        return map;
    }

    @Override
    protected void SetTabela() {
        Tabela = "Funcionarios.txt";
    }
}
