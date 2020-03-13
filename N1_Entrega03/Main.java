import Crud.Crud;
import DAO.GerenteDAO;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

    }

    public void TestaMetodos() throws IOException {
        GerenteDAO gerente = new GerenteDAO();

        gerente.Insert("1|Guilherme|123.123.123-02|0.02", "Funcionarios.txt");

        System.out.println(String.valueOf(gerente));
    }

    public String ObjetoParaString(Object objeto){
        return
    }
}