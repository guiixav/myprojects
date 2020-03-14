package Models;

public class ProdutoModel extends EntidadeModel{
    private String Idd;
    private String Descricao;
    private double Preco;


    public ProdutoModel(){

    }

    public ProdutoModel(String Descricao, double Preco){
        this.Preco = Preco;
        this.Descricao = Descricao;
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

}
