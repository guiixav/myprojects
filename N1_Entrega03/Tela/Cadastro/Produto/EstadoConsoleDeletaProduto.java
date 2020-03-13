package Tela.Cadastro.Produto;

import Crud.Crud;
import DAO.ProdutoDAO;
import Models.ClienteModel;
import Models.ProdutoModel;
import Tela.EnumEstadoConsole;
import Tela.MaquinaEstadoConsole;

import java.io.IOException;
import java.util.Scanner;

public class EstadoConsoleDeletaProduto extends MaquinaEstadoConsole {
    @Override
    public boolean Executa() throws IOException {

        Crud crud = new Crud();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        ProdutoModel produtoModel = new ProdutoModel();
        Scanner scan = new Scanner(System.in);

        System.out.println("------DELETAR PRODUTO-------");
        do {
            System.out.println("Digite o Id do Produto:");
            produtoModel.setId(Integer.parseInt(scan.nextLine()));
            if (produtoDAO.Delete(produtoModel.getId(),"Produtos.txt") == false)
                System.out.println("Id inválido!!");
        }
        while(produtoDAO.Delete(produtoModel.getId(),"Produtos.txt") == false);

        System.out.println("Prdouto deletado com sucesso!");

        System.out.println("Deseja imprimir Deleção?");
        System.out.println("1 - Imprimir");
        System.out.println("2 - Finalizar");
        //Colocar aqui o metodo de LOG;
        int opcao = scan.nextInt();
        switch(opcao) {
            case 1:
                //Metodo de impressao
                break;
            case 2:
                EnumEstadoConsole.MENU_CADASTRO.getEstadoMaquina();
                break;
        }
        return false;

    }
}
