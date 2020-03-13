package DAO;

import Models.ProdutoModel;
import Models.ProdutoModel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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

    @Override
    public ProdutoModel MontaModel(String registro){
        ProdutoModel produto = new ProdutoModel();
        List<String> registros = Arrays.asList(registro.split("|"));

        produto.setId(Integer.parseInt(registros.get(0)));
        produto.setDescricao(registros.get(1));
        produto.setPreco(registros.get(2));
        produto.setQntEstoque(Integer.parseInt(registros.get(3)));
        produto.setQntVendidos(Integer.parseInt(registros.get(4)));

        return produto;
    }

}
