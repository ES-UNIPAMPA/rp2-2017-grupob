package catalogo.guis;

import catalogo.EntradasDoUsuarioComValidacao;

public class GUI {

    private static GUIMusica guiMusica = new GUIMusica();
    private static GUIFotos guiFotos = new GUIFotos();

    public boolean menu() {
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
                GUIAudioLivros guiaudiolivros = new GUIAudioLivros();
                guiaudiolivros.menu();
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
                GUIPodcast guiPodcasts = GUIPodcast.getInstance();
                guiPodcasts.menu();
                break;
            case 8:
                GUIFilmes guiFilmes = GUIFilmes.getInstance();
                guiFilmes.menu();
                break;
            case 9:
                return true;
            default:

        }
        return false;
    }

}
