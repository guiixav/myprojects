package Models;

public class ProdutoModel extends EntidadeModel{
    private String Nome;
    private String Descricao;
    private double Preco;


    public ProdutoModel(){

    }

    public ProdutoModel(String Nome, String Descricao, double Preco){
        this.Nome = Nome;
        this.Preco = Preco;
        this.Descricao = Descricao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String descricao) {
        Nome = Nome;
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
