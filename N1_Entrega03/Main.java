import Tela.EnumEstadoConsole;
import Tela.MaquinaEstadoConsole;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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

//    public static void Testa(){
//        String texto = "oi|a|bc";
//        List<String> linhas = Arrays.asList(texto.split("\\|"));
//        System.out.println(linhas);
//    }
}

