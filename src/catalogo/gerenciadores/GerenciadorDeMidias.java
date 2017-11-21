package catalogo.gerenciadores;

import catalogo.midias.Midia;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class GerenciadorDeMidias implements IGerenciador {

    private List<Midia> midias;

    public GerenciadorDeMidias(List midias) {
        this.midias = midias;
    }

    public GerenciadorDeMidias() {
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
    public List<Midia> exibir() {
        return midias;
    }

    @Override
    public boolean editar(Midia velho, Midia midia) {
        for (int i = 0; i < midias.size(); i++) {
            if (velho == midias.get(i)) {
                midias.set(i, midia);             
                return true;
            }
        }
        return false;
    }

    protected List getMidias() {
        return midias;
    }

    @Override
    public boolean salvarArquivo(String path) {

        try {
            FileOutputStream outFile;
            BufferedWriter buff;
            outFile = new FileOutputStream(new File(path));
            buff = new BufferedWriter(new OutputStreamWriter(outFile, "UTF-8"));

            buff.write(midias.size() + "\r\n");

            for (Midia midia : midias) {
                buff.write(midia.toFile());
                buff.write("\r\n");
            }
            buff.flush();
            buff.close();
            outFile.close();
            return true;
        } catch (FileNotFoundException e) {
            Logger.getLogger(GerenciadorDeMidias.class.getName()).log(Level.SEVERE, null, e);
            return false;
        } catch (IOException | SecurityException ex) {
            Logger.getLogger(GerenciadorDeMidias.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}
