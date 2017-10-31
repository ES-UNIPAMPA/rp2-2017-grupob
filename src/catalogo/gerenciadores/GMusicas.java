package catalogo.gerenciadores;

import catalogo.midias.Midia;
import java.util.List;

public class GMusicas extends GerenciadorDeMidias {

    public GMusicas(List midias) {
        super(midias);
    }

    @Override
    public void ordenar() {
        //IMPLEMENTAR
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
    public boolean editar(String titulo, Midia m) {
        if (m != null) {
            for (Midia midia : midias) {
                //IMPLEMENTAR
            }
        }
    }

}
