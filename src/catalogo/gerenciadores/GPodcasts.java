package catalogo.gerenciadores;

import catalogo.midias.Midia;
import catalogo.midias.Podcast;
import java.util.ArrayList;
import java.util.List;

public class GPodcasts extends GerenciadorDeMidias {

    private static GPodcasts ME = new GPodcasts(new ArrayList<>());

    private GPodcasts(List<Podcast> midias) {
        super(midias);
    }

    public static GPodcasts getInstance() {
        return ME;
    }

    @Override
    public void ordenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean salvarArquivo(String path, Midia midia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean carregarArquivo(String path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
