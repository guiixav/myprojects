package Tela;

import java.io.IOException;
import java.util.Scanner;

public class EstadoConsoleBemvindo extends MaquinaEstadoConsole {
    public boolean Executa() throws IOException {
        boolean sair = false;
        boolean end = false;
        Scanner scan = new Scanner(System.in);
        do{
        System.out.println("Bem Vindo!");
        System.out.println("Por favor informe a opção desejada:");
        System.out.println("1 - Login");
        System.out.println("2 - Sair");

        int opcao = scan.nextInt();
        switch (opcao)
        {
            case 2:
                sair = true;
                end = true;
                break;
            case 1:
                EnumEstadoConsole.LOGIN.getEstadoMaquina().Executa();
                sair = true;
                end = true;
                break;
        }}while(end == false);
        return sair;
    }
}
