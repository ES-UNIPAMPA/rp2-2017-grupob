package catalogo.gerenciadores;

import java.util.List;
import catalogo.midias.Midia;

public class GFotos extends GerenciadorDeMidias {
    
    public GFotos(List midias) {
        super(midias);
    }

    @Override
    public void ordenar() {
        
    }

    @Override
    public boolean carregarArquivo() {
        return true;
    }

    @Override
    public boolean salvarArquivo() {
        return true;
    }


    
}
