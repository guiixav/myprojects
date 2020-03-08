package Models;

public class PedidoModel extends EntidadeModel{
    //Variáveis
    private String Cliente;
    private String Produto;
    private double ValorTotal;

    //Construtores
    public PedidoModel() {

    }

    public PedidoModel(String Cliente, String Produto, double ValorTotal) {
        this.Cliente = Cliente;
        this.Produto = Produto;
        this.ValorTotal = ValorTotal;
    }

    //Getters
    public String getCliente() { return this.Cliente; }
    public String getProduto() { return this.Produto; }
    public double getValorTotal() { return this.ValorTotal; }

    //Setters
    public void setCliente(String Cliente) {
        if (Cliente.length() > 0) {
            this.Cliente = Cliente;
        }
    }

    public void setProduto(String Produto) {
        if (Produto.length() > 0) {
            this.Produto = Produto;
        }
    }

    public void setValorTotal(double ValorTotal) {
        if (ValorTotal > 0) {
            this.ValorTotal = ValorTotal;
        }
    }
}
