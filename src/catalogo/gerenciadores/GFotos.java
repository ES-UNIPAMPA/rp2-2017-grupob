package catalogo.gerenciadores;

import java.util.List;
import catalogo.midias.Midia;

public class GFotos extends GerenciadorDeMidias {

    public List<Midia> midias;
    
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

    @Override
    public boolean editar(String titulo, Midia midia) {
        return true;
    }
    
}
