package Controllers;

import Crud.Metodos;
import Models.GerenteModel;

//import com.google.gson.*;
//
//import javax.swing.*;
import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.Scanner;

public class FuncionarioController extends Metodos {
    public void SalvaCliente() throws IOException {
        GerenteModel gerente = new GerenteModel();
        gerente.setId(4);
        gerente.setNome("Douglas");
        gerente.setCPF("456.456.456-04");
        gerente.setSalario(2);

        String arquivo_json = "Arquivos/Gerente.json";

        //Armazenando TXT region
//        String arquivo = "Arquivos/Gerente.txt";
//        File file = new File(arquivo);
//        String ParsedClass = String.format("\n%s|%s|%s|%s", String.valueOf(gerente.getId()),
//                gerente.getNome(), gerente.getCPF(),gerente.getSalario());
//
//        FileWriter fw = new FileWriter("Arquivos/Gerente.txt", true);
//        BufferedWriter bw = new BufferedWriter(fw);
//        PrintWriter out = new PrintWriter(bw);
//        out.println(ParsedClass);
//        Files.write(Paths.get(String.valueOf(file)), ParsedClass.getBytes(), StandardOpenOption.APPEND);
        //Armazenamento em arquivo .txt endregion
    }
}
