package catalogo.midias;

public class Podcast extends Midia {

    private String idioma;

    private String autores;

    private int ano;

    public Podcast(String idioma, String autores, int ano, String titulo, String descricao, String path) {
        super(titulo, descricao, path);
        this.idioma = idioma;
        this.autores = autores;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return super.toString() + ", idioma=" + idioma + ", autores=" + autores + ", ano=" + ano;
    }



    /**
     * @return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * @return the autores
     */
    public String getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(String autores) {
        this.autores = autores;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toFile() {
        String retorno=super.toFile();
        retorno+=idioma+"\n";
        retorno+=autores+"\n";
        retorno+=ano+"\n";
        return retorno;
    }

}