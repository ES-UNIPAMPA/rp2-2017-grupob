package catalogo.midias;

import catalogo.InstrumentoMusical;
import catalogo.Pessoa;
import java.util.ArrayList;

public class PartituraMusical extends Midia {
	private String genero;
	private ArrayList <Pessoa> autores;
	private ArrayList <InstrumentoMusical> instrumentos;
	private int ano;

    public PartituraMusical(String genero, ArrayList<Pessoa> autores, ArrayList<InstrumentoMusical> instrumentos, int ano, String titulo, String descricao, String path) {
        super(titulo, descricao, path);
        this.genero = genero;
        this.autores = autores;
        this.instrumentos = instrumentos;
        this.ano = ano;
    }
    
    public void addInstrumento(InstrumentoMusical m){
        instrumentos.add(m);
    }
    
    public void addInstrumentoMusical(InstrumentoMusical m){
        instrumentos.add(m);
    }
    
    public void addAutor(Pessoa autor) {
        autores.add(autor);
    }
    
    public ArrayList<Pessoa> getAutor(){
            return autores;
        
    }
    @Override
    public String toString() {
        return "PartituraMusical{" + "genero=" + genero + ", autores=" + autores + ", instrumentos=" + instrumentos + ", ano=" + ano + '}';
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
