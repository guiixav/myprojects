package Tela;

public enum EnumEstadoConsole {

    BEM_VINDO(new EstadoConsoleBemvindo()),

    LOGIN(new EstadoConsoleLogin()),

    MENU_CADASTRO (new EstadoConsoleOpcoesCadastro()),

    CADASTRA_FUNCIONARIO (new EstadoConsoleCadastraFuncionario()),

    CADASTRA_CLIENTE (new EstadoConsoleCadastraCliente()),

    CADASTRA_PEDIDO (new EstadoConsoleCadastraPedido());

    private final MaquinaEstadoConsole estadoMaquina;

    EnumEstadoConsole(MaquinaEstadoConsole estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }

    public MaquinaEstadoConsole getEstadoMaquina() {
        return estadoMaquina;
    }
}