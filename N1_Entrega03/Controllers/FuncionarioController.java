package Controllers;

import Models.GerenteModel;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FuncionarioController {
    public void SalvaCliente() throws IOException {
        GerenteModel gerente = new GerenteModel();
        gerente.setTipoFuncionario(1);
        gerente.setId(4);
        gerente.setNome("Douglas");
        gerente.setCPF("456.456.456-04");
        gerente.setSalario(2);

        File file = new File("Arquivos/Gerente.txt");

        String ParsedClass = String.format("\n%s|%s|%s|%s|%s", String.valueOf(gerente.getId()),
                String.valueOf(gerente.getTipoFucionario()), gerente.getNome(), gerente.getCPF(),gerente.getSalario());

        FileWriter fw = new FileWriter("Arquivos/Gerente.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw);
        out.println(ParsedClass);

        Files.write(Paths.get(String.valueOf(file)), ParsedClass.getBytes(), StandardOpenOption.APPEND);
    }
}
