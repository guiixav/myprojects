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
        String ArquivoPedidos = "C:\\myprojects\\N1_Entrega03\\Arquivos\\Pedidos.txt";
        String ArquivoProdutos = "C:\\myprojects\\N1_Entrega03\\Arquivos\\Produtos.txt";
        String ArquivoClientes = "C:\\myprojects\\N1_Entrega03\\Arquivos\\Clientes.txt";
        boolean sair = false;

        String produto = "";
        String Registro = String.valueOf(crud.ProxId(ArquivoPedidos));
        System.out.println("------REGISTRO DE NOVOS PEDIDOS-------");


        do {
            System.out.println("Digite o ID do Cliente solicitante:");
            pedido.setClienteId(Integer.parseInt(scan.nextLine()));
            if (crud.ListaIds(ArquivoClientes).contains(pedido.getClienteId()))
                break;
            else {
                System.out.println("Cliente Não existe!!!");
            }
        } while (!crud.ListaIds(ArquivoClientes).contains(pedido.getClienteId()));


        int ProdutoId;
        do {
            System.out.println("Digite o ID do Produto:");
            ProdutoId = Integer.parseInt(scan.nextLine());

            if (crud.ListaIds(ArquivoProdutos).contains(ProdutoId)) {
                pedido.setProdutoId(ProdutoId);
            } else {
                System.out.println("Produto Não existe!!!");
            }
        } while (!crud.ListaIds(ArquivoProdutos).contains(ProdutoId));


        System.out.println("Informe a quantidade de produtos:");
        int qtd = Integer.parseInt(scan.nextLine());

        double Valortotal = prod.getPreco() * qtd;

        pedido.setValorTotal(Valortotal);
do{
        System.out.println("Deseja imprimir o novo pedido?");
        System.out.println("1 - Imprimir");
        System.out.println("2 - Finalizar");
        int opcao2 = scan.nextInt();

        switch (opcao2) {
            case 1:
                pedidoDAO.MontaString(pedido, "Insert");
                EnumEstadoConsole.MENU_CADASTRO.getEstadoMaquina().Executa();
                sair =true;
                break;
            case 2:
                EnumEstadoConsole.MENU_CADASTRO.getEstadoMaquina().Executa();
                sair =true;
                break;
        }}while(sair==false);
        return true;
    }
}






























