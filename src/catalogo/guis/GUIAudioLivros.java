package catalogo.guis;

import catalogo.gerenciadores.GAudioLivros;
import catalogo.gerenciadores.IGerenciador;
import catalogo.midias.AudioLivro;
import java.util.ArrayList;
import java.util.Scanner;

public class GUIAudioLivros implements IMidiaUsuario {

    IGerenciador gerenciador = new GAudioLivros(new ArrayList<>());
    Scanner entrada = new Scanner (System.in);
    
    String genero, idioma, autores, local, editora, titulo, descricao;
    int ano;
    float duracao;

    @Override
    public void cadastro() {
//String genero, String idioma, String autores, String local, String editora, int duracao, int ano, String titulo, String descricao, String path
        AudioLivro midia;
        System.out.println("Genero do AudioLivro: ");
        genero = entrada.next();
        System.out.println("Idioma do AudioLivro: ");
        idioma = entrada.next();
        System.out.println("Autores do AudioLivro: ");
        autores = entrada.next();
        System.out.println("Local do AudioLivro: ");
        local = entrada.next();
        System.out.println("Editora do AudioLivro: ");
        editora = entrada.next();
        System.out.println("Duração do AudioLivro: ");
        duracao = entrada.nextFloat();
        System.out.println("Ano do AudioLivro: ");
        ano = entrada.nextInt();
        System.out.println("Título do AudioLivro: ");
        titulo = entrada.next();
        System.out.println("Descrição do AudioLivro: ");
        descricao = entrada.next();
       
        midia = new AudioLivro(genero, idioma, autores, local, editora, duracao, ano, titulo, descricao, local);
        gerenciador.cadastrar(midia);
    }

    @Override
    public void exclusao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consulta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exibirDadosMidia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void carregar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
