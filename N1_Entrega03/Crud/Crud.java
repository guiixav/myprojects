package Crud;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Crud extends Metodos{

    //Lista todos os Ids
    public List<Integer> ListaIds(String arquivo) throws IOException {
        List<Integer> myList = new ArrayList<Integer>();

        try(BufferedReader br = new BufferedReader(new FileReader(arquivo))){
            String linha;

            while((linha = br.readLine()) != null){
                myList.add(Integer.parseInt(linha.split("|")[0]));
            }
        }
        return myList;
    }

    //Próximo Id
    public int ProxId(String arquivo) throws IOException {
        return Collections.max(ListaIds(arquivo)) + 1;
    }

    //Insert
    public void Insert(String registro, String arquivo) throws IOException {
        List<Integer> myList = ListaIds(arquivo);

        if(!myList.contains(Integer.parseInt(registro.split("|")[0]))){
            Files.write(Paths.get(arquivo), registro.getBytes(), StandardOpenOption.APPEND);
        }
        else{
            System.out.println("Registro já existe!");
        }
    }

    //Update
    public void Update(String registro, String arquivo, String NovoRegistro) throws IOException {
        List<Integer> myList = ListaIds(arquivo);

        if(myList.contains(Integer.parseInt(registro.split("|")[0]))){
            File file = new File(arquivo);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Some text here for a reason");
            bw.flush();
            bw.close();
        }
    }

    //Delete
    public void Delete(int Id){

    }

    //Select
    public void Select(int Id){

    }

    public void EscreveSistemaDeControle(String texto){

    }
}
