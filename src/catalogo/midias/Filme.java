package catalogo.midias;


public class Filme extends Midia {

    private String genero;
    private String idioma;
    private String diretor;
    private String atoresPrincipais;
    private int ano;

    public Filme(String genero, String idioma, String diretor, String atoresPrincipais, int ano, String titulo, String descricao, String path) {
        super(titulo, descricao, path);
        this.genero = genero;
        this.idioma = idioma;
        this.diretor = diretor;
        this.atoresPrincipais = atoresPrincipais;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Genero: " + genero + "\n  Idioma: " + idioma + "\n  Diretor: " + diretor + "\n  AtoresPrincipais: " + atoresPrincipais + "\n  Ano: " + ano +"\n";
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
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
     * @return the diretor
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * @param diretor the diretor to set
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    /**
     * @return the atoresPrincipais
     */
    public String getAtoresPrincipais() {
        return atoresPrincipais;
    }

    /**
     * @param atoresPrincipais the atoresPrincipais to set
     */
    public void setAtoresPrincipais(String atoresPrincipais) {
        this.atoresPrincipais = atoresPrincipais;
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
        String retorno = super.toFile();
        retorno += genero + "\r\n";
        retorno += idioma + "\r\n";
        retorno += atoresPrincipais + "\r\n";
        retorno += diretor + "\r\n";
        retorno += ano + "\r\n";
        return retorno;
    }
    
    

}