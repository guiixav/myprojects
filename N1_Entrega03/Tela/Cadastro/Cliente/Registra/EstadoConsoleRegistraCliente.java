package Tela.Cadastro.Cliente.Registra;
import Tela.EnumEstadoConsole;
import Tela.MaquinaEstadoConsole;
import java.util.Scanner;
import java.io.IOException;
import Crud.Crud;

public class EstadoConsoleRegistraCliente extends MaquinaEstadoConsole {
    @Override
    public boolean Executa() throws IOException {
        Crud crud = new Crud();
        Scanner scan = new Scanner(System.in);
        String Registro = String.valueOf(crud.ProxId("Cliente.txt"));
        System.out.println("------REGISTRO DE NOVOS CLIENTES-------");
        System.out.println("Digite o nome do Cliente:");
        Registro += "|" + scan.nextLine();
        //funcionario.setNome(scan.nextLine());
        System.out.println("Digite o CPF do Cliente:");
        Registro += "|" + scan.nextLine();
        crud.Insert(Registro, "Cliente.txt");
        System.out.println("Deseja imprimir novo registro?");
        System.out.println("1 - Imprimir");
        System.out.println("2 - Finalizar");
        //Colocar aqui o metodo de LOG;
        int opcao = scan.nextInt();
        switch(opcao) {
            case 1:
                //Metodo de impressao
                break;
            case 2:
                EnumEstadoConsole.MENU_CADASTRO.getEstadoMaquina();
                break;
        }
        return false;
    }
}
