package Tela.Cadastro.Cliente;

import Crud.Crud;
import Tela.EnumEstadoConsole;
import Tela.MaquinaEstadoConsole;
import Models.ClienteModel;
import DAO.ClienteDAO;

import java.io.IOException;
import java.util.Scanner;

public class EstadoConsoleDeletaCliente extends MaquinaEstadoConsole {
    @Override
    public boolean Executa() throws IOException {

        Crud crud = new Crud();
        ClienteDAO clienteDAO = new ClienteDAO();
        ClienteModel clienteModel = new ClienteModel();
        Scanner scan = new Scanner(System.in);

        System.out.println("------DELETAR CLIENTE-------");
        do {
            System.out.println("Digite o Id do Cliente:");
            clienteModel.setId(Integer.parseInt(scan.nextLine()));
            if (clienteDAO.Delete(clienteModel.getId(),"Clientes.txt") == false)
                System.out.println("Id inválido!!");
        }
        while(clienteDAO.Delete(clienteModel.getId(),"Clientes.txt") == false);

        System.out.println("Cliente deletado com sucesso!");

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
                EnumEstadoConsole.MENU_CADASTRO.getEstadoMaquina();
                break;
        }
        return false;

    }
}
