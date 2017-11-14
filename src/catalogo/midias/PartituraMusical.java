package catalogo.midias;

public class PartituraMusical extends Midia {
	private String genero;
	private String autores;
	private String instrumentos;
	private int ano;

    public PartituraMusical(String genero, String autores, String instrumentos, int ano, String titulo, String descricao, String path) {
        super(titulo, descricao, path);
        this.genero = genero;
        this.autores = autores;
        this.instrumentos = instrumentos;
        this.ano = ano;
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

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(String instrumentos) {
        this.instrumentos = instrumentos;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
