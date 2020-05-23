package Tela.Cadastro;

import Tela.Cadastro.Singleton.Config;
import Tela.EnumEstadoConsole;
import Tela.MaquinaEstadoConsole;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class EstadoConsoleOpcoesCadastro extends MaquinaEstadoConsole {


    @Override
    public boolean Executa() throws IOException {

        boolean sair = false;

        List<Integer> cases = Arrays.asList(0, 1, 2, 3, 4);
        Scanner scan = new Scanner(System.in);
        do{
        System.out.println("Escolha uma das opções abaixo para cadastro:");
        System.out.println("1 - Cadastro de funcionário");
        System.out.println("2 - Cadastro de Cliente");
        System.out.println("3 - Cadastro de pedidos");
        System.out.println("4 - Cadastro de produto");
        System.out.println("0 - Sair");


        int opcao = scan.nextInt();
        switch(opcao)
        {
            case 1:
                if(Config.getInstance().getUsuario().getTipoUsuario() == 1){
                    EnumEstadoConsole.CADASTRO_FUNCIONARIO.getEstadoMaquina().Executa();
                }
                else{
                    System.out.println("Perfil logado não é de Gerente");
                }
                sair = true;
                break;
            case 2:
                EnumEstadoConsole.CADASTRO_CLIENTE.getEstadoMaquina().Executa();
                sair = true;
                break;
            case 3:
                EnumEstadoConsole.CADASTRO_PEDIDO.getEstadoMaquina().Executa();
                sair = true;
                break;
            case 4:
                EnumEstadoConsole.CADASTRO_PRODUTO.getEstadoMaquina().Executa();
                sair = true;
                break;
            case 0:
                EnumEstadoConsole.BEM_VINDO.getEstadoMaquina().Executa();
                sair = true;
                break;
        }}while(sair == false);
        return true;
    }
}
