package catalogo.midias;

public abstract class Midia {

    private String titulo;
    private String descricao;
    private String path;

    public Midia(String titulo, String descricao, String path) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.path = path;
    }
    /**
     * Metodo que retorna uma string para ser salva em um arquivo de texto
     * @return uma string com os dados da midia
     */
    public String toFile() {
        String retorno = "";
        retorno += titulo + "\r\n";
        retorno += path + "\r\n";
        retorno += descricao + "\r\n";
        return retorno;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\n  Descricao: " + descricao + "\n  Caminho: " + path;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}