package catalogo.midias;

import catalogo.Pessoa;
import java.util.ArrayList;


public class AudioLivro extends Midia {
	private String genero;
	private String idioma;
	private ArrayList <Pessoa> autores;
	private String local;
	private String editora;
	private double duracao;
	private int ano;

    public AudioLivro(String genero, String idioma, ArrayList<Pessoa> autores, String local, String editora, double duracao, int ano, String titulo, String descricao, String path) {
        super(titulo, descricao, path);
        this.genero = genero;
        this.idioma = idioma;
        this.autores = autores;
        this.local = local;
        this.editora = editora;
        this.duracao = duracao;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "AudioLivro{" + "genero=" + genero + ", idioma=" + idioma + ", autores=" + autores.toString() + ", local=" + local + ", editora=" + editora + ", duracao=" + duracao + ", ano=" + ano + '}';
    }
            
        
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void addAutor(Pessoa autor) {
        autores.add(autor);
    }
    public ArrayList<Pessoa> getAutor(){
            return autores;
        
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
