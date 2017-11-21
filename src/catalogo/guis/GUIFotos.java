
package catalogo.guis;

import catalogo.gerenciadores.GFotos;
import catalogo.midias.Foto;
import catalogo.midias.Midia;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class GUIFotos implements IMidiaUsuario{
    private Scanner scanner = new Scanner(System.in);
    private GFotos gFotos = new GFotos(new ArrayList<>());

    @Override
    public void cadastro() {
        String titulo, descricao, path;
        String fotografo, pessoas, local;
        String data, hora;
        
        System.out.println("Nome do arquivo: "); path = scanner.nextLine();
        System.out.println("Titulo: ");     titulo = scanner.nextLine();
        System.out.println("Descricao: ");  descricao = scanner.nextLine();
        System.out.println("Fotografo : "); fotografo = scanner.nextLine();
        System.out.println("Pessoas : ");   pessoas = scanner.nextLine();
        System.out.println("Local : ");     local = scanner.nextLine();
        System.out.println("Duracao : ");   data = scanner.nextLine();
        System.out.println("Ano : ");       hora =  scanner.nextLine();
        
        Midia midia = new Foto(titulo, descricao, path, fotografo, pessoas, local, data, hora);
        gFotos.cadastrar(midia);
        if (gFotos.salvarArquivo(path)) {
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
        if (gFotos.remover(temp)) {
            System.out.println("Removido com sucesso.");
        }else{
            System.out.println("Falha ao remover esta midia.");
        }
        
    }

    @Override
    public void consulta() {
        String temp;
        System.out.println("Infome o titulo da midia: "); temp = scanner.nextLine();
        Midia aux = gFotos.consultar(temp);
        if (aux != null) {
            System.out.println(aux.toString());
        }else{
            System.out.println("Midia nao encontrada.");
        }
    }

    @Override
    public void exibirDadosTodasMidias() {
        if (gFotos != null) {
            System.out.println("Midias: " + gFotos.toString());
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
