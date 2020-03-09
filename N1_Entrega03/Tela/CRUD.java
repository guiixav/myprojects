package Tela;

import java.io.IOException;

public class CRUD {

        public static MaquinaEstadoConsole estadoConsole;
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) throws IOException {
            estadoConsole = EnumEstadoConsole.CADASTRA_CLIENTE.getEstadoMaquina();;
            Boolean saida = false;
            while (!saida){
                saida = estadoConsole.Executa();
            }
        }
    }

