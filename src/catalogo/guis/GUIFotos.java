
package catalogo.guis;

import catalogo.gerenciadores.GFotos;
import catalogo.midias.Foto;
import catalogo.midias.Midia;
import java.util.Calendar;
import java.util.Scanner;

public class GUIFotos implements IMidiaUsuario{
    private Scanner scanner = new Scanner(System.in);
    private GFotos gFotos = new GFotos();

    @Override
    public void cadastro() {
        String titulo, descricao, path;
        String fotografo, pessoas, local;
        Calendar data, hora;
        
        System.out.println("Nome do arquivo: "); path = scanner.nextLine();
        System.out.println("Titulo: ");     titulo = scanner.nextLine();
        System.out.println("Descricao: ");  descricao = scanner.nextLine();
        System.out.println("Fotografo : "); fotografo = scanner.nextLine();
        System.out.println("Pessoas : ");   pessoas = scanner.nextLine();
        System.out.println("Local : ");     local = scanner.nextLine();
        System.out.println("Duracao : ");   data = Calendar.getInstance();
        System.out.println("Ano : ");       hora =  Calendar.getInstance();
        
        Midia midia = new Foto(titulo, descricao, path, fotografo, pessoas, local, data, hora);
        gFotos.cadastrar(midia);
        if (gFotos.salvarArquivo(path, midia)) {
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
