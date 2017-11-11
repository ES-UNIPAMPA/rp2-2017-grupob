package catalogo.gerenciadores;

import catalogo.midias.Midia;
import java.util.List;

public class GAudioLivros extends GerenciadorDeMidias {

    public GAudioLivros(List midias) {
        super(midias);
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
