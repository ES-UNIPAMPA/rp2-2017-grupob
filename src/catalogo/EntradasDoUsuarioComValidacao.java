/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author mathias
 *
 */
public class EntradasDoUsuarioComValidacao {

    /**
     * metodo para receber um numero inteiro do usuario, ja validando-o para
     * saber se realmente é um numero inteiro.
     *
     * OBS: metodo reciclado do trabalho 1 de POO
     *
     * @param possivelPular TRUE para ser possivel deixar em branco e cancelar a
     * opção, FALSE para persistir até o usuario digitar um numero
     * @return um int com o numero do usuario. Caso o @param possivelPular seja
     * TRUE, e o usuario deixe em branco, retornara Integer.MIN_VALUE
     */
    public int nextInt(boolean possivelPular) {
        int numero = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                numero = Integer.parseInt(scanner.nextLine());
                if (numero < 0) {
                    System.out.println("Digite um numero maior que 0");
                }
            } catch (NumberFormatException e) {
                if (possivelPular) {
                    return Integer.MIN_VALUE;
                }
                System.out.println("Por favor, digite um numero inteiro");
            }
        } while (numero == -1);
        return numero;
    }

    /**
     * metodo para receber um numero de ponto flutuante do usuario, ja
     * validando-o para saber se realmente é um numero de ponto flutuante.
     *
     * OBS: metodo reciclado do trabalho 1 de POO
     *
     * @param possivelPular TRUE para ser possivel deixar em branco e cancelar a
     * opção, FALSE para persistir até o usuario digitar um numero
     * @return um double com o numero do usuario. Caso o @param possivelPular
     * seja TRUE, e o usuario deixe em branco, retornara Double.MIN_VALUE
     */
    public double nextDouble(boolean possivelPular) {

        double numero = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                numero = Double.parseDouble(scanner.nextLine());
                if (numero < 0) {
                    System.out.println("Digite um numero maior que 0");
                }
            } catch (NumberFormatException e) {
                if (possivelPular) {
                    return Double.MIN_VALUE;
                }
                System.out.println("Por favor, digite um numero (separador de casas decimais é um [.]");
            }
        } while (numero == -1);
        return numero;
    }

    /**
     * metodo para receber uma String do usuario
     *
     * OBS: metodo reciclado do trabalho 1 de POO
     *
     * @return uma String informada pelo usuario
     */
    public String nextString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     * metodo para receber uma data do usuario no formato [dd/mm/AAAA],
     * validando se a data existe e transformando a data em um calendar
     *
     * OBS: metodo reciclado do trabalho 1 de POO
     *
     * @param possivelPular TRUE para ser possivel deixar em branco e cancelar a
     * opção, FALSE para persistir até o usuario digitar uma data valida
     * @return um Calendar com a data informada pelo usuario, e, caso o usuario
     * não informe uma data e o @param possivelPular seja TRUE, retorna null
     */
    public Calendar nextData(boolean possivelPular) {
        Calendar c = null;

        do {
            String sValidade = nextString();
            Calendar tCalendar = Calendar.getInstance();
            try {
                String[] data = sValidade.split("/", 3);
                if (Integer.parseInt(data[1]) < 1 || Integer.parseInt(data[1]) > 12) {
                    System.out.println("O mes deve ser entre 0(Janeiro) e 12 (Dezembro)");
                } else if (Integer.parseInt(data[0]) < 1 || Integer.parseInt(data[0]) > 31) {
                    System.out.println("Digite um dia entre 1 e 31");
                } else {
                    tCalendar.set(Integer.parseInt(data[2]), Integer.parseInt(data[1]) - 1, Integer.parseInt(data[0]));
                    c = tCalendar;
                }
            } catch (NumberFormatException e) {
                if (possivelPular) {
                    return null;
                }
                System.out.println("Digite uma data dentro do formato dd/mm/AAAA");

            }
        } while (c == null);
        return c;
    }

}
