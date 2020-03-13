package Tela;

import Tela.Cadastro.Cliente.EstadoConsoleAtualizaCliente;
import Tela.Cadastro.Cliente.EstadoConsoleDeletaCliente;
import Tela.Cadastro.Cliente.EstadoConsoleRegistraCliente;
import Tela.Cadastro.EstadoConsoleCadastraCliente;
import Tela.Cadastro.EstadoConsoleCadastraFuncionario;
import Tela.Cadastro.EstadoConsoleCadastraPedido;
import Tela.Cadastro.EstadoConsoleOpcoesCadastro;
import Tela.Cadastro.Funcionario.EstadoConsoleAtualizaFuncionario;
import Tela.Cadastro.Funcionario.EstadoConsoleDeletaFuncionario;
import Tela.Cadastro.Funcionario.EstadoConsoleRegistraFuncionario;
import Tela.Cadastro.Pedido.EstadoConsoleAtualizaPedido;
import Tela.Cadastro.Pedido.EstadoConsoleDeletaPedido;
import Tela.Cadastro.Pedido.EstadoConsoleRegistraPedido;
import Tela.Cadastro.Produto.EstadoConsoleAtualizaProduto;
import Tela.Cadastro.Produto.EstadoConsoleDeletaProduto;
import Tela.Cadastro.Produto.EstadoConsoleRegistraProduto;


public enum EnumEstadoConsole {

    BEM_VINDO(new EstadoConsoleBemvindo()),

    LOGIN(new EstadoConsoleLogin()),

    MENU_CADASTRO (new EstadoConsoleOpcoesCadastro()),

    CADASTRO_FUNCIONARIO (new EstadoConsoleCadastraFuncionario()),

    CADASTRO_CLIENTE (new EstadoConsoleCadastraCliente()),

    CADASTRO_PEDIDO (new EstadoConsoleCadastraPedido()),

    CADASTRO_PRODUTO (new EstadoConsoleCadastraPedido()),

    REGISTRA_FUNCIONARIO (new EstadoConsoleRegistraFuncionario()),

    REGISTRA_CLIENTE (new EstadoConsoleRegistraCliente()),

    REGISTRA_PEDIDO (new EstadoConsoleRegistraPedido()),

    REGISTRA_PRODUTO (new EstadoConsoleRegistraProduto()),

    DELETA_FUNCIONARIO (new EstadoConsoleDeletaFuncionario()),

    DELETA_CLIENTE (new EstadoConsoleDeletaCliente()),

    DELETA_PEDIDO (new EstadoConsoleDeletaPedido()),

    DELETA_PRODUTO (new EstadoConsoleDeletaProduto()),

    ATUALIZA_FUNCIONARIO (new EstadoConsoleAtualizaFuncionario()),

    ATUALIZA_CLIENTE (new EstadoConsoleAtualizaCliente()),

    ATUALIZA_PEDIDO (new EstadoConsoleAtualizaPedido()),

    ATUALIZA_PRODUTO (new EstadoConsoleAtualizaProduto());

    private final MaquinaEstadoConsole estadoMaquina;

    EnumEstadoConsole(MaquinaEstadoConsole estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }

    public MaquinaEstadoConsole getEstadoMaquina() {
        return estadoMaquina;
    }
}