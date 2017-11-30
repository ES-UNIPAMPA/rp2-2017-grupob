package catalogo;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private static List<Pessoa> pessoasSalvas = new ArrayList<>();

    private Pessoa(String nome) {
        nome = "";
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    public static Pessoa getPessoa(String nome) {
        for (Pessoa pessoa : pessoasSalvas) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                return pessoa;
            }
        }
        Pessoa pessoaNova = new Pessoa(nome);
        pessoasSalvas.add(pessoaNova);
        return pessoaNova;
    }

    public static Pessoa[] getPessoas(String nomes) {
        String[] nomesArray = nomes.split(";");
        List<Pessoa> pessoas = new ArrayList<>();
        for (int i = 0; i < nomesArray.length; i++) {
            if (nomesArray[i].charAt(0) == ' ') {
                nomesArray[i].replaceFirst(" ", "");
            }

        }
        for (String nome : nomesArray) {
            boolean achou = false;
            for (Pessoa pessoa : pessoasSalvas) {
                if (pessoa.getNome().equalsIgnoreCase(nome)) {
                    pessoas.add(pessoa);
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                Pessoa pessoaNova = new Pessoa(nomes);
                pessoasSalvas.add(pessoaNova);
                pessoas.add(pessoaNova);
            }

        }
        Object[] array = pessoas.toArray();
        Pessoa[] retorno = new Pessoa[array.length];
        for (int i = 0; i < array.length; i++) {
            retorno[i]=(Pessoa) array[i];
        }
        return retorno;

    }
}
