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

    /**
     * Cadastrar as midias que o usuário informa na interface ou console.
     * @param midia Contém todas as informações passadas pelo usuário e
     * essa mídia será inserida na coleção.
     * @return true se conseguir cadastrar uma mídia.
     */
    @Override
    public boolean cadastrar(Midia midia) {
        if (midia != null) {
            return midias.add(midia);
        }
        return false;
    }
    /**
     * removerá alguma midia escolhida pelo usuário, que estiver na coleção
     * @param path caminho do arquivo que tem a midia a ser removida.
     * @return 
     */
    @Override
    public boolean remover(String path) {
        for (Midia midia : midias) {
            if (midia.getPath().equals(path)) {
                return midias.remove(midia);

            }
        }
        return false;
    }

    /**
     * Consultará uma mídia pelo usuário.
     * @param titulo informado pelo usuário, para fazer a pesquisa.
     * @return retorna a Mídia que o usuário pesquisou caso seja encontrada.
     */
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

    /**
     * Exibe a coleção com todas as mídias inseridas.
     * @return A coleção completa.
     */
    @Override
    public List<Midia> exibir() {
        return midias;
    }

    /**
     * Edita uma determinada mídia, informada pelo usuário.
     * @param velho Mídia antiga para ser substituida.
     * @param midia Mídia nova que será inclusa na coleção.
     * @return 
     */
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

    /**
     * Recupera a coleção.
     * @return 
     */
    protected List getMidias() {
        return midias;
    }

    /**
     * Método para salvar o arquivo no sistema com todas informações
     * recuperadas da coleção.
     * @param path caminho em que será salvo as mídias.
     * @return 
     */
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
