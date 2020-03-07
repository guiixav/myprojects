package Crud;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Crud extends Metodos{

    public void ArmazenaEmTxt(String Nome, String CPF, double Salario) throws IOException {
        //Armazenando TXT region
        String arquivo = "Arquivos/Gerente.txt";
        File file = new File(arquivo);
        String ParsedClass = String.format("\n%s|%s|%s|%s", String.valueOf(ProxId()),
                Nome, CPF, Salario);

        FileWriter fw = new FileWriter("Arquivos/Gerente.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw);
        System.out.println(ParsedClass);
        Files.write(Paths.get(String.valueOf(file)), ParsedClass.getBytes(), StandardOpenOption.APPEND);
        //Armazenamento em arquivo .txt endregion
    }

    //Próximo Id
    public int ProxId() throws IOException {
        String arquivo = "Arquivos/Gerente.txt";
        List<Integer> myList = new ArrayList<Integer>();

        try(BufferedReader br = new BufferedReader(new FileReader(arquivo))){
            String linha;

            while((linha = br.readLine()) != null){
                myList.add(Integer.parseInt(linha.split("|")[0]));
            }
        }
        return Collections.max(myList) + 1;
    }

    //Obj Java para JSON
    public String JavaObjToJson(Object object){
        Gson gson = new Gson();
        return gson.toJson(object);
    }

    //Lê arquivo JSON para Java
    public Object LerArquivo(String arquivo, Object Entidade) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(arquivo));
        Gson gson = new Gson();
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()){
            sb.append(sc.next());
        }
        sc.close();
        return gson.fromJson(sb.toString(), Entidade.getClass());
    }

    //Insert
    public void Insert(String json){
        JsonObject objeto = new JsonObject();
        if(objeto.has(json)){

        }
    }

    //Update
    public void Update(String json, int Id){

    }

    //Delete
    public void Delete(int Id){

    }

    //Select
    public void Select(int Id){

    }
}
