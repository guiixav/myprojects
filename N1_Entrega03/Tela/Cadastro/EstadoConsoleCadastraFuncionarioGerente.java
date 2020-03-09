package Tela.Cadastro;

import Crud.Crud;

import java.io.IOException;
import java.util.Scanner;

public class EstadoConsoleCadastraFuncionarioGerente {

    public boolean Executa() throws IOException {
        Crud crud = new Crud();
        Boolean sair = false;
        //FuncionarioModel funcionario = new FuncionarioModel();
        Scanner scan = new Scanner(System.in);
        System.out.println("**** CADASTRO DE GERENTE ****");
        String Registro = String.valueOf(crud.ProxId("Vendedor.txt"));
        System.out.println("Digite o nome do Gerente:");
        Registro += scan.nextLine();
        //funcionario.setNome(scan.nextLine());
        System.out.println("Digite o CPF do Gerente:");
        Registro += "|" + scan.nextLine();
        //funcionario.setCPF(scan.nextLine());
        System.out.println("Digite o SALARIO do Gerente:");
        Registro += "|" + scan.nextLine();
        //funcionario.setSalario(Double.parseDouble( scan.nextLine() ));

        crud.Insert(Registro, "Gerente.txt");

        return false;
    }
}
