package Tela.Cadastro.Pedido;

import Crud.Crud;
import DAO.PedidoDAO;
import Models.ClienteModel;
import Models.PedidoModel;
import Models.ProdutoModel;
import Tela.EnumEstadoConsole;
import Tela.MaquinaEstadoConsole;

import java.io.IOException;
import java.util.Scanner;
public class EstadoConsoleRegistraPedido extends MaquinaEstadoConsole {
    @Override
    public boolean Executa() throws IOException {
        Crud crud = new Crud();
        Scanner scan = new Scanner(System.in);
        ClienteModel cliete = new ClienteModel();
        PedidoModel pedido = new PedidoModel();
        PedidoDAO pedidoDAO = new PedidoDAO();
        ProdutoModel prod = new ProdutoModel();

        String produto = "";
        String Registro = String.valueOf(crud.ProxId("Pedidos.txt"));
        System.out.println("------REGISTRO DE NOVOS PEDIDOS-------");


        do {
            System.out.println("Digite o ID do Cliente solicitante:");
            pedido.setClienteId(scan.nextLine());
            if (crud.ListaIds("Clientes.txt").contains(pedido.getId()))
                break;
            else {
                System.out.println("Cliente Não existe!!!");
            }
        } while (!crud.ListaIds("Clientes.txt").contains(pedido.getId()));



        do {
            System.out.println("Digite o ID do Produto:");
            prod.setId(Integer.parseInt(scan.nextLine()));
            if (crud.ListaIds("Produtos.txt").contains(prod.getId()))
                break;
            else {
                System.out.println("Produto Não existe!!!");
            }
        } while (!crud.ListaIds("Produtos.txt").contains(prod.getId()));


        System.out.println("Informe a quantidade de produtos:");
        int qtd = Integer.parseInt(scan.nextLine());

        double Valortotal = prod.getPreco() * qtd;

        pedido.setValorTotal(Valortotal);

        pedidoDAO.MontaString(pedido);
        //Colocar aqui o metodo de LOG;
        int opcao2 = scan.nextInt();
        System.out.println("Deseja imprimir o novo pedido?");
        System.out.println("1 - Imprimir");
        System.out.println("2 - Finalizar");
        switch (opcao2) {
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






























