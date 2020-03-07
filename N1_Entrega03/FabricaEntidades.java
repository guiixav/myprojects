import Models.*;

public class FabricaEntidades {
    public static EntidadeModel Fabrica(EntidadesDisponiveis enumEntidade) {
        EntidadeModel retorno;
        switch (enumEntidade)
        {
            case USUARIO:
                retorno = new Usuario();
                break;
            case PEDIDO:
                retorno = new PedidoModel();
                break;
            default:
                retorno = new EntidadeModel();
                break;
        }
        return retorno;
    }
}