package DAO;

import Crud.Crud;
import Models.ClienteModel;
import Models.FuncionarioModel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ClienteDAO extends PadraoDAO<ClienteModel>{
    @Override
    protected Map<String, String> CriaParametros(ClienteModel cliente) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Id", String.valueOf(cliente.getId()));
        map.put("Nome", cliente.getNome());
        map.put("CPF", cliente.getCPF());

        return map;
    }

    @Override
    protected void SetTabela() {
        Tabela = "Clientes.txt";
    }


    public void MontaString(ClienteModel cliente) throws IOException {

        ClienteModel clt = new ClienteModel();
        Crud crud = new Crud();
        String Registro = "";
        Registro = String.valueOf(crud.ProxId("Cliente.txt"));
        Registro += "|" + clt.getNome();
        Registro += "|" + clt.getCPF();

        crud.Insert(Registro, "Clientes.txt");

    }


}

