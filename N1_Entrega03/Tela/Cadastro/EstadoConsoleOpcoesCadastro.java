package Tela.Cadastro;

import Tela.EnumEstadoConsole;
import Tela.MaquinaEstadoConsole;

import java.util.Scanner;


public class EstadoConsoleOpcoesCadastro extends MaquinaEstadoConsole {


    @Override
    public boolean Executa() {

        boolean sair = false;
        System.out.println("Bem Vindo!");
        System.out.println("Escolha uma das opções abaixo para cadastro:");
        System.out.println("1 - Cadastro de funcionário");
        System.out.println("2 - Cadastro de Cliente");
        System.out.println("3 - Cadastro de pedidos");
        System.out.println("4 - Cadastro de produto");
        System.out.println("0 - Sair");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        switch(opcao)
        {
            case 1:
                EnumEstadoConsole.CADASTRO_FUNCIONARIO.getEstadoMaquina();
                break;
            case 2:
                EnumEstadoConsole.CADASTRO_CLIENTE.getEstadoMaquina();
                break;
            case 3:
                EnumEstadoConsole.CADASTRO_PEDIDO.getEstadoMaquina();
                break;
            case 4:
                EnumEstadoConsole.CADASTRO_PRODUTO.getEstadoMaquina();
                break;
            case 0:
                EnumEstadoConsole.BEM_VINDO.getEstadoMaquina();
                break;
        }
        return false;
    }

}
