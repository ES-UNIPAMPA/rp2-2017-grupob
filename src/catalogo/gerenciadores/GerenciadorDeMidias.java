package catalogo.gerenciadores;

import catalogo.midias.Midia;
import java.util.List;

public abstract class GerenciadorDeMidias implements IGerenciador {

    private List midias;

    @Override
    public boolean cadastrar(Midia midia) {
        return false;
    }

    @Override
    public boolean remover(String path) {
        return false;
    }

    @Override
    public Midia consultar(String titulo) {
        return null;
    }

    @Override
    public String exibir() {
        return null;
    }




}
