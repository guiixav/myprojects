package Tela.Cadastro.Cliente;
import DAO.ClienteDAO;
import Models.ClienteModel;
import Tela.EnumEstadoConsole;
import Tela.MaquinaEstadoConsole;
import java.util.Scanner;
import java.io.IOException;
import Crud.Crud;

public class EstadoConsoleRegistraCliente extends MaquinaEstadoConsole {
    @Override
    public boolean Executa() throws IOException {
        Crud crud = new Crud();
        ClienteModel cliente = new ClienteModel();
        Scanner scan = new Scanner(System.in);
        ClienteDAO clt = new ClienteDAO();

        System.out.println("------REGISTRO DE NOVOS CLIENTES-------");
        System.out.println("Digite o nome do Cliente:");
        cliente.setNome(scan.nextLine());

        System.out.println("Digite o CPF do Cliente:");
        cliente.setCPF(scan.nextLine());

        cliente.setId(crud.ProxId("C:\\myprojects\\N1_Entrega03\\Arquivos\\Clientes.txt"));

        System.out.println("Deseja imprimir novo registro?");
        System.out.println("1 - Imprimir");
        System.out.println("2 - Finalizar");

        int opcao = scan.nextInt();
        switch(opcao) {
            case 1:
                break;
            case 2:
                EnumEstadoConsole.MENU_CADASTRO.getEstadoMaquina().Executa();
                break;
        }
        return false;
    }
}
