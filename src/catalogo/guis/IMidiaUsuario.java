package catalogo.guis;

public interface IMidiaUsuario {

    /**
     * Metodo para cadastrar alguma midia
     */
    public abstract void cadastro();

    /**
     * Metodo para excluir alguma midia
     */
    public abstract void exclusao();

    /**
     * metodo para consultar alguma midia
     */
    public abstract void consulta();

    /**
     * metodo para exibir todas as midias
     */
    public abstract void exibirDadosTodasMidias();

    /**
     * metodo para editar alguma midia
     */
    public abstract void editar();

    /**
     * metodo para ordenar as midias
     */
    public abstract void ordenar();

    /**
     * metodo para salvar as midias
     */
    public abstract void salvar();

    /**
     * metodo para carregar as midias
     */
    public abstract void carregar();

}
