package DAO;

import Crud.Crud;
import Models.ProdutoModel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class ProdutoDAO extends PadraoDAO<ProdutoModel>{

    @Override
    protected Map<String, String> CriaParametros(ProdutoModel produto) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Id", String.valueOf(produto.getId()));
        map.put("Descricao", produto.getDescricao());
        map.put("Preco", String.valueOf(produto.getPreco()));


        return map;
    }

    public void MontaString(ProdutoModel prod, String acao) throws IOException {

        ProdutoModel produto = new ProdutoModel();
        Crud crud = new Crud();
        String Registro = "";
        Registro = String.valueOf(crud.ProxId("C:\\myprojects\\N1_Entrega03\\Arquivos\\Produtos.txt"));
        Registro += "|" + produto.getDescricao();
        Registro += "|" + produto.getPreco();

        crud.Insert(Registro, "C:\\myprojects\\N1_Entrega03\\Arquivos\\Produtos.txt");
        crud.Imprimir(acao, Registro);
    }

    public boolean MontaStringUpdate(ProdutoModel prod, String Id) throws IOException {
        Crud crud = new Crud();
        String Registro = "";
        Registro += String.valueOf(prod.getId());
        Registro += "|" + prod.getDescricao();
        Registro += "|" + prod.getPreco();

        if(crud.Update(Id,"C:\\myprojects\\N1_Entrega03\\Arquivos\\Produtos.txt",Registro))
        {
          return true;
        }
        else return false;
    }



    @Override
    protected void SetTabela() { Tabela = "C:\\myprojects\\N1_Entrega03\\Arquivos\\Produtos.txt"; }


}
