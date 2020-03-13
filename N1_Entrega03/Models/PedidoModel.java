package Models;

import Crud.Crud;

import java.io.IOException;

public class PedidoModel extends EntidadeModel{

    //Variáveis
    private String Idd;
    private String ClienteId;
    private String ProdutoId;
    private double ValorTotal;

    //Construtores
    public PedidoModel() {

    }

    public PedidoModel(String idd, String ClienteId, String ProdutoId, double ValorTotal) {
        this.Idd = Idd;
        this.ClienteId = ClienteId;
        this.ProdutoId = ProdutoId;
        this.ValorTotal = ValorTotal;
    }

    //Getters
    public String getIdd() { return this.Idd; }
    public String getClienteId() { return this.ClienteId; }
    public String getProdutoId() { return this.ProdutoId; }
    public double getValorTotal() { return this.ValorTotal; }

    //Setters
    public void setIdd(String Idd) throws IOException {
        Crud crud = new Crud();

        if (Idd.length() > 0 && crud.ListaIds("Pedidos.txt").contains(Idd)) {
            this.Idd = Idd;
        }
    }
    public void setClienteId(String ClienteId) throws IOException {
        Crud crud = new Crud();

        if (ClienteId.length() > 0 && crud.ListaIds("Clientes.txt").contains(ClienteId)) {
            this.ClienteId = ClienteId;
        }
    }

    public void setProdutoId(String ProdutoId) throws IOException {
        Crud crud = new Crud();
        if (ProdutoId.length() > 0 && crud.ListaIds("Produtos.txt").contains(ProdutoId)) {
            this.ProdutoId = ProdutoId;
        }
    }

    public void setValorTotal(double ValorTotal) {
        if (ValorTotal > 0) {
            this.ValorTotal = ValorTotal;
        }
    }
}
