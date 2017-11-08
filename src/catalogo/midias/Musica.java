package catalogo.midias;

public class Musica extends Midia {
    //ATRIBUTOS
    private String genero;
    private String idioma;
    private String autores;
    private String interpretes;
    private int duracao;
    private int ano;

    public Musica(String titulo, String descricao, String path, String genero, String idioma, String autores, String interpretes, int duracao, int ano) {
        super(titulo, descricao,path);
        this.genero = genero;
        this.idioma = idioma;
        this.autores = autores;
        this.interpretes = interpretes;
        this.duracao = duracao;
        this.ano = ano;
    }
    
    //COMPORTAMENTOS E MÉTODOS

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

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(String interpretes) {
        this.interpretes = interpretes;
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
    
    

}
