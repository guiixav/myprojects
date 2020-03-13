package Tela.Cadastro;

import Crud.Crud;
import Tela.EnumEstadoConsole;
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
            System.out.println("Escolha a opção desejada:");
            System.out.println("1 - Cadastrar novo Pedido");
            System.out.println("2 - Atualizar os dados de um Pedido");
            System.out.println("3 - Deletar o registro de um Pedido");
            int opcao = scan.nextInt();
            switch(opcao) {
                case 1:
                    EnumEstadoConsole.REGISTRA_PEDIDO.getEstadoMaquina();
                case 2:
                    EnumEstadoConsole.ATUALIZA_PEDIDO.getEstadoMaquina();
                case 3:
                    EnumEstadoConsole.DELETA_PEDIDO.getEstadoMaquina();
        }
















        String Registro = String.valueOf(crud.ProxId("Pedido.txt"));
        System.out.println("Digite o nome do Cliente:");
        Registro += scan.nextLine();
        //funcionario.setNome(scan.nextLine());
        System.out.println("Digite os nomes dos Produtos:");
        Registro += "|" + scan.nextLine();
        System.out.println("Deseja adicionar outro pedido?");
        System.out.println("1 - Adicionar outro pedido.");
        System.out.println("2 - Avançar para finalização do pedido.");
        crud.Insert(Registro, "Pedido.txt");

        return false;

    }









}










