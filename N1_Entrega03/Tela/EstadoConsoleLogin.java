package Tela;

//Alterar o metodo de validação de usuario e senha para chamar os nossos metodos.

import java.util.Scanner;

import Models.FuncionarioModel;
import Crud.Metodos;

public class EstadoConsoleLogin extends MaquinaEstadoConsole {

    public boolean Executa() {
        boolean sair = false;
        FuncionarioModel user = new FuncionarioModel();
        Scanner scan = new Scanner(System.in);
        System.out.println("**** LOGIN ****");
        System.out.println("Digite seu usuário");
        user.setUsername(scan.nextLine());
        System.out.println("Digite sua senha");
        user.setPassword(scan.nextLine());
        Metodos acesso = new Metodos();
        boolean ValidaPassword = acesso.ValidaPassword(user.getPassword());
        boolean ValidaUsername = acesso.ValidaUsername(user.getUsername());
        if (ValidaPassword && ValidaUsername)
            EnumEstadoConsole.MENU_CADASTRO.getEstadoMaquina();
        else {
            System.out.println("Dados inválidos!");
        }
        return sair;
    }
}
