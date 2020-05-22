package Tela.Cadastro;

import Crud.Crud;
import Tela.EnumEstadoConsole;
import Tela.MaquinaEstadoConsole;

import java.io.IOException;
import java.util.Scanner;

public class EstadoConsoleCadastraFuncionario extends MaquinaEstadoConsole {

    public boolean Executa() throws IOException {
        Crud crud = new Crud();
        Boolean sair = false;
        //FuncionarioModel funcionario = new FuncionarioModel();
        Scanner scan = new Scanner(System.in);
        System.out.println("**** CADASTRO DE FUNCIONARIO ****");
        System.out.println("Escolha a opção desejada:");
        System.out.println("1 - Cadastrar novo Funcionario");
        System.out.println("2 - Atualizar os dados de um Funcionario");
        System.out.println("3 - Deletar o registro de um Funcionario");
        int opcao = scan.nextInt();
        switch(opcao) {
            case 1:
                EnumEstadoConsole.REGISTRA_FUNCIONARIO.getEstadoMaquina().Executa();
                break;
            case 2:
                EnumEstadoConsole.ATUALIZA_FUNCIONARIO.getEstadoMaquina().Executa();
                break;
            case 3:
                EnumEstadoConsole.DELETA_FUNCIONARIO.getEstadoMaquina().Executa();
                break;
        }
        /*String Registro = String.valueOf(crud.ProxId("C:\\myprojects\\N1_Entrega03\\Arquivos\\Funcionarios.txt"));
        System.out.println("Digite o nome do Gerente:");
        Registro += scan.nextLine();
        System.out.println("Digite o CPF do Gerente:");
        Registro += "|" + scan.nextLine();
        System.out.println("Digite o SALARIO do Gerente:");
        Registro += "|" + scan.nextLine();

        crud.Insert(Registro, "C:\\myprojects\\N1_Entrega03\\Arquivos\\Gerentes.txt");*/

        return true;
    }
}
