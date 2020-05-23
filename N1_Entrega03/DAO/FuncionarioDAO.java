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
        Tabela = "C:\\myprojects\\N1_Entrega03\\Arquivos\\Funcionarios.txt";
    }


    public void MontaString(FuncionarioModel funcionario, String txt, String acao) throws IOException {
        Crud crud = new Crud();

        String Registro = "";
        Registro = String.valueOf(crud.ProxId(txt));
        Registro += "|" + funcionario.getNome();
        Registro += "|" + funcionario.getCPF();
        Registro += "|" + funcionario.getSalario();
        Registro += "|" + funcionario.getUsername();
        Registro += "|" + funcionario.getPassword();

        crud.Insert(Registro, txt);
        crud.Imprimir(acao, Registro);
    }
}
