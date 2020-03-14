package DAO;

import Crud.Crud;
import Models.ClienteModel;
import Models.PedidoModel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PedidoDAO extends PadraoDAO<PedidoModel>{

    @Override
    protected Map<String, String> CriaParametros(PedidoModel pedido) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Id", String.valueOf(pedido.getId()));
        map.put("ClienteId", pedido.getClienteId());
        map.put("ValorTotal", String.valueOf(pedido.getValorTotal()));
        map.put("Produto", pedido.getProdutoId());
        return map;
    }

    @Override
    protected void SetTabela() {
        Tabela = "Pedidos.txt";
    }

    public void MontaString(PedidoModel pedido) throws IOException {

        PedidoModel ped = new PedidoModel();
        Crud crud = new Crud();
        String Registro = "";
        Registro = String.valueOf(crud.ProxId("Pedidos.txt"));
        Registro += "|" + ped.getClienteId();
        Registro += "|" + ped.getProdutoId();
        Registro += "|" + ped.getValorTotal();
        crud.Insert(Registro, "Pedidos.txt");

    }
}
