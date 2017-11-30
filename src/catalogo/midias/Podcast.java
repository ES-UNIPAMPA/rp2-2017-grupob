package catalogo.midias;

import catalogo.Pessoa;

public class Podcast extends Midia {

    private String idioma;

    private Pessoa[] autores;

    private int ano;

    public Podcast(String idioma, Pessoa[] autores, int ano, String titulo, String descricao, String path) {
        super(titulo, descricao, path);
        this.idioma = idioma;
        this.autores = autores;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Idioma=" + idioma + "\n  Autores=" + autores + "\n  Ano=" + ano+"\n";
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
    public Pessoa[] getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(Pessoa[] autores) {
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
        retorno+=idioma+"\r\n";
        retorno+=autores+"\r\n";
        retorno+=ano+"\r\n";
        return retorno;
    }

}