package catalogo.guis;

import catalogo.Pessoa;
import catalogo.gerenciadores.GFilmes;
import catalogo.gerenciadores.IGerenciador;
import catalogo.midias.Filme;
import catalogo.midias.Midia;
import java.io.File;
import java.util.ArrayList;

public class GUIFilmes extends GUI {

    IGerenciador gerenciador = GFilmes.getInstance();

    //esse
    @Override
    public void cadastro() {
        Filme f;
        System.out.println("Digite o titulo do Filme");
        String titulo = es.nextString();
        System.out.println("Digite o caminho do arquivo");
        String path = es.nextString();
        System.out.println("Digite a descrição do arquivo");
        String descricao = es.nextString();
        System.out.println("Digite o ano do Filme");
        int ano = es.nextInt(false);
        System.out.println("Digite o genero do Filme");
        String genero = es.nextString();
        System.out.println("Digite os nomes dos atores do Filme, separado por ponto e virgula[;]");
        String atoresPrincipais = es.nextString();
        System.out.println("Digite o nome do diretor do Filme");
        String diretor = es.nextString();
        System.out.println("Digite o idioma do Filme");
        String idioma = es.nextString();

        f = new Filme(genero, idioma, Pessoa.getPessoa(diretor), Pessoa.getPessoas(atoresPrincipais), ano, titulo, descricao, path);
        if (gerenciador.cadastrar(f)) {
            System.out.println("Filme cadastrado com sucesso");
            salvar();
        } else {
            System.out.println("Erro ao cadastrar Filme");
        }

    }

    //esse
    @Override
    public void exclusao() {
        System.out.println("Digite o caminho do Filme a ser removida");
        String caminho = es.nextString();
        if (gerenciador.remover(caminho)) {
            System.out.println("Filme removida com sucesso");
            salvar();
        } else {
            System.out.println("Filme inexistente");
        }
    }

    //esse
    @Override
    public void consulta() {
        System.out.println("Digite o titulo do filme");
        String titulo = es.nextString();
        Midia m = gerenciador.consultar(titulo);
        if (m != null) {
            System.out.println("Dados do filme:\n" + m.toString());
        } else {
            System.out.println("Filme inexistente");
        }
    }

    //esse
    @Override
    public void exibirDadosTodasMidias() {
        System.out.println("Dados de todas os filmes" + gerenciador.exibir());
    }
    //esse

    @Override
    public void editar() {
        System.out.println("Digite o titulo do filme a ser modificada");
        String mod = es.nextString();
        Filme velho;
        try {
            velho = (Filme) gerenciador.consultar(mod);
        } catch (ClassCastException e) {
            System.out.println("o filmes informada não é um Filme");
            return;
        }
        if (velho != null) {
            Filme novo;
            System.out.println("Digite o novo titulo do Filme [tecle ENTER sem digitar nada para pular]");
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
            System.out.println("Digite o novo ano do Filme");
            int ano = es.nextInt(true);
            if (ano == Integer.MIN_VALUE) {
                ano = velho.getAno();
            }
            System.out.println("Digite o novo genero do Filme [tecle ENTER sem digitar nada para pular]");
            String genero = es.nextString();
            if (genero.equals("")) {
                genero = velho.getGenero();
            }
            System.out.println("Digite os novos atores do Filme, separado por ponto e virgula[;] [tecle ENTER sem digitar nada para pular]");
            String atoresP = es.nextString();
            Pessoa[] atoresPrincipais = Pessoa.getPessoas(atoresP);
            if (atoresPrincipais.equals("")) {
                atoresPrincipais = velho.getAtoresPrincipais();
            }
            System.out.println("Digite o novo diretor do Filme [tecle ENTER sem digitar nada para pular]");
            String diretor = es.nextString();
            Pessoa diretorP = Pessoa.getPessoa(diretor);
           
            if (diretor.equals("")) {
                diretorP = velho.getDiretor();
            }
            System.out.println("Digite o novo idioma do Filme [tecle ENTER sem digitar nada para pular]");
            String idioma = es.nextString();
            if (idioma.equals("")) {
                idioma = velho.getIdioma();
            }

            novo = new Filme(genero, idioma, diretorP, atoresPrincipais, ano, titulo, descricao, path);
            if (gerenciador.editar(velho, novo)) {
                System.out.println("Filme editado com sucesso");
                salvar();
            } else {
                System.out.println("Erro ao editar o FIlme");
            }
        } else {
            System.out.println("Filme inexistente");
        }

    }

    @Override
    public void salvar() {
        System.out.println("Salvando....");
        gerenciador.salvarArquivo("midias/filmes/filmes.txt");
        System.out.println("Salvo");
    }

    @Override
    public void carregar() {
        System.out.println("Carregando...");
        gerenciador.carregarArquivo("midias/filmes/filmes.txt");
        System.out.println("Carregado");
    }

    @Override
    public void ordenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
