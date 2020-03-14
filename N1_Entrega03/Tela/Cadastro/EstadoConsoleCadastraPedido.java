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
                System.out.println("2 - Voltar");
                int opcao = scan.nextInt();
                switch(opcao) {
                    case 1:
                        EnumEstadoConsole.REGISTRA_PEDIDO.getEstadoMaquina();
                    case 2:
                        EnumEstadoConsole.MENU_CADASTRO.getEstadoMaquina();


                }
                return false;

            }

        }
























