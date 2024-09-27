package TarefaColecoes;

/**
 * @author felipe.espinoza
 * @version 1.0
 */

import java.util.*;

public class ListaOrdenadaSexos {

    private static List<String> listaMasculino = new ArrayList<>();
    private static List<String> listaFeminino = new ArrayList<>();

    public static void main(String[] args) {
        recebeNomes();
        ordenaNomesPorGenero();
    }

    private static void recebeNomes() {
        Scanner valorInserido = new Scanner(System.in);

        System.out.println("Digite os nomes e gêneros separados por vírgula e dois pontos (Ex: Felipe:M, Beatriz:F):");
        String nomesInseridos = valorInserido.nextLine(); // Leitura de toda a linha

        String[] nomesArray = nomesInseridos.split(",");


        for (String nomeGenero : nomesArray) {
            if (!nomeGenero.isEmpty()) {
                String[] partes = nomeGenero.split(":");
                if (partes.length == 2) {
                    String nome = partes[0].trim();
                    String genero = partes[1].trim().toUpperCase();

                    if (genero.equals("M")) {
                        listaMasculino.add(nome);
                    } else if (genero.equals("F")) {
                        listaFeminino.add(nome);
                    } else {
                        System.out.println("Gênero inválido para o nome: " + nome);
                    }
                } else {
                    System.out.println("Formato inválido para: " + nomeGenero);
                }
            }
        }
    }


    private static void ordenaNomesPorGenero() {

        Collections.sort(listaMasculino);

        Collections.sort(listaFeminino);

        System.out.println("Nomes Masculinos ordenados:");
        for (String nome : listaMasculino) {
            System.out.println(nome + "\n");
        }

        System.out.println("Nomes Femininos ordenados:");
        for (String nome : listaFeminino) {
            System.out.println(nome + "\n");
        }
    }
}