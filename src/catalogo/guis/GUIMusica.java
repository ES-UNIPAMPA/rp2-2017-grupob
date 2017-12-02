package catalogo.guis;

import catalogo.gerenciadores.GMusicas;
import catalogo.midias.Midia;
import catalogo.midias.Musica;
import java.util.ArrayList;
import java.util.Scanner;

public class GUIMusica implements IMidiaUsuario{
    private Scanner scanner = new Scanner(System.in);
    private GMusicas gMusicas = new GMusicas(new ArrayList<>());
    
    @Override
    public void cadastro() {
        String titulo, descricao, path;
        String genero, idioma, autores, interpretes;
        String duracao;
        int ano;
        
        System.out.println("Nome do arquivo: "); path = scanner.nextLine();
        System.out.println("Titulo: ");         titulo = scanner.nextLine();
        System.out.println("Descricao: ");      descricao = scanner.nextLine();
        System.out.println("Genero : ");        genero = scanner.nextLine();
        System.out.println("Idioma : ");        idioma = scanner.nextLine();
        System.out.println("Autores : ");       autores = scanner.nextLine();
        System.out.println("Interpretes : ");   interpretes = scanner.nextLine();
        System.out.println("Duração : ");       duracao = scanner.nextLine();
        System.out.println("Ano : ");           ano = Integer.parseInt(scanner.nextLine());
        
        Midia midia = new Musica(titulo, descricao, path, genero, idioma, autores, interpretes, duracao, ano);
        gMusicas.cadastrar(midia);
        if (gMusicas.salvarArquivo(path)) {
            System.out.println("Arquivo criado e escrito com sucesso!");
        }else{
            System.out.println("Falha ao criar arquivo!");
        }
        
    }

    @Override
    public void exclusao() {
        String temp;
        System.out.println("Informe o caminho do arquivo que deseja remover: ");
        temp = scanner.nextLine();
        if (gMusicas.remover(temp)) {
            System.out.println("Removido com sucesso.");
        }else{
            System.out.println("Falha ao remover esta midia.");
        }
    }

    @Override
    public void consulta() {
        String temp;
        System.out.println("Infome o titulo da midia: "); temp = scanner.nextLine();
        Midia aux = gMusicas.consultar(temp);
        if (aux != null) {
            System.out.println(aux.toString());
        }else{
            System.out.println("Midia nao encontrada.");
        }
    }

    @Override
    public void exibirDadosTodasMidias() {
        if (gMusicas != null) {
            System.out.println("Midias: " + gMusicas.toString());
        }
    }

    @Override
    public void editar() {
    }

    @Override
    public void ordenar() {
    }
    
    @Override
    public void salvar() {
    }

    @Override
    public void carregar() {
    }

}
