package catalogo.gerenciadores;

import catalogo.midias.Filme;
import catalogo.midias.Midia;
import catalogo.midias.Podcast;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GPodcasts extends GerenciadorDeMidias {

    private final static GPodcasts ME = new GPodcasts(new ArrayList<>());

    private GPodcasts(List<Podcast> midias) {
        super(midias);
    }

    public static GPodcasts getInstance() {
        return ME;
    }

    @Override
    public void ordenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean carregarArquivo(String path) {
        FileInputStream inFile;
        BufferedReader buff;
        Midia midia;
        int numeroDeMidias;
        try {
            inFile = new FileInputStream(new File(path));
            buff = new BufferedReader(new InputStreamReader(inFile, "UTF-8"));
            numeroDeMidias = Integer.parseInt(buff.readLine());
            for (int i = 0; i < numeroDeMidias; i++) {
                String titulo = buff.readLine();
                String pathDaMidia = buff.readLine();
                String descricao = buff.readLine();
                String idioma = buff.readLine();
                String autores = buff.readLine();
                int ano;
                try {
                    ano = Integer.parseInt(buff.readLine());
                } catch (NumberFormatException e) {
                    ano = 0;
                }
                midia = new Podcast(idioma, autores, ano, titulo, descricao, path);
                getMidias().add(midia);
                buff.readLine();
            }
            buff.close();
            inFile.close();
            return true;

        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException ex) {
            return false;
        }

    }

}
