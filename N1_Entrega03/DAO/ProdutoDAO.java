package DAO;

import Models.ProdutoModel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import Crud.Crud;
public class ProdutoDAO extends PadraoDAO<ProdutoModel>{

    @Override
    protected Map<String, String> CriaParametros(ProdutoModel produto) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Id", String.valueOf(produto.getId()));
        map.put("Descricao", produto.getDescricao());
        map.put("Preco", String.valueOf(produto.getPreco()));


        return map;
    }

    public void MontaString(ProdutoModel prod) throws IOException {

        ProdutoModel produto = new ProdutoModel();
        Crud crud = new Crud();
        String Registro = "";
        Registro = String.valueOf(crud.ProxId("Produto.txt"));
        Registro += "|" + produto.getDescricao();
        Registro += "|" + produto.getPreco();

        crud.Insert(Registro, "Produtos.txt");

    }
    public boolean MontaStringUpdate(ProdutoModel prod, String Id) throws IOException {


        ProdutoModel produto = new ProdutoModel();
        Crud crud = new Crud();
        String Registro = "";
        Registro += String.valueOf(produto.getId());
        Registro += "|" + produto.getDescricao();
        Registro += "|" + produto.getPreco();

        if(
        crud.Update(Id,"Produtos.txt",Registro))
        {
          return true;
        }
        else return false;
    }



    @Override
    protected void SetTabela() { Tabela = "Produtos.txt"; }


}
