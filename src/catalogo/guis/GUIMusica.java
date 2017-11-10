package catalogo.guis;

import catalogo.gerenciadores.GMusicas;
import catalogo.midias.Midia;
import catalogo.midias.Musica;
import java.util.Scanner;

public class GUIMusica implements IMidiaUsuario{
    private Scanner scanner = new Scanner(System.in);
    private GMusicas gMusicas = new GMusicas();
    
    @Override
    public void cadastro() {
        String titulo, descricao, path;
        String genero, idioma, autores, interpretes;
        int duracao, ano;
        
        System.out.println("Nome do arquivo: "); path = scanner.nextLine();
        System.out.println("Titulo: ");         titulo = scanner.nextLine();
        System.out.println("Descricao: ");      descricao = scanner.nextLine();
        System.out.println("Genero : ");        genero = scanner.nextLine();
        System.out.println("Idioma : ");        idioma = scanner.nextLine();
        System.out.println("Autores : ");       autores = scanner.nextLine();
        System.out.println("Interpretes : ");   interpretes = scanner.nextLine();
        System.out.println("Duração : ");   duracao = Integer.parseInt(scanner.nextLine());
        System.out.println("Ano : ");   ano = Integer.parseInt(scanner.nextLine());
        
        Midia midia = new Musica(titulo, descricao, path, genero, idioma, autores, interpretes, duracao, ano);
        gMusicas.cadastrar(midia);
        if (gMusicas.salvarArquivo(path, midia)) {
            System.out.println("Arquivo criado e escrito com sucesso!");
        }else{
            System.out.println("Falha ao criar arquivo!");
        }
        
    }

    @Override
    public void exclusao() {
    }

    @Override
    public void consulta() {
    }

    @Override
    public void exibirDadosTodasMidias() {
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
