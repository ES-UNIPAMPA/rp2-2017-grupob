package catalogo.gerenciadores;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
    @Override
    public void ordenar() {
        
    }

    @Override
    public boolean carregarArquivo(){
        
        final Logger logger = Logger.getLogger(GFotos.class.getName());
        FileHandler log = null;
        
        
        try {
            /* dizendo que existirá um arquivo para registros */
            log = new FileHandler("log.txt");
            logger.warning("Nome do arquivo não pode ser null.");
            
            InputStream nomeArquivo = new FileInputStream("nome_do_arquivo.txt");
            InputStreamReader reader = new InputStreamReader(nomeArquivo);
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            logger.info("Arquivo carregado com sucesso em: ");  
            log.close();
            return true;
            
        } catch (FileNotFoundException e) {
            Logger.getLogger(GFotos.class.getName()).log(Level.SEVERE, null, e);    
            System.out.println(e.getMessage());
        }catch(IOException | SecurityException ex){
            Logger.getLogger(GFotos.class.getName()).log(Level.SEVERE, null, ex);    
            System.out.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean salvarArquivo() {
        return true;
    }
    
    
        
}
