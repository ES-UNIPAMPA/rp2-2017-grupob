package catalogo.gerenciadores;

import catalogo.midias.Foto;
import catalogo.midias.Midia;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

//Imports para logs
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GFotos extends GerenciadorDeMidias {

    public GFotos(List midias) {
        super(midias);
    }

    //COMORTAMENTOS E MÉTODOS
    /**
     * Método de ordenação INSERTIONSORT Recebe a list com todos as mídias de
     * foto e assim faz a ordenação por título.
     */
    @Override
    public void ordenar() {
        List<Midia> listNova = getMidias();
        int i, j;
        for (i = 1; i < listNova.size(); i++) {
            Midia aux = listNova.get(i);
            for (j = i - 1; (j >= 0) && (listNova.get(j).getTitulo().compareToIgnoreCase(aux.getTitulo()) > 0); j--) {
                listNova.set(j + 1, listNova.get(j));
            }
            listNova.set(j + 1, aux);
        }
    }

    @Override
    public boolean carregarArquivo(String path) {

        final Logger logger = Logger.getLogger(GFotos.class.getName());
        FileHandler log = null;
        String pathMidia = null, titulo = null, descricao = null, fotografo = null,
                pessoas = null, local = null, data = null, hora = null;
        Midia midia = null;
        int quantidadeMidias = 0;

        try {
            /* dizendo que existirá um arquivo para registros */
            log = new FileHandler("log.txt");
            logger.warning("Nome do arquivo não pode ser null.");

            File file = new File(path);
            FileReader reader = new FileReader(file);
            BufferedReader buffered = new BufferedReader(reader);

            quantidadeMidias = Integer.parseInt(buffered.readLine());

            for (int i = 0; i < quantidadeMidias; i++) {
                titulo = buffered.readLine();
                descricao = buffered.readLine();
                pathMidia = buffered.readLine();
                fotografo = buffered.readLine();
                pessoas = buffered.readLine();
                local = buffered.readLine();
                data = buffered.readLine();
                hora = buffered.readLine();
                //Inserindo midia do arquivo na coleção do software
                midia = new Foto(titulo, descricao, pathMidia, fotografo, pessoas, local, data, hora);

                getMidias().add(midia);

                buffered.readLine();
            }

            logger.info("Arquivo carregado com sucesso em.");
            log.close();
            return true;

        } catch (FileNotFoundException e) {
            Logger.getLogger(GFotos.class.getName()).log(Level.SEVERE, null, e);
            return false;
        } catch (IOException | SecurityException ex) {
            Logger.getLogger(GFotos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
