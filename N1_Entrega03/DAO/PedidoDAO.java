package DAO;

import Models.PedidoModel;

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
}
