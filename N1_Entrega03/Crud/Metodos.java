package Crud;

public class Metodos {
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
