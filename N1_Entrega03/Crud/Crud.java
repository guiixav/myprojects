package Crud;

import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Crud extends Metodos{

    //Armazenando TXT
    public void ArmazenaEmTxt(String Nome, String CPF, double Salario, String arquivo) throws IOException {
        File file = new File(arquivo);
        String ParsedClass = String.format("\n%s|%s|%s|%s", String.valueOf(ProxId(arquivo)),
                Nome, CPF, Salario);

//        FileWriter fw = new FileWriter("Arquivos/Gerente.txt", true);
//        BufferedWriter bw = new BufferedWriter(fw);
//        PrintWriter out = new PrintWriter(bw);
//        System.out.println(ParsedClass);

        Files.write(Paths.get(String.valueOf(file)), ParsedClass.getBytes(), StandardOpenOption.APPEND);
    }

    //Próximo Id
    public int ProxId(String arquivo) throws IOException {
        return Collections.max(ListaIds(arquivo)) + 1;
    }

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
    public void Update(int Id, String arquivo){

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
