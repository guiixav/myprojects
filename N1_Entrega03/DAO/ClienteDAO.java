package DAO;

import Models.ClienteModel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
    protected ClienteModel MontaModel(String registro){
        ClienteModel cliente = new ClienteModel();
        List<String> registros = Arrays.asList(registro.split("|"));

        cliente.setId(Integer.parseInt(registros.get(0)));
        cliente.setNome(registros.get(1));
        cliente.setCPF(registros.get(2));

        return cliente;
    }

    @Override
    protected void SetTabela() {
        Tabela = "Clientes.txt";
    }
}
