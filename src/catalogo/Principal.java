package catalogo;

import catalogo.guis.GUI;
import catalogo.guis.GUIFotos;
import catalogo.guis.GUIMusica;

public class Principal {

    public static void main(String[] args) {
        GUI gui = new GUI();
        boolean ficar = true;
        do {
            ficar = gui.menu();
        } while (ficar);

    }

}
