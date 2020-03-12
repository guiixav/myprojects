package DAO;

import Models.FuncionarioModel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
    protected FuncionarioModel MontaModel(String registro){
        FuncionarioModel funcionario = new FuncionarioModel();
        List<String> registros = Arrays.asList(registro.split("|"));
        funcionario.setId(Integer.parseInt(registros.get(0)));
        funcionario.setNome(registros.get(1));
        funcionario.setCPF(registros.get(2));
        funcionario.setSalario(Double.parseDouble(registros.get(3)));

        return funcionario;
    }

    @Override
    protected void SetTabela() {
        Tabela = "Funcionarios.txt";
    }
}
