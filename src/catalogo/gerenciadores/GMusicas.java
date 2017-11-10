package catalogo.gerenciadores;

import catalogo.midias.Midia;
import catalogo.midias.Musica;
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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GMusicas extends GerenciadorDeMidias {
    private List<Midia> midias;

    public GMusicas() {
        super();
        midias = new ArrayList<>();
    }
    
    //COMORTAMENTOS E MÉTODOS
    @Override
    public void ordenar() {
        
    }

    @Override
    public boolean carregarArquivo(String path) {
        final Logger logger = Logger.getLogger(GMusicas.class.getName());
        FileHandler log = null;
        
        try {
            /* dizendo que existirá um arquivo para registros */
            log = new FileHandler("logGmusicas.txt");
            logger.warning("Nome do arquivo não pode ser null.");
            
            InputStream nomeArquivo = new FileInputStream("C:\\Users\\"+ System.getProperty("user.name") +"\\Desktop\\Gerenciadores\\"+path+".txt");
            InputStreamReader reader = new InputStreamReader(nomeArquivo);
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            logger.info("Arquivo carregado com sucesso!");  
            log.close();
            return true;
            
        } catch (FileNotFoundException e) {
            Logger.getLogger(GMusicas.class.getName()).log(Level.SEVERE, null, e);    
            System.out.println(e.getMessage());
        }catch(IOException | SecurityException ex){
            Logger.getLogger(GMusicas.class.getName()).log(Level.SEVERE, null, ex);    
            System.out.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean salvarArquivo(String path, Midia midia) {
        Musica aux = (Musica) midia;
        if (aux != null) {
            try{
                //O arquivo será salvo na pasta Gerenciadores em Desktop
                FileOutputStream file = new FileOutputStream("C:\\Users\\" + System.getProperty("user.name") +"\\Desktop\\Gerenciadores\\"+path+".txt");
                PrintWriter pr = new PrintWriter(file);

                pr.println("Linha 1: " + "Nome do Arquivo: " + aux.getPath());
                pr.println("Linha 2: " + "Titulo : "+ aux.getTitulo());
                pr.println("Linha 3: " + "Descrição : "+ aux.getDescricao());
                pr.println("Linha 4: " + "Gênero : "+ aux.getGenero());
                pr.println("Linha 5: " + "Idioma : "+ aux.getIdioma());
                pr.println("Linha 6: " + "Autores : "+ aux.getAutores());
                pr.println("Linha 7: " + "Interpretes : "+ aux.getInterpretes());
                pr.println("Linha 8: " + "Duração : "+ aux.getDuracao());
                pr.println("Linha 9: " + "Ano : "+ aux.getAno());
                pr.println("\n");

                pr.close();
                file.close(); 
                return true;

            }catch(FileNotFoundException e){
                e.getStackTrace();
                return false;
            }catch(IOException ex){
                ex.getStackTrace();
                return false;
            }catch(Exception exx){
                exx.getStackTrace();
                return false;
            }
        }else{
            System.out.println("Musica null");
            return false;
        }
    }



}
