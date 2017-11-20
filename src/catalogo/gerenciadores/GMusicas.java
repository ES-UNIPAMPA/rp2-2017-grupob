package catalogo.gerenciadores;

import catalogo.midias.Midia;
import catalogo.midias.Musica;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GMusicas extends GerenciadorDeMidias {

    public GMusicas(List midia) {
        super(midia);
    }
    
    //COMORTAMENTOS E MÉTODOS
    @Override
    public void ordenar() {
        
    }

    @Override
    public boolean carregarArquivo(String path) {
        final Logger logger = Logger.getLogger(GMusicas.class.getName());
        FileHandler log = null;
        String pathMidia = null, titulo = null, descricao = null, genero = null, 
               idioma = null, autores = null, interpretes = null;
        int duracao = 0, ano = 0;
        
        try {
            /* dizendo que existirá um arquivo para registros */
            log = new FileHandler("logGmusicas.txt");
            logger.warning("Nome do arquivo não pode ser null.");
            
            File file = new File(path);
            FileReader reader = new FileReader(file);
            BufferedReader buffered = new BufferedReader(reader);
            
            pathMidia = buffered.readLine();
            
            while(pathMidia != null){
                titulo    = buffered.readLine();
                descricao = buffered.readLine();
                genero = buffered.readLine();
                idioma   = buffered.readLine();
                autores     = buffered.readLine();
                interpretes      = buffered.readLine();
                duracao      = buffered.read();
                ano = buffered.read();
                
                //Inserindo midia do arquivo na coleção do software
                Midia midia = new Musica(titulo, descricao, path, genero, idioma, autores, interpretes, duracao, ano);

                super.cadastrar(midia);
                
                buffered.readLine();
                pathMidia = buffered.readLine();
                
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

    @Override
    public boolean salvarArquivo(String path) {
        try{
            //
            OutputStream file = new FileOutputStream(path);
            OutputStreamWriter fileWriter = new OutputStreamWriter(file, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for(Object midias : super.getMidias()){
               bufferedWriter.write(midias.toString());
               bufferedWriter.write("\r\n");
            }

            bufferedWriter.close();
            fileWriter.close();
            file.close();
            return true;

        }catch(FileNotFoundException e){
            return false;
        }catch(IOException ex){
            return false;
        }catch(Exception exx){
            return false;
        }
    }



}
