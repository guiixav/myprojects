import Tela.Cadastro.Singleton.GerenciadorAuditoria;
import Tela.EnumEstadoConsole;
import Tela.MaquinaEstadoConsole;

import java.io.IOException;

public class Main {

    public static MaquinaEstadoConsole estadoConsole;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        Boolean saida = false;

        GerenciadorAuditoria.getInstance().ativar();
        try{
            while (!saida){
                saida = EnumEstadoConsole.BEM_VINDO.getEstadoMaquina().Executa();
            }
        } finally {
            GerenciadorAuditoria.getInstance().desativar();
        }

    }
}

