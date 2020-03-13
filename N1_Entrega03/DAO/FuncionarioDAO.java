package DAO;

import Crud.Crud;
import Models.FuncionarioModel;

import java.io.IOException;
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


    public void MontaString(FuncionarioModel funcionario, String txt) throws IOException {

        FuncionarioModel func = new FuncionarioModel();
        Crud crud = new Crud();

        String Registro = "";
        Registro = String.valueOf(crud.ProxId("Funcionario.txt"));
        Registro += "|" + func.getNome();
        Registro += "|" + func.getCPF();
        Registro += "|" + func.getSalario();
        Registro += "|" + func.getUsername();
        Registro += "|" + func.getPassword();

        crud.Insert(Registro, txt);

    }
}
