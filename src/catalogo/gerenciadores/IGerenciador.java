/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo.gerenciadores;

import catalogo.midias.Midia;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author mathias
 */
public interface IGerenciador {

    /**
     * Cadastrar as midias que o usuário informa na interface ou console.
     *
     * @param midia Contém todas as informações passadas pelo usuário e essa
     * mídia será inserida na coleção.
     * @return true se conseguir cadastrar uma mídia.
     */
    public boolean cadastrar(Midia midia);

    /**
     * removerá alguma midia escolhida pelo usuário, que estiver na coleção
     *
     * @param path caminho do arquivo que tem a midia a ser removida.
     * @return
     */
    public boolean remover(String path);

    /**
     * Consultará uma mídia pelo usuário.
     *
     * @param titulo informado pelo usuário, para fazer a pesquisa.
     * @return retorna a Mídia que o usuário pesquisou caso seja encontrada.
     */
    public Midia consultar(String titulo);

    /**
     * Exibe a coleção com todas as mídias inseridas.
     *
     * @return A coleção completa.
     */
    public List exibir();

    /**
     * Recebe a list com todos as mídias de foto e assim faz a ordenação por
     * título.
     */
    public abstract void ordenar();

    /**
     * Edita uma determinada mídia, informada pelo usuário.
     *
     * @param velho Mídia antiga para ser substituida.
     * @param midia Mídia nova que será inclusa na coleção.
     * @return
     */
    public boolean editar(Midia velho, Midia midia);

    /**
     * Método para salvar o arquivo no sistema com todas informações recuperadas
     * da coleção.
     *
     * @param path caminho em que será salvo as mídias.
     * @return
     */
    public boolean salvarArquivo(String path);

    /**
     *
     * @param path nome do caminho que será carregado que contém as Fotos
     * @return Se o arquivo carregar com sucesso, retornará true caso contrário
     * retornará false;
     */
    public abstract boolean carregarArquivo(String path);

}
