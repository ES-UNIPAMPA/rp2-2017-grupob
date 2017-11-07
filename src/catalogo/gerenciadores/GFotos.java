package catalogo.gerenciadores;

import java.util.List;

public class GFotos extends GerenciadorDeMidias {
    
    public GFotos(List midias) {
        super(midias);
    }
    
    //COMORTAMENTOS E MÉTODOS
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
