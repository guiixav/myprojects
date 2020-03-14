package Crud;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Metodos {


    public List<Integer> ListaUser(String arquivo) throws IOException {
        List<Integer> myList = new ArrayList<Integer>();

        try(BufferedReader br = new BufferedReader(new FileReader(arquivo))){
            String linha;

            while((linha = br.readLine()) != null){
                myList.add(Integer.parseInt(linha.split("|")[0]));
            }
        }
        return myList;
    }

    public boolean ValidaUsername(String usuario){
        if(usuario.equals("admin")){
            System.out.println("Usuario admin");
            return  true;


        }
        else
            return false;
    }

    public boolean ValidaPassword( String senha){
        if(senha.equals("admin")){
            System.out.println("Senha admin");
            return  true;
        }
        else
            return false;
    }


}
