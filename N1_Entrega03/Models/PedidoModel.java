package Models;

import Crud.Crud;

import java.io.IOException;

public class PedidoModel extends EntidadeModel{

    //Variáveis
    private int ClienteId;
    private int ProdutoId;
    private double ValorTotal;

    //Construtores
    public PedidoModel() {

    }

    public PedidoModel(int ClienteId, int ProdutoId, double ValorTotal) {
        this.ClienteId = ClienteId;
        this.ProdutoId = ProdutoId;
        this.ValorTotal = ValorTotal;
    }

    //Getters
    public int getClienteId() { return this.ClienteId; }
    public int getProdutoId() { return this.ProdutoId; }
    public double getValorTotal() { return this.ValorTotal; }

    //Setters

    public void setClienteId(int ClienteId) throws IOException {
        Crud crud = new Crud();

        if (crud.ListaIds("C:\\myprojects\\N1_Entrega03\\Arquivos\\Clientes.txt").contains(ClienteId)) {
            this.ClienteId = ClienteId;
        }
    }

    public void setProdutoId(int ProdutoId) throws IOException {
        Crud crud = new Crud();
        if (crud.ListaIds("C:\\myprojects\\N1_Entrega03\\Arquivos\\Produtos.txt").contains(ProdutoId)) {
            this.ProdutoId = ProdutoId;
        }
    }

    public void setValorTotal(double ValorTotal) {
        if (ValorTotal > 0) {
            this.ValorTotal = ValorTotal;
        }
    }
}
