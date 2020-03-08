package Tela.Cadastro;

import Crud.Crud;
import Tela.MaquinaEstadoConsole;

import java.io.IOException;
import java.util.Scanner;

public class EstadoConsoleCadastraPedido extends MaquinaEstadoConsole {
    @Override

        public boolean Executa() throws IOException {
            Crud crud = new Crud();
            Boolean sair = false;
            //FuncionarioModel funcionario = new FuncionarioModel();
            Scanner scan = new Scanner(System.in);
            System.out.println("**** CADASTRO DE PEDIDO ****");
            String Registro = String.valueOf(crud.ProxId("Pedido.txt"));
            System.out.println("Digite o nome do Cliente:");
            Registro += scan.nextLine();
            //funcionario.setNome(scan.nextLine());
            System.out.println("Digite os nomes dos Produtos:");
            Registro += "|" + scan.nextLine();
        System.out.println("Deseja adicionar outro pedido?");
        System.out.println("1 - Adicionar outro pedido.");
        System.out.println("2 - Avançar para finalização do pedido.");
        switch(opcoes)
        {
            case 1:

            case 2:

        }


            crud.Insert(Registro, "Pedido.txt");

            return false;
    }
}
