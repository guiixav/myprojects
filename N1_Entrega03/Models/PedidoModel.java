package Models;

public class PedidoModel extends EntidadeModel{

    //Variáveis
    private String ClienteId;
    private String Produto;
    private double ValorTotal;

    //Construtores
    public PedidoModel() {

    }

    public PedidoModel(String ClienteId, String Produto, double ValorTotal) {
        this.ClienteId = ClienteId;
        this.Produto = Produto;
        this.ValorTotal = ValorTotal;
    }

    //Getters
    public String getClienteId() { return this.ClienteId; }
    public String getProduto() { return this.Produto; }
    public double getValorTotal() { return this.ValorTotal; }

    //Setters
    public void setClienteId(String Cliente) {
        if (Cliente.length() > 0) {
            this.ClienteId = Cliente;
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
