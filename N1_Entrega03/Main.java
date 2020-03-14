import Tela.EnumEstadoConsole;
import Tela.MaquinaEstadoConsole;

import java.io.IOException;

public class Main {

    public static MaquinaEstadoConsole estadoConsole;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Boolean saida = false;
        while (!saida){
            saida = EnumEstadoConsole.BEM_VINDO.getEstadoMaquina().Executa();
        }
    }
}

