package Crud;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    public Boolean Insert(String registro, String arquivo) throws IOException {
        List<Integer> myList = ListaIds(arquivo);
        registro += "\n";

        if(!myList.contains(Integer.parseInt(registro.split("|")[0]))){
            Files.write(Paths.get(arquivo), registro.getBytes(), StandardOpenOption.APPEND);
            return true;
        }
        else{
            System.out.println("Registro/Id já existe!");
            return false;
        }
    }

    //Update
    public Boolean Update(String registro, String arquivo, String NovoRegistro) throws IOException {
        List<Integer> myList = ListaIds(arquivo);

        if(myList.contains(Integer.parseInt(registro.split("|")[0]))){
            File file = new File(arquivo);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(NovoRegistro);
            bw.flush();
            bw.close();
            return true;
        }
        return false;
    }

    public Object DescobreObjeto(Object obj){


        return obj;
    }

    //Delete
    public Boolean Delete(int Id, String arquivo) throws IOException {
        List<String> linhas = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                linhas.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        List<Integer> ListadeIds = ListaIds(arquivo);
        if(ListadeIds.contains(Id)){
            linhas.remove(ListadeIds.indexOf(Id));
        }

        FileWriter fw = new FileWriter(arquivo);
        for(String str: linhas){
            fw.write(str + System.lineSeparator());
        }
        fw.close();
        return true;
    }

    //Select
    public String Select(int Id, String arquivo){
        String registro = "";

        return registro;
    }

    //Procura User
    public String ProcuraUser(String User){
        try(BufferedReader br = new BufferedReader(new FileReader("Usuarios.txt"))){
            String linha;

            while(((linha = br.readLine()) != null)){
                if(linha.split("|")[1] == User){
                    return linha;
                }
            }
            return null;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            return null;
        }
    }

    public void EscreveSistemaDeControle(String texto){

    }
}
