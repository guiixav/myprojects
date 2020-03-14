package Tela.Cadastro.Funcionario;

import Crud.Crud;
import DAO.FuncionarioDAO;
import Models.FuncionarioModel;
import Tela.EnumEstadoConsole;
import Tela.MaquinaEstadoConsole;

import java.io.IOException;
import java.util.Scanner;

public class EstadoConsoleDeletaFuncionario extends MaquinaEstadoConsole {
    @Override
    public boolean Executa() throws IOException {
        Crud crud = new Crud();
        FuncionarioDAO funcDAO = new FuncionarioDAO();
        FuncionarioModel funcModel = new FuncionarioModel();
        Scanner scan = new Scanner(System.in);
        String arquivo = "C:\\myprojects\\N1_Entrega03\\Arquivos\\Funcionarios.txt";

        System.out.println("------DELETAR FUNCIONARIO-------");
        do {
            System.out.println("Digite o Id do Funcionario:");
            funcModel.setId(Integer.parseInt(scan.nextLine()));
            if (funcDAO.Delete(funcModel.getId(),arquivo) == false)
                System.out.println("Id inválido!!");
        }
        while(funcDAO.Delete(funcModel.getId(),arquivo) == false);

        System.out.println("Funcionario deletado com sucesso!");

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
                EnumEstadoConsole.MENU_CADASTRO.getEstadoMaquina().Executa();
                break;
        }
        return false;
    }
}
