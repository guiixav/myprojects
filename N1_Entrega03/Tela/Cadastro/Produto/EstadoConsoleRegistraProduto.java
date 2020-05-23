package Tela.Cadastro.Produto;

import Crud.Crud;
import DAO.ProdutoDAO;
import Models.ProdutoModel;
import Tela.EnumEstadoConsole;
import Tela.MaquinaEstadoConsole;

import java.io.IOException;
import java.util.Scanner;


public class EstadoConsoleRegistraProduto extends MaquinaEstadoConsole {
    @Override
    public boolean Executa() throws IOException {
        Crud crud = new Crud();
        ProdutoModel produto = new ProdutoModel();
        Scanner scan = new Scanner(System.in);
        ProdutoDAO prdDAO = new ProdutoDAO();
        boolean sair = false;

        System.out.println("------REGISTRO DE NOVOS PRODUTOS-------");
        System.out.println("Digite a descrição do produto:");
        produto.setDescricao(scan.nextLine());
        System.out.println("Digite o preço do produto:");
        produto.setPreco(Double.parseDouble(scan.nextLine()));
do{
        System.out.println("Deseja imprimir novo registro?");
        System.out.println("1 - Imprimir");
        System.out.println("2 - Finalizar");
        //Colocar aqui o metodo de LOG;
        int opcao = scan.nextInt();
        switch(opcao) {
            case 1:
                prdDAO.MontaString(produto, "Insert");
                sair = true;
                break;
            case 2:
                EnumEstadoConsole.MENU_CADASTRO.getEstadoMaquina().Executa();
                sair = true;
                break;
        }}while(sair == false);
        return true;
    }
}
