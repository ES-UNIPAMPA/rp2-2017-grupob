package catalogo;

import catalogo.guis.GUI;

public class Principal {

    public static void main(String[] args) {
        GUI gui = new GUI();
        boolean ficar = true;
        do {
            ficar = gui.menu();
        } while (ficar);

    }

}
