package catalogo.guis;

import catalogo.EntradasDoUsuarioComValidacao;
import catalogo.gerenciadores.GAudioLivros;
import catalogo.gerenciadores.IGerenciador;
import catalogo.midias.AudioLivro;
import java.util.ArrayList;
import java.util.Scanner;

public class GUIAudioLivros implements IMidiaUsuario {

    IGerenciador gerenciador = new GAudioLivros(new ArrayList<>());
    EntradasDoUsuarioComValidacao entrada = new EntradasDoUsuarioComValidacao();

    @Override
    public void cadastro() {
//String genero, String idioma, String autores, String local, String editora, int duracao, int ano, String titulo, String descricao, String path
        String genero, idioma, autores, local, editora, titulo, descricao;
        int ano;
        float duracao;

        AudioLivro midia;
        System.out.println("Genero do AudioLivro: ");
        genero = entrada.nextString();
        System.out.println("Idioma do AudioLivro: ");
        idioma = entrada.nextString();
        System.out.println("Autores do AudioLivro: ");
        autores = entrada.nextString();
        System.out.println("Local do AudioLivro: ");
        local = entrada.nextString();
        System.out.println("Editora do AudioLivro: ");
        editora = entrada.nextString();
        System.out.println("Duração do AudioLivro: ");
        duracao = (float) entrada.nextDouble(false);
        System.out.println("Ano do AudioLivro: ");
        ano = entrada.nextInt(false);
        System.out.println("Título do AudioLivro: ");
        titulo = entrada.nextString();
        System.out.println("Descrição do AudioLivro: ");
        descricao = entrada.nextString();

        midia = new AudioLivro(genero, idioma, autores, local, editora, duracao, ano, titulo, descricao, local);
        gerenciador.cadastrar(midia);
    }

    @Override
    public void exclusao() {
        String caminho;
        System.out.println("Digite o caminho do AudioLivro a ser excluido: ");
        caminho = entrada.nextString();
        gerenciador.remover(caminho);

    }

    @Override
    public void consulta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar() {
        String genero, idioma, autores, local, editora, titulo, descricao;
        int ano;
        double duracao;
        //pede o audiolivro pro usuario
        AudioLivro velho = gerenciador.consultar(titulo);
        AudioLivro novo;

        System.out.println("Novo genero do AudioLivro: ");
        genero = entrada.nextString();
        if (genero.equals("")) {
            genero = velho.getGenero();
        }
        
        System.out.println("Idioma do AudioLivro: ");
        idioma = entrada.nextString();
        if(idioma.equals("")){
            idioma = velho.getIdioma();
        }
        
        System.out.println("Autores do AudioLivro: ");
        autores = entrada.nextString();
        if(autores.equals("")){
            autores = velho.getAutores();
        }
        
        System.out.println("Local do AudioLivro: ");
        local = entrada.nextString();
        if(local.equals("")){
            local = velho.getLocal();
        }
        
        System.out.println("Editora do AudioLivro: ");
        editora = entrada.nextString();
        if(editora.equals("")){
            editora = velho.getEditora();
        }
        
        System.out.println("Duração do AudioLivro: ");
        duracao = entrada.nextDouble(true);
        if (duracao==Double.MIN_VALUE){
            duracao = velho.getDuracao();
        }
        
        System.out.println("Ano do AudioLivro: ");
        ano = entrada.nextInt(true);
        if(ano == Integer.MIN_VALUE){
            ano = velho.getAno();
        }
        
        System.out.println("Título do AudioLivro: ");
        titulo = entrada.nextString();
        if(titulo.equals("")){
            titulo = velho.getTitulo();
        }
        
        System.out.println("Descrição do AudioLivro: ");
        descricao = entrada.nextString();
        if(descricao.equals("")){
            titulo = velho.getDescricao();
        }

    }

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void carregar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exibirDadosTodasMidias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
