package Tela.Cadastro;

import Crud.Crud;
import Tela.EnumEstadoConsole;
import Tela.MaquinaEstadoConsole;

import java.io.IOException;
import java.util.Scanner;

public class EstadoConsoleCadastraProduto extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() throws IOException {
        Crud crud = new Crud();
        Boolean sair = false;
        //FuncionarioModel funcionario = new FuncionarioModel();
        Scanner scan = new Scanner(System.in);
        System.out.println("**** CADASTRO DE PRODUTO ****");
        System.out.println("Escolha a opção desejada:");
        System.out.println("1 - Cadastrar novo Produto");
        System.out.println("2 - Atualizar Produto");
        System.out.println("3 - Deletar Produto");
        System.out.println("4 - Sair");
        int opcao = scan.nextInt();
        switch(opcao) {
            case 1:
                EnumEstadoConsole.REGISTRA_PRODUTO.getEstadoMaquina().Executa();
                break;
            case 2:
                EnumEstadoConsole.ATUALIZA_PRODUTO.getEstadoMaquina().Executa();
                break;
            case 3:
                EnumEstadoConsole.DELETA_PRODUTO.getEstadoMaquina().Executa();
                break;
            case 4:
                EnumEstadoConsole.MENU_CADASTRO.getEstadoMaquina().Executa();
                break;
        }
        return true;

    }
}
