package Tela.Cadastro.Produto;

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
        String Registro = String.valueOf(crud.ProxId("Produto.txt"));
        System.out.println("------REGISTRO DE NOVOS PRODUTOS-------");
        System.out.println("Digite o nome do Novo Produto:");
        produto.setNome(scan.nextLine());
        System.out.println("Digite a descrição do produto:");
        produto.setDescricao(scan.nextLine());
        System.out.println("Digite o preço do produto:");
        produto.setPreco(Double.parseDouble(scan.nextLine()));


        return false;
    }
}
