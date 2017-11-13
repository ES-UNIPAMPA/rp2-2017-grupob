package catalogo.gerenciadores;

import catalogo.midias.Foto;
import catalogo.midias.Midia;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
        
        
        try {
            /* dizendo que existirá um arquivo para registros */
            log = new FileHandler("log.txt");
            logger.warning("Nome do arquivo não pode ser null.");
            
            InputStream nomeArquivo = new FileInputStream("C:\\Users\\" + System.getProperty("user.name") +"\\Desktop\\Gerenciadores\\"+path+".txt");
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
    public boolean salvarArquivo(String path, Midia midia) {
        Foto aux = (Foto) midia;
        if (aux != null) {
            
            try{
                //O arquivo será salvo na pasta Gerenciadores em Desktop
                OutputStream OS = new FileOutputStream("C:\\Users\\" + System.getProperty("user.name") +"\\Desktop\\Gerenciadores\\"+path+".txt");
                OutputStreamWriter OSW = new OutputStreamWriter(OS);
                BufferedWriter BW = new BufferedWriter(OSW);

                BW.write("Linha 1: " + "Nome do Arquivo : "+ aux.getPath());
                BW.write("Linha 2: " + "Titulo : "+ aux.getTitulo());
                BW.write("Linha 3: " + "Descrição : "+ aux.getDescricao());
                BW.write("Linha 4: " + "Fotografo : "+ aux.getFotografo());
                BW.write("Linha 5: " + "Pessoas : "+ aux.getPessoas());
                BW.write("Linha 6: " + "Local : "+ aux.getLocal());
                BW.write("Linha 7: " + "Data : "+ aux.getData());
                BW.write("Linha 8: " + "Hora : "+ aux.getLocal());
                BW.write("\n");

                BW.close();
                OSW.close();
                OS.close();
                return true;

            }catch(FileNotFoundException e){
                e.getStackTrace();
                return false;
            }catch(IOException ex){
                ex.getStackTrace();
                return false;
            }
        }else{
            System.out.println("Foto null!");
            return false;
        }
    }

    
        
}
