import Controllers.FuncionarioController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        serializeGerente();
    }

    private static void serializeGerente() throws IOException {
        FuncionarioController func = new FuncionarioController();
        func.SalvaCliente();

    }
}