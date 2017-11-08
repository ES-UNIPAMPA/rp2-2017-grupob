package catalogo.midias;

import java.util.Calendar;

public class Foto extends Midia{

    private String fotografo;
    private String pessoas;
    private String local;
    private Calendar data;
    private Calendar hora;

    public Foto(String titulo, String descricao, String path, String fotografo, String pessoas, String local, Calendar data, Calendar hora) {
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

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Calendar getHora() {
        return hora;
    }

    public void setHora(Calendar hora) {
        this.hora = hora;
    }
        
        

}
