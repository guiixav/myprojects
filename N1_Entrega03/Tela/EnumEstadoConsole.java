package Tela;

import Tela.Cadastro.Cliente.Atualiza.EstadoConsoleAtualizaCliente;
import Tela.Cadastro.Cliente.Deleta.EstadoConsoleDeletaCliente;
import Tela.Cadastro.Cliente.Registra.EstadoConsoleRegistraCliente;
import Tela.Cadastro.EstadoConsoleCadastraCliente;
import Tela.Cadastro.EstadoConsoleCadastraFuncionario;
import Tela.Cadastro.EstadoConsoleCadastraPedido;
import Tela.Cadastro.EstadoConsoleOpcoesCadastro;
import Tela.Cadastro.Funcionario.Atualiza.EstadoConsoleAtualizaFuncionario;
import Tela.Cadastro.Funcionario.Deleta.EstadoConsoleDeletaFuncionario;
import Tela.Cadastro.Funcionario.Registra.EstadoConsoleRegistraFuncionario;
import Tela.Cadastro.Pedido.Atualiza.EstadoConsoleAtualizaPedido;
import Tela.Cadastro.Pedido.Deleta.EstadoConsoleDeletaPedido;
import Tela.Cadastro.Pedido.Registra.EstadoConsoleRegistraPedido;



public enum EnumEstadoConsole {

    BEM_VINDO(new EstadoConsoleBemvindo()),

    LOGIN(new EstadoConsoleLogin()),

    MENU_CADASTRO (new EstadoConsoleOpcoesCadastro()),

    CADASTRO_FUNCIONARIO (new EstadoConsoleCadastraFuncionario()),

    CADASTRO_CLIENTE (new EstadoConsoleCadastraCliente()),

    CADASTRO_PEDIDO (new EstadoConsoleCadastraPedido()),

    REGISTRA_FUNCIONARIO (new EstadoConsoleRegistraFuncionario()),

    REGISTRA_CLIENTE (new EstadoConsoleRegistraCliente()),

    REGISTRA_PEDIDO (new EstadoConsoleRegistraPedido()),

    DELETA_FUNCIONARIO (new EstadoConsoleDeletaFuncionario()),

    DELETA_CLIENTE (new EstadoConsoleDeletaCliente()),

    DELETA_PEDIDO (new EstadoConsoleDeletaPedido()),

    ATUALIZA_FUNCIONARIO (new EstadoConsoleAtualizaFuncionario()),

    ATUALIZA_CLIENTE (new EstadoConsoleAtualizaCliente()),

    ATUALIZA_PEDIDO (new EstadoConsoleAtualizaPedido());

    private final MaquinaEstadoConsole estadoMaquina;

    EnumEstadoConsole(MaquinaEstadoConsole estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }

    public MaquinaEstadoConsole getEstadoMaquina() {
        return estadoMaquina;
    }
}