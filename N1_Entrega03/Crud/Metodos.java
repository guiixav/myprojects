package Crud;

public class Metodos {
    public void ValidaAcesso(String usuario, String senha){
        if(usuario.equals("admin") && senha.equals("admin")){
            System.out.println("É admin");
        }
    }
}
