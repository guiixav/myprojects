package DAO;

import Crud.Crud;
import Models.PedidoModel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PedidoDAO extends PadraoDAO<PedidoModel>{

    @Override
    protected Map<String, String> CriaParametros(PedidoModel pedido) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Id", String.valueOf(pedido.getId()));
        map.put("ClienteId", String.valueOf(pedido.getClienteId()));
        map.put("ValorTotal", String.valueOf(pedido.getValorTotal()));
        map.put("ProdutoId", String.valueOf(pedido.getProdutoId()));
        return map;
    }

    @Override
    protected void SetTabela() {
        Tabela = "C:\\myprojects\\N1_Entrega03\\Arquivos\\Pedidos.txt";
    }

    public void MontaString(PedidoModel pedido, String acao) throws IOException {
        Crud crud = new Crud();
        String Registro = "";

        Registro = String.valueOf(crud.ProxId("C:\\myprojects\\N1_Entrega03\\Arquivos\\Pedidos.txt"));
        Registro += "|" + pedido.getClienteId();
        Registro += "|" + pedido.getProdutoId();
        Registro += "|" + pedido.getValorTotal();

        crud.Insert(Registro, "C:\\myprojects\\N1_Entrega03\\Arquivos\\Pedidos.txt");
        crud.Imprimir(acao, Registro);
    }
}
