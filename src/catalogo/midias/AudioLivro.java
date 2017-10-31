package catalogo.midias;


public class AudioLivro extends Midia {
	private int genero;
	private String idioma;
	private String autores;
	private String local;
	private String editora;
	private int duracao;
	private int ano;
	private Midia midia;

    public AudioLivro(int genero, String idioma, String autores, String local, String editora, int duracao, int ano, Midia midia) {
        this.genero = genero;
        this.idioma = idioma;
        this.autores = autores;
        this.local = local;
        this.editora = editora;
        this.duracao = duracao;
        this.ano = ano;
        this.midia = midia;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
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

    public int getDuracao() {
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

    public Midia getMidia() {
        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }

}
