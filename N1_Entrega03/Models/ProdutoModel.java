package Models;

public class ProdutoModel extends EntidadeModel{
    private String Id;
    private String Descricao;
    private double Preco;


    public ProdutoModel(){

    }

    public ProdutoModel(String Id, String Descricao, double Preco){
        this.Id = Id;
        this.Preco = Preco;
        this.Descricao = Descricao;
    }

    public String getNome() {
        return Id;
    }

    public void setNome(String descricao) {
        Id = Id;
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
