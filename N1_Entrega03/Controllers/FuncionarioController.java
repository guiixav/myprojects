package Controllers;

import Crud.Metodos;
import Models.GerenteModel;
import java.io.*;

public class FuncionarioController extends Metodos {
    public void SalvaCliente() throws IOException {
        GerenteModel gerente = new GerenteModel();
        gerente.setId(4);
        gerente.setNome("Douglas");
        gerente.setCPF("456.456.456-04");
        gerente.setSalario(2);

        String arquivo_json = "Arquivos/Gerente.json";
    }
}
