package catalogo;

import catalogo.guis.GUI;
import catalogo.guis.GUIFilmes;
import catalogo.guis.GUIFotos;
import catalogo.guis.GUIMusica;
import catalogo.guis.GUIPodcast;

public class Principal {

    private static GUIMusica guiMusica = new GUIMusica();
    private static GUIFotos guiFotos = new GUIFotos();

    public static void main(String[] args) {
        Principal ME = new Principal();
        boolean ficar;
        do {
            ficar = ME.menuPrincipal();
        } while (ficar);

    }

    private boolean menuPrincipal() {
        System.out.println("Escolha o que você deseja utilizar: ");
        System.out.println("1- Fotos");
        System.out.println("2- Música");
        System.out.println("3 -Podcast");
        System.out.println("4- Filme");
        System.out.println("5- Sair");
        EntradasDoUsuarioComValidacao es = new EntradasDoUsuarioComValidacao();
        int escolhaUsuario = es.nextInt(false);
        switch (escolhaUsuario) {
            case 1:
                //Linha abaixo apenas para teste
                try {
                    guiFotos.cadastro();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                //Linha abaixo apenas para teste
                try {
                    guiMusica.cadastro();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 3:
                GUIPodcast guiPodcasts = new GUIPodcast();
                guiPodcasts.menu("podcast");
                break;
            case 4:
                GUIFilmes guiFilmes = new GUIFilmes();
                guiFilmes.menu("filme");
                break;
            case 5:
                return false;
            default:

        }
        return true;
    }

}