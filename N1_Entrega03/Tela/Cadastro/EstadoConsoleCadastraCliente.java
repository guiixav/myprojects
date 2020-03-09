package Tela.Cadastro;

import Models.ClienteModel;

import java.io.IOException;
import java.util.Scanner;
import Crud.Crud;
import Tela.MaquinaEstadoConsole;

public class EstadoConsoleCadastraCliente extends MaquinaEstadoConsole {
    @Override
    public boolean Executa() throws IOException {
        Crud crud = new Crud();
        Boolean sair = false;
        //FuncionarioModel funcionario = new FuncionarioModel();
        Scanner scan = new Scanner(System.in);
        System.out.println("**** CADASTRO DE CLIENTE ****");
        String Registro = String.valueOf(crud.ProxId("Cliente.txt"));
        System.out.println("Digite o nome do Cliente:");
        Registro += scan.nextLine();
        //funcionario.setNome(scan.nextLine());
        System.out.println("Digite o CPF do Cliente:");
        Registro += "|" + scan.nextLine();
        //funcionario.setCPF(scan.nextLine());
        //funcionario.setSalario(Double.parseDouble( scan.nextLine() ));

        crud.Insert(Registro, "Cliente.txt");

        return false;
    }
}
