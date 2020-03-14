package Crud;

import Tela.Cadastro.Singleton.Config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Crud extends Metodos{

    //Lista todos os Ids
    public List<Integer> ListaIds(String arquivo) throws IOException {
        List<Integer> myList = new ArrayList<Integer>();

        try(BufferedReader br = new BufferedReader(new FileReader(arquivo))){
            String linha;

            while((linha = br.readLine()) != null){
                myList.add(Integer.parseInt(linha.split("\\|")[0]));
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

        if(!myList.contains(Integer.parseInt(registro.split("\\|")[0]))){
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

        if(myList.contains(Integer.parseInt(registro.split("\\|")[0]))){
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
            FileWriter fw = new FileWriter(arquivo);
            for(String str: linhas){
                fw.write(str + System.lineSeparator());
            }
            fw.close();
            return true;
        }
        else{
            return false;
        }
    }

    //Select
    public String Select(int Id, String arquivo){
        String registro = "";

        return registro;
    }

    //Procura User
    public String ProcuraUser(String User){
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\myprojects\\N1_Entrega03\\Arquivos\\Usuarios.txt"))){
            String linha;
            while(((linha = br.readLine()) != null)){
                String linhaUsuario = linha.split("\\|")[1];

                if(linhaUsuario.equals(User)){
                    return linha;
                }
            }
            return null;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String Imprimir(String acao, String alteracao){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String texto = "";

        switch (acao){
            case "Insert":
                texto += String.format("[%s] realizado por [%s] na data: [%s] \nValor inserido: %s", acao, String.valueOf(Config.getInstance().getUsuario()), date, alteracao);
        }

        return texto;
    }
}
