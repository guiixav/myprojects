package Tela.Cadastro.Produto;

import DAO.ProdutoDAO;
import Tela.EnumEstadoConsole;
import Tela.MaquinaEstadoConsole;
import java.util.Scanner;
import java.io.IOException;
import Crud.Crud;
import Models.ProdutoModel;


public class EstadoConsoleRegistraProduto extends MaquinaEstadoConsole {
    @Override
    public boolean Executa() throws IOException {
        Crud crud = new Crud();
        ProdutoModel produto = new ProdutoModel();
        Scanner scan = new Scanner(System.in);
        ProdutoDAO prdDAO = new ProdutoDAO();


        System.out.println("------REGISTRO DE NOVOS PRODUTOS-------");
        System.out.println("Digite o Id do Produto:");
        produto.setIdd(scan.nextLine());
        System.out.println("Digite a descrição do produto:");
        produto.setDescricao(scan.nextLine());
        System.out.println("Digite o preço do produto:");
        produto.setPreco(Double.parseDouble(scan.nextLine()));
        prdDAO.MontaString(produto);
        System.out.println("Deseja imprimir novo registro?");
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
