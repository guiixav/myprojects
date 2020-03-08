package Tela.Cadastro;

import Crud.Crud;
import Models.ClienteModel;
import Models.FuncionarioModel;
import Tela.MaquinaEstadoConsole;


import java.io.IOException;
import java.util.Scanner;

public class EstadoConsoleCadastraFuncionarioVendedor extends MaquinaEstadoConsole {
    @Override
    public boolean Executa() throws IOException {
        Crud crud = new Crud();
        Boolean sair = false;
        //FuncionarioModel funcionario = new FuncionarioModel();
        Scanner scan = new Scanner(System.in);
        System.out.println("**** CADASTRO DE FUNCIONARIO ****");
        String Registro = String.valueOf(crud.ProxId("Gerente.txt"));
        System.out.println("Digite o nome do Funcionario:");
         Registro += scan.nextLine();
        //funcionario.setNome(scan.nextLine());
        System.out.println("Digite o CPF do funcionario:");
        Registro += "|" + scan.nextLine();
        //funcionario.setCPF(scan.nextLine());
        System.out.println("Digite o SALARIO do funcionario:");
        Registro += "|" + scan.nextLine();
        //funcionario.setSalario(Double.parseDouble( scan.nextLine() ));

        crud.Insert(Registro, "Funcionario.txt");

        return false;
    }


}
