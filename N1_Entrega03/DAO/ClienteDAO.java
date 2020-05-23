package DAO;

import Crud.Crud;
import Models.ClienteModel;

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
        Tabela = "C:\\myprojects\\N1_Entrega03\\Arquivos\\Clientes.txt";
    }


    public void MontaString(ClienteModel cliente, String acao) throws IOException {
        Crud crud = new Crud();
        String Registro = "";
        Registro = String.valueOf(crud.ProxId("C:\\myprojects\\N1_Entrega03\\Arquivos\\Clientes.txt"));
        Registro += "|" + cliente.getNome();
        Registro += "|" + cliente.getCPF();

        crud.Insert(Registro, "C:\\myprojects\\N1_Entrega03\\Arquivos\\Clientes.txt");

        crud.Imprimir(acao, Registro);
    }

}

