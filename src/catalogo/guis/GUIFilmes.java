package catalogo.guis;

import catalogo.EntradasDoUsuarioComValidacao;
import catalogo.gerenciadores.GFilmes;
import catalogo.gerenciadores.IGerenciador;
import catalogo.midias.Filme;
import catalogo.midias.Midia;
import java.util.ArrayList;

public class GUIFilmes implements IMidiaUsuario {

    IGerenciador gerenciador = new GFilmes(new ArrayList<>());
    EntradasDoUsuarioComValidacao es = new EntradasDoUsuarioComValidacao();
    private static final GUIFilmes ME = new GUIFilmes();

    private GUIFilmes() {

    }

    public static GUIFilmes getInstance() {
        return ME;
    }
    public void menu() {
        boolean ficar = true;
        do {
            System.out.print("O que você deseja fazer?");
            System.out.println("1- Cadastrar um Filme");
            System.out.println("2- Excluir um filme");
            System.out.println("3- Consultar um filme");
            System.out.println("4- Exibir todos os filmes");
            System.out.println("5- Editar um filme");
            System.out.println("6 -Sair");
            int escolhaUsuario = es.nextInt(false);
            switch (escolhaUsuario) {
                case 1:
                    cadastro();
                    break;
                case 2:
                    exclusao();
                    break;
                case 3:
                    consulta();
                    break;
                case 4:
                    exibirDadosTodasMidias();
                    break;
                case 5:
                    editar();
                    break;
                case 6:
                    ficar = false;
                    break;
                default:
                    System.out.println("Não entendi!");
            }
        } while (ficar);
    }
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
        System.out.println("Digite o nome do diretor do arquivo");
        String diretor = es.nextString();
        System.out.println("Digite o idioma do Filme");
        String idioma = es.nextString();

        f = new Filme(genero, idioma, diretor, atoresPrincipais, ano, titulo, descricao, path);
        if (gerenciador.cadastrar(f)) {
            System.out.println("Filme cadastrado com sucesso");
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
        System.out.println("Dados do filme:\n" + m.toString());
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
        String atoresPrincipais = es.nextString();
        if (atoresPrincipais.equals("")) {
            atoresPrincipais = velho.getAtoresPrincipais();
        }
        System.out.println("Digite o novo diretor do Filme [tecle ENTER sem digitar nada para pular]");
        String diretor = es.nextString();
        if (diretor.equals("")) {
            diretor = velho.getDiretor();
        }
        System.out.println("Digite o novo idioma do Filme [tecle ENTER sem digitar nada para pular]");
        String idioma = es.nextString();
        if (idioma.equals("")) {
            idioma = velho.getIdioma();
        }

        novo = new Filme(genero, idioma, diretor, atoresPrincipais, ano, titulo, descricao, path);
        if (gerenciador.editar(velho, novo)) {
            System.out.println("Filme editado com sucesso");
        } else {
            System.out.println("Erro ao editar o FIlme");
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
    public void ordenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
