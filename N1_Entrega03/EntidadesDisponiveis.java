public enum EntidadesDisponiveis {
    USUARIO("usuario"),
    PEDIDO("pedido"),
    PRODUTO("produto"),
    FUNCIONARIO("funcionario"),
    GERENTE("gerente"),
    CLIENTE("cliente");

    private String descricao;

    EntidadesDisponiveis(String descricao) {
        this.descricao = descricao;
    }
}
