package catalogo.guis;

import catalogo.EntradasDoUsuarioComValidacao;
import catalogo.Pessoa;
import catalogo.gerenciadores.GPodcasts;
import catalogo.gerenciadores.IGerenciador;
import catalogo.midias.Midia;
import catalogo.midias.Podcast;
import java.util.ArrayList;

public class GUIPodcast extends GUI {

    private EntradasDoUsuarioComValidacao es = new EntradasDoUsuarioComValidacao();

    private IGerenciador gerenciador = GPodcasts.getInstance();

    //esse
    @Override
    public void cadastro() {
        Podcast p;
        System.out.println("Digite o titulo do PodCast");
        String titulo = es.nextString();
        System.out.println("Digite o caminho do arquivo");
        String path = es.nextString();
        System.out.println("Digite a descrição do arquivo");
        String descricao = es.nextString();
        System.out.println("Digite o ano do Podcast");
        int ano = es.nextInt(false);
        System.out.println("Digite os autores do Podcast, separado por ponto e virgula[;]");
        String autores = es.nextString();
        System.out.println("Digite o idioma do Podcast");
        String idioma = es.nextString();

        p = new Podcast(idioma, Pessoa.getPessoas(autores), ano, titulo, descricao, path);

        if (gerenciador.cadastrar(p)) {
            System.out.println("Podcast cadastrado com sucesso");
            salvar();
        } else {
            System.out.println("Erro ao cadastrar Podcast");
        }

    }

    //esse
    @Override
    public void exclusao() {
        System.out.println("Digite o caminho da midia a ser removida");
        String caminho = es.nextString();
        if (gerenciador.remover(caminho)) {
            System.out.println("Midia removida com sucesso");
            salvar();
        } else {
            System.out.println("Midia inexistente");
        }
    }

    //esse
    @Override
    public void consulta() {
        System.out.println("Digite o titulo da midia");
        String titulo = es.nextString();
        Midia m = gerenciador.consultar(titulo);
        if (m != null) {
            System.out.println("Dados da midia:\n" + m.toString());
        } else {
            System.out.println("Midia inexistente");
        }
    }

    //esse
    @Override
    public void exibirDadosTodasMidias() {
        System.out.println("Dados de todas as midias" + gerenciador.exibir());
    }
    //esse

    @Override
    public void editar() {
        System.out.println("Digite o titulo da midia a ser modificada");
        String mod = es.nextString();
        Podcast velho = null;
        try {
            velho = (Podcast) gerenciador.consultar(mod);
        } catch (ClassCastException e) {
            System.out.println("A midia informada não é um PodCast");
            return;
        }
        if (velho != null) {
            Podcast novo;
            System.out.println("Digite o novo titulo do PodCast [tecle ENTER sem digitar nada para pular]");
            String titulo = es.nextString();
            if (titulo.equals("")) {
                titulo = velho.getTitulo();
            }
            System.out.println("Digite o novo caminho do arquivo [tecle ENTER sem digitar nada para pular]");
            String path = es.nextString();
            if (path.equals("")) {
                path = velho.getPath();
            }
            System.out.println("Digite a nova descrição do arquivo [tecle ENTER sem digitar nada para pular]");
            String descricao = es.nextString();
            if (descricao.equals("")) {
                descricao = velho.getDescricao();
            }
            System.out.println("Digite o novo ano do Podcast");
            int ano = es.nextInt(true);
            if (ano == Integer.MIN_VALUE) {
                ano = velho.getAno();
            }
            System.out.println("Digite os novos autores do Podcast, separado por ponto e virgula[;] [tecle ENTER sem digitar nada para pular]");
            String autores = es.nextString();
            Pessoa[] autoresP=Pessoa.getPessoas(autores);
            if (autores.equals("")) {
                autoresP = velho.getAutores();
            }
            System.out.println("Digite o novo idioma do Podcast [tecle ENTER sem digitar nada para pular]");
            String idioma = es.nextString();
            if (idioma.equals("")) {
                idioma = velho.getIdioma();
            }

            novo = new Podcast(idioma, autoresP, ano, titulo, descricao, path);
            if (gerenciador.editar(velho, novo)) {
                System.out.println("Podcast editado com sucesso");
                salvar();
            } else {
                System.out.println("Erro ao editar o Podcast");
            }
        } else {
            System.out.println("Podcast não encontrado");
        }
    }

    @Override
    public void salvar() {
        System.out.println("Salvando....");
        gerenciador.salvarArquivo("midias/podcasts/podcasts.txt");
        System.out.println("Salvo");
    }

    @Override
    public void carregar() {
        System.out.println("Carregando...");
        gerenciador.carregarArquivo("midias/podcasts/podcasts.txt");
        System.out.println("Carregado");
    }

    @Override
    public void ordenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
