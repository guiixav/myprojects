package Tela.Cadastro.Singleton;

import Models.Usuario;

public class Config {
    private static Config uniqueInstance;

    private Config() {
    }

    public static synchronized Config getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new Config();

        return  uniqueInstance;
    }

    private Usuario usuario;

    public Usuario getUsuario(){ return  usuario; }

    public  void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}
