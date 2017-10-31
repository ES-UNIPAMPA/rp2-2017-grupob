package catalogo.gerenciadores;

import catalogo.midias.Midia;
import java.util.List;

public abstract class GerenciadorDeMidias implements IGerenciador {

    private List<Midia> midias;

    public GerenciadorDeMidias(List midias) {
        this.midias = midias;
    }

    @Override
    public boolean cadastrar(Midia midia) {
        if (midia != null) {
            return midias.add(midia);
        }
        return false;
    }

    @Override
    public boolean remover(String path) {
        for (Midia midia : midias) {
            if (midia.getPath().equals(path)) {
                return midias.remove(midia);

            }
        }
        return false;
    }

    @Override
    public Midia consultar(String titulo) {
        Midia aux;
        if (midias != null) {
            for (Midia midia : midias) {
                if (midia.getTitulo().equals(titulo)) {
                    return midia;
                }
            }
        }
        return null;
    }

    @Override
    public String exibir() {
        return null;
    }

    @Override
    public boolean editar(Midia velho, Midia midia) {
        for (int i = 0; i < midias.size(); i++) {
            if (velho == midias.get(i)) {
                midias.set(i, velho);
                return true;
            }
        }
        return false;
    }
}
