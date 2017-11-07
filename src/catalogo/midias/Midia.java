package catalogo.midias;

public class Midia {

    private String titulo;
    private String descricao;
    private String path;

    public Midia(String titulo, String descricao, String path) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.path = path;
    }

    
    @Override
    public String toString() {
            return null;
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
