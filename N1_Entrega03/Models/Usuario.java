package Models;

public class Usuario extends EntidadeModel {
    // Variáveis
    private String Username;
    private String Password;
    private String TipoUsuario;

    //Construtores
    public Usuario(){

    }

    public Usuario(String Username, String Password){
        this.Username = Username;
        this.Password = Password;
    }

    // Getters
    public String getUsername() {
        return this.Username;
    }

    public String getTipoUsuario(){ return this.TipoUsuario; }

    public String getPassword() {
        return this.Password;
    }

    // Setters
    public void setUsername(String Username) {
        if (Username.length() > 0) {
            this.Username = Username;
        }
    }

    public void setPassword(String Password) {
        if (Password.length() > 0) {
            this.Password = Password;
        }
    }

    public void setTipoUsuario(String TipoUsuario){
        this.TipoUsuario = TipoUsuario;
    }
}