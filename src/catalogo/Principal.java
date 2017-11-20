package catalogo;

import catalogo.guis.GUI;
import catalogo.guis.GUIAudioLivros;
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
        System.out.println("1- AudioLivros");
        System.out.println("2- Ebook");
        System.out.println("3- Fotos");
        System.out.println("4- Jogos");
        System.out.println("5- Música");
        System.out.println("6- Partitura Musical");
        System.out.println("7 -Podcast");
        System.out.println("8- Filme");
        System.out.println("9- Sair");
        EntradasDoUsuarioComValidacao es = new EntradasDoUsuarioComValidacao();
        int escolhaUsuario = es.nextInt(false);
        switch (escolhaUsuario) {
            case 1:
                GUIAudioLivros guialdiolivros = new GUIAudioLivros();
                guialdiolivros.menu();
                break;
            case 2:
                // GUIEBook guiebook = new GUIEBook();
                break;
            case 3:
                //Linha abaixo apenas para teste
                try {
                    guiFotos.cadastro();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 4:
                //GUIJOgos guijogos = new GUIJogos();
                break;
            case 5:
                //Linha abaixo apenas para teste
                try {
                    guiMusica.cadastro();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 6:
                //GUIPartituraMusical guipartituramuscal = new GUIPartituraMusical();
                break;
            case 7:
                GUIPodcast guiPodcasts = new GUIPodcast();
                guiPodcasts.menu();
                break;
            case 8:
                GUIFilmes guiFilmes = new GUIFilmes();
                guiFilmes.menu();
                break;
            case 9:
                return true;
            default:

        }
        return false;
    }

}