package catalogo.guis;

import catalogo.EntradasDoUsuarioComValidacao;
import catalogo.gerenciadores.GPartituraMusical;
import catalogo.gerenciadores.IGerenciador;
import catalogo.midias.Midia;
import catalogo.midias.PartituraMusical;
import java.util.ArrayList;

public class GUIPartituraMusical implements IMidiaUsuario{

    IGerenciador gerenciador = new GPartituraMusical(new ArrayList<>());
    EntradasDoUsuarioComValidacao entrada = new EntradasDoUsuarioComValidacao();
    
public void menu() {
        boolean ficar = true;
        do {
            System.out.print("O que você deseja?");
            System.out.println("1- Cadastrar uma Partitura Musical");
            System.out.println("2- Excluir uma Partitura Musical");
            System.out.println("3- Consultar uma Partitura Musical");
            System.out.println("4- Exibir todos os Partitura Musical");
            System.out.println("5- Editar uma Partitura Musical");
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
        //String genero, String autores, String instrumentos, int ano, String titulo, String descricao, String path
        String genero, autores, instrumentos, titulo, descricao,path;
        int ano;
        PartituraMusical midia;
        System.out.println("Genero da Partitura Musical: ");
        genero = entrada.nextString();
        System.out.println("Autores da Partitura Musical: ");
        autores = entrada.nextString();
        System.out.println("Instrumentos da Partitura Musical : ");
        instrumentos = entrada.nextString();
        System.out.println("Ano da Partitura Musical: ");
        ano = entrada.nextInt(false);
        System.out.println("Título da Partitura Musical: ");
        titulo = entrada.nextString();
        System.out.println("Descrição da Partitura Musical: ");
        descricao = entrada.nextString();
        System.out.println("Digite o caminho do arquivo");
        path = entrada.nextString();
        
        //String genero, String autores, String instrumentos, int ano, String titulo, String descricao, String path
        midia = new PartituraMusical(genero, autores, instrumentos, ano, titulo, descricao, path);
        gerenciador.cadastrar(midia);
    }

    @Override
    public void exclusao() {
        String caminho;
        System.out.println("Digite o caminho da Partitura Musical a ser excluida: ");
        caminho = entrada.nextString();
        gerenciador.remover(caminho);

    }

    @Override
    public void consulta() {
        System.out.println("Digite o titulo da Partitura Musical a ser excluida");
        String titulo = entrada.nextString();
        Midia m = gerenciador.consultar(titulo);
        System.out.println("Dados da Partitura Musical:\n" + m.toString());
    }

    @Override
    public void editar() {
        //String genero, String autores, String instrumentos, int ano, String titulo, String descricao, String path
        String genero, autores, instrumentos, titulo, descricao, path;
        int ano;
        System.out.println("Digite o título da Partitura Musical desejado para a edição");
        titulo = entrada.nextString();
        PartituraMusical velho = (PartituraMusical)gerenciador.consultar(titulo);
        PartituraMusical novo;

        System.out.println("Novo genero da Partitura Musical: ");
        genero = entrada.nextString();
        if (genero.equals("")) {
            genero = velho.getGenero();
        }
        
        System.out.println("Autores do AudioLivro: ");
        autores = entrada.nextString();
        if(autores.equals("")){
            autores = velho.getAutores();
        }
        
        System.out.println("Instrumentos: ");
        instrumentos = entrada.nextString();
        if(instrumentos.equals("")){
            instrumentos = velho.getInstrumentos();
        }
        
        System.out.println("Ano da Partitura Musical: ");
        ano = entrada.nextInt(true);
        if(ano == Integer.MIN_VALUE){
            ano = velho.getAno();
        }
        
        System.out.println("Título da Partitura Musical: ");
        titulo = entrada.nextString();
        if(titulo.equals("")){
            titulo = velho.getTitulo();
        }
        
        System.out.println("Descrição da Partirura Musical: ");
        descricao = entrada.nextString();
        if(descricao.equals("")){
            titulo = velho.getDescricao();
        }
        
        System.out.println("Digite o caminho do arquivo");
        path = entrada.nextString();
        if(path.equals("")){
            path = velho.getPath();
        }
        //String genero, String autores, String instrumentos, int ano, String titulo, String descricao, String path
        novo = new PartituraMusical(genero, autores, instrumentos, ano, titulo, descricao, path);
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
