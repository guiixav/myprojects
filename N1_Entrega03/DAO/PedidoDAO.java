package DAO;

import Models.PedidoModel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PedidoDAO extends PadraoDAO<PedidoModel>{

    @Override
    protected Map<String, String> CriaParametros(PedidoModel pedido) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Id", String.valueOf(pedido.getId()));
        map.put("ClienteId", pedido.getClienteId());
        map.put("ValorTotal", String.valueOf(pedido.getValorTotal()));
        map.put("Produto", pedido.getProduto());
        return map;
    }

    @Override
    protected PedidoModel MontaModel(String registro){
        PedidoModel pedido = new PedidoModel();
        List<String> registros = Arrays.asList(registro.split("|"));

        pedido.setId(Integer.parseInt(registros.get(0)));
        pedido.setClienteId(registros.get(1));
        pedido.setProduto(registros.get(2));
        pedido.setValorTotal(Double.parseDouble(registros.get(3)));

        return pedido;
    }

    @Override
    protected void SetTabela() {
        Tabela = "Pedidos.txt";
    }
}
