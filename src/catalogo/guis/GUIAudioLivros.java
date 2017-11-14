package catalogo.guis;

import catalogo.EntradasDoUsuarioComValidacao;
import catalogo.gerenciadores.GAudioLivros;
import catalogo.gerenciadores.IGerenciador;
import catalogo.midias.AudioLivro;
import catalogo.midias.Midia;
import java.util.ArrayList;

public class GUIAudioLivros implements IMidiaUsuario {

    IGerenciador gerenciador = new GAudioLivros(new ArrayList<>());
    EntradasDoUsuarioComValidacao entrada = new EntradasDoUsuarioComValidacao();
    
public void menu() {
        boolean ficar = true;
        do {
            System.out.print("O que você deseja?");
            System.out.println("1- Cadastrar um AudioLivro");
            System.out.println("2- Excluir um AudioLivro");
            System.out.println("3- Consultar um AudioLivro");
            System.out.println("4- Exibir todos os AudioLivros");
            System.out.println("5- Editar um AudioLivro");
            System.out.println("6 -Sair");
            int escolhaUsuario = entrada.nextInt(false);
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
                    System.out.println("Tente Novamente");
            }
        } while (ficar);
    }
    @Override
    public void cadastro() {
//String genero, String idioma, String autores, String local, String editora, int duracao, int ano, String titulo, String descricao, String path
        String genero, idioma, autores, local, editora, titulo, descricao, path;
        int ano;
        double duracao;

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
        duracao = entrada.nextDouble(false);
        System.out.println("Ano do AudioLivro: ");
        ano = entrada.nextInt(false);
        System.out.println("Título do AudioLivro: ");
        titulo = entrada.nextString();
        System.out.println("Descrição do AudioLivro: ");
        descricao = entrada.nextString();
        System.out.println("Digite o caminho do arquivo");
        path = entrada.nextString();

        midia = new AudioLivro(genero, idioma, autores, local, editora, duracao, ano, titulo, descricao, path);
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
        System.out.println("Digite o titulo do AudioLivro a ser excluido");
        String titulo = entrada.nextString();
        Midia m = gerenciador.consultar(titulo);
        System.out.println("Dados do AudioLivro:\n" + m.toString());
    }

    @Override
    public void editar() {
        String genero, idioma, autores, local, editora, titulo, descricao, path;
        int ano;
        double duracao;
        System.out.println("Digite o título do AudioLivro desejado para a edição");
        titulo = entrada.nextString();
        AudioLivro velho = (AudioLivro)gerenciador.consultar(titulo);
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
        
        System.out.println("Digite o caminho do arquivo");
        path = entrada.nextString();
        if(path.equals("")){
            path = velho.getPath();
        }
       //genero, idioma, autores, local, editora, duracao, ano,titulo, descricao, path
        novo = new AudioLivro(genero, idioma, autores, local, editora, duracao, ano, titulo, descricao, path);
        gerenciador.editar(velho, novo);
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
        System.out.println("Dados de todos os AudioLivros" + gerenciador.exibir());
    }

    @Override
    public void ordenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
