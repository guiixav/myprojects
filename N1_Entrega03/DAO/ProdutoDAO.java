package DAO;

import Models.ProdutoModel;

import java.util.HashMap;
import java.util.Map;

public class ProdutoDAO extends PadraoDAO<ProdutoModel>{

    @Override
    protected Map<String, String> CriaParametros(ProdutoModel produto) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Id", String.valueOf(produto.getId()));
        map.put("Descricao", produto.getDescricao());
        map.put("QntEstoque", String.valueOf(produto.getQntEstoque()));
        map.put("QntVendidos", String.valueOf(produto.getQntVendidos()));

        return map;
    }

    @Override
    protected void SetTabela() { Tabela = "Produtos.txt"; }


}
