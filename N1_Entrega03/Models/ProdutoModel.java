package Models;

public class ProdutoModel extends EntidadeModel{
    private String Descricao;
    private double Preco;
    private int QntEstoque;
    private int QntVendidos;

    public ProdutoModel(){

    }

    public ProdutoModel(String Descricao, double Preco, int QntEstoque, int QntVendidos){
        this.Descricao = Descricao;
        this.Preco = Preco;
        this.QntEstoque = QntEstoque;
        this.QntVendidos = QntVendidos;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public int getQntEstoque() {
        return QntEstoque;
    }

    public void setQntEstoque(int qntEstoque) {
        QntEstoque = qntEstoque;
    }

    public int getQntVendidos() {
        return QntVendidos;
    }

    public void setQntVendidos(int qntVendidos) {
        QntVendidos = qntVendidos;
    }
}
