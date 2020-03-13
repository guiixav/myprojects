package DAO;

import Models.ClienteModel;

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
}
