package Tela.Cadastro.Pedido;

import Crud.Crud;
import Tela.EnumEstadoConsole;
import Tela.MaquinaEstadoConsole;

import java.io.IOException;
import java.util.Scanner;

public class EstadoConsoleRegistraPedido extends MaquinaEstadoConsole {
    @Override
    public boolean Executa() throws IOException {
        Crud crud = new Crud();
        Scanner scan = new Scanner(System.in);
        int qtdIphone;
        int qtdCelBom;
        int precoIphone = 1000;
        int precoCelBom = 500;
        int ValorTotal;
        String produto = "";
        String Registro = String.valueOf(crud.ProxId("Pedidos.txt"));
        System.out.println("------REGISTRO DE NOVOS PEDIDOS-------");
        System.out.println("Digite o ID do Cliente solicitante:");
        // scan.nextLine();

        System.out.println("Escolha os produtos abaixo:");
        int opcao1 = scan.nextInt();
        do{
            System.out.println("1 - Iphone");
            System.out.println("2 - Celular Bom");
            System.out.println("3 - Sair");

            switch(opcao1){
                case 1:
                    System.out.println("Digite a quantidade:");
                    qtdIphone = Integer.parseInt(scan.nextLine());
                    precoIphone += precoIphone*qtdIphone;
                    produto = "|" + "Iphone";

                case 2:
                    System.out.println("Digite a quantidade:");
                    qtdCelBom = Integer.parseInt(scan.nextLine());
                    precoCelBom += precoCelBom*qtdCelBom;
                    produto = "|" + "CelBom";
                case 3:
                    break;
            }}while (scan.nextLine() != "3");

        ValorTotal = precoCelBom + precoIphone;

        Registro += "|" + produto + "|" + ValorTotal;
        crud.Insert(Registro, "Pedidos.txt");
        System.out.println("Deseja imprimir novo registro?");
        System.out.println("1 - Imprimir");
        System.out.println("2 - Finalizar");
        //Colocar aqui o metodo de LOG;
        int opcao2 = scan.nextInt();
        switch(opcao2) {
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
