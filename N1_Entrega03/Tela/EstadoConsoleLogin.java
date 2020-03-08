package Tela;

//Alterar o metodo de validação de usuario e senha para chamar os nossos metodos.

import java.util.Scanner;
import Models.Usuario;
import Crud.Metodos;

public class EstadoConsoleLogin extends MaquinaEstadoConsole {

    public boolean Executa() {
        boolean sair = false;
        Usuario user = new Usuario();
        Scanner scan = new Scanner(System.in);
        System.out.println("**** LOGIN ****");
        System.out.println("Digite seu usuário");
        user.setUsername(scan.nextLine());
        System.out.println("Digite sua senha");
        user.setPassword(   scan.nextLine());
        Metodos acesso = new Metodos();
        boolean ValidaPassword = acesso.ValidaPassword(user.getPassword());
        if (ValidaPassword)
            EnumEstadoConsole.MENU_CADASTRO.getEstadoMaquina();
        else {
            System.out.println("Dados inválidos!");
        }
        return sair;
    }
}
