/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo.gerenciadores;

import catalogo.midias.Midia;

/**
 *
 * @author mathias
 */
public interface IGerenciador {

    public boolean cadastrar(Midia midia);

    public boolean remover(String path) ;

    public Midia consultar(String titulo) ;

    public String exibir() ;

    public abstract void ordenar();

    public boolean editar(Midia velho, Midia midia);

    public boolean salvarArquivo(String path);

    public abstract boolean carregarArquivo(String path);

}
