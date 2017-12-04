package catalogo.gerenciadores;

import catalogo.midias.Filme;
import catalogo.midias.Midia;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GFilmes extends GerenciadorDeMidias {

    private final static GFilmes ME = new GFilmes(new ArrayList<>());

    private GFilmes(List<Filme> midias) {
        super(midias);
    }

    public static GFilmes getInstance() {
        return ME;
    }

    @Override
    public void ordenar() {
        boolean houveTroca;
        do {
            List<Midia> lista = getMidias();
            houveTroca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i).getTitulo().compareTo(lista.get(i + 1).getTitulo())>0) {
                    Midia temp = lista.get(i);
                    lista.set(i, lista.get(i+1));
                    lista.set(i+1, temp);
                    houveTroca=true;
                }
            }
        } while (houveTroca);

    }

    @Override
    public boolean carregarArquivo(String path) {
        getMidias().clear();
        FileInputStream inFile;
        BufferedReader buff;
        Midia midia;
        int numeroDeMidias = 0;
        try {
            File f = new File(path);
            inFile = new FileInputStream(f);
            buff = new BufferedReader(new InputStreamReader(inFile, "UTF-8"));
            numeroDeMidias = Integer.parseInt(buff.readLine());

            for (int i = 0; i < numeroDeMidias; i++) {
                String titulo = buff.readLine();
                String pathDaMidia = buff.readLine();
                String descricao = buff.readLine();
                String genero = buff.readLine();
                String idioma = buff.readLine();
                String atoresPrincipais = buff.readLine();
                String diretor = buff.readLine();
                int ano;
                try {
                    ano = Integer.parseInt(buff.readLine());
                } catch (NumberFormatException e) {
                    ano = 0;
                }
                midia = new Filme(genero, idioma, diretor, atoresPrincipais, ano, titulo, descricao, pathDaMidia);
                getMidias().add(midia);
                buff.readLine();
            }
            buff.close();
            inFile.close();
            return true;
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException | NumberFormatException ex) {
            return false;
        }

    }

}
