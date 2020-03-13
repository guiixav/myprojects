package Models;

public class ProdutoModel extends EntidadeModel{
    private String Idd;
    private String Descricao;
    private double Preco;


    public ProdutoModel(){

    }

    public ProdutoModel(String Idd, String Descricao, double Preco){
        this.Idd = Idd;
        this.Preco = Preco;
        this.Descricao = Descricao;
    }


    public String getIdd() {
        return Idd;
    }

    public void setIdd (String Idd) {
        Idd = Idd;
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
