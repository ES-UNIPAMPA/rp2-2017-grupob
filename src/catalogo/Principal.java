package catalogo;

import catalogo.guis.GUIFotos;
import catalogo.guis.GUIMusica;

public class Principal {
    private static GUIMusica guiMusica = new GUIMusica();
    private static GUIFotos guiFotos = new GUIFotos();
    
    public static void main(String[] args) {
        //Linha abaixo apenas para teste
        try{
            guiFotos.cadastro();
            guiMusica.cadastro();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
