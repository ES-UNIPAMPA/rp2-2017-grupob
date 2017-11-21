package catalogo.gerenciadores;

import catalogo.midias.Foto;
import catalogo.midias.Midia;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
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
    public boolean carregarArquivo(String path){
        
        final Logger logger = Logger.getLogger(GFotos.class.getName());
        FileHandler log = null;
        String pathMidia = null, titulo = null, descricao = null,fotografo = null, 
               pessoas = null, local = null, data = null, hora = null;
        Midia midia = null;
        
        
        try {
            /* dizendo que existirá um arquivo para registros */
            log = new FileHandler("log.txt");
            logger.warning("Nome do arquivo não pode ser null.");
            
            File file = new File(path);
            FileReader reader = new FileReader(file);
            BufferedReader buffered = new BufferedReader(reader);
            
            while((titulo = buffered.readLine()) != null){
                descricao = buffered.readLine();
                pathMidia = buffered.readLine();
                fotografo = buffered.readLine();
                pessoas   = buffered.readLine();
                local     = buffered.readLine();
                data      = buffered.readLine();
                hora      = buffered.readLine();
                
                //Inserindo midia do arquivo na coleção do software
                midia = new Foto(titulo, descricao, pathMidia, fotografo, pessoas, local, data, hora);

                super.cadastrar(midia);
                
                buffered.readLine();
            }
            
            logger.info("Arquivo carregado com sucesso em.");  
            log.close();
            return true;
            
        } catch (FileNotFoundException e) {
            Logger.getLogger(GFotos.class.getName()).log(Level.SEVERE, null, e);    
            return false;
        }catch(IOException | SecurityException ex){
            Logger.getLogger(GFotos.class.getName()).log(Level.SEVERE, null, ex);    
            return false;
        }
    }

}
