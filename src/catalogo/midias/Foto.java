package catalogo.midias;

public class Foto extends Midia{

    private String fotografo;
    private String pessoas;
    private String local;
    private String data;
    private String hora;

    public Foto(String titulo, String descricao, String path, String fotografo, String pessoas, String local, String data, String hora) {
        super(titulo, descricao,path);
        this.fotografo = fotografo;
        this.pessoas = pessoas;
        this.local = local;
        this.data = data;
        this.hora = hora;
    }
    
    //COMPORTAMENTOS E MÉTODOS
    public String getFotografo() {
        return fotografo;
    }

    public void setFotografo(String fotografo) {
        this.fotografo = fotografo;
    }

    public String getPessoas() {
        return pessoas;
    }

    public void setPessoas(String pessoas) {
        this.pessoas = pessoas;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return super.toString() + "Foto{" + "fotografo=" + fotografo + ", pessoas=" + pessoas + ", local=" + local + ", data=" + data + ", hora=" + hora + '}';
    }    

}
