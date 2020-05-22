package Tela;

import java.io.IOException;
import java.util.Scanner;

public class EstadoConsoleBemvindo extends MaquinaEstadoConsole {
    public boolean Executa() throws IOException {
        boolean sair = false;
        System.out.println("Bem Vindo!");
        System.out.println("Por favor informe a opção desejada:");
        System.out.println("1 - Login");
        System.out.println("2 - Sair");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        switch (opcao)
        {
            case 2:
                sair = true;
                break;
            case 1:
                EnumEstadoConsole.LOGIN.getEstadoMaquina().Executa();
                sair = true;
                break;
        }
        return sair;
    }
}
