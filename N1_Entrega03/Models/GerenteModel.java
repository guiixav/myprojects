package Models;

public class GerenteModel extends FuncionarioModel {
    private int TipoFuncionario;

    // Contrutores
    public GerenteModel() {

    }

    public GerenteModel(int TipoFuncionario) {
        this.TipoFuncionario = TipoFuncionario;
    }

    //get set
    public int getTipoFucionario() {
        return this.TipoFuncionario;
    }

    public void setTipoFuncionario(int TipoFuncionario) {
        if (TipoFuncionario == 0) {
            this.TipoFuncionario = TipoFuncionario;
        } else {
            this.TipoFuncionario = 1;
        }
    }
}