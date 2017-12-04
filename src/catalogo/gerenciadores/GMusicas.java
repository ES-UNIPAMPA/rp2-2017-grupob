package catalogo.gerenciadores;

import catalogo.midias.Midia;
import catalogo.midias.Musica;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GMusicas extends GerenciadorDeMidias {

    public GMusicas(List midia) {
        super(midia);
    }
    
    //COMORTAMENTOS E MÉTODOS
    /**
     * Método de ordenação INSERTIONSORT
     * Recebe a list com todos as mídias de foto
     * e assim faz a ordenação por título.
     */
    @Override
    public void ordenar() {
        List<Midia> listNova = getMidias();
        int i, j;
        for (i = 1; i < listNova.size(); i++) {
            Midia aux = listNova.get(i);
            for (j = i - 1; (j >= 0) && (listNova.get(j).getTitulo().compareToIgnoreCase(aux.getTitulo()) > 0); j--) {
                listNova.set(j+1, listNova.get(j));
            }
            listNova.set(j+1, aux);
        }
    }

    @Override
    public boolean carregarArquivo(String path) {
        final Logger logger = Logger.getLogger(GMusicas.class.getName());
        FileHandler log = null;
        String pathMidia = null, titulo = null, descricao = null, genero = null, 
               idioma = null, autores = null, interpretes = null, duracao = null;
        int ano = 0;
        int quantidadeMidias = 0;
        
        try {
            /* dizendo que existirá um arquivo para registros */
            log = new FileHandler("logGmusicas.txt");
            logger.warning("Nome do arquivo não pode ser null.");
            
            File file = new File(path);
            FileReader reader = new FileReader(file);
            BufferedReader buffered = new BufferedReader(reader);
            
            quantidadeMidias = Integer.parseInt(buffered.readLine());
            
            for (int i = 0; i < quantidadeMidias; i++) {
                titulo      = buffered.readLine();
                descricao   = buffered.readLine();
                pathMidia   = buffered.readLine();
                genero      = buffered.readLine();
                idioma      = buffered.readLine();
                autores     = buffered.readLine();
                interpretes = buffered.readLine();
                duracao     = buffered.readLine();
                ano         = buffered.read();
                
                //Inserindo midia do arquivo na coleção do software
                Midia midia = new Musica(titulo, descricao, path, genero, idioma, autores, interpretes, duracao, ano);

                getMidias().add(midia);
                
                buffered.readLine();
                
            }
            
            logger.info("Arquivo carregado com sucesso!");  
            log.close();
            return true;
            
        } catch (FileNotFoundException e) {
            Logger.getLogger(GMusicas.class.getName()).log(Level.SEVERE, null, e);    
            return false;
        }catch(IOException | SecurityException ex){
            Logger.getLogger(GMusicas.class.getName()).log(Level.SEVERE, null, ex);    
            return false;
        }
    }

}
