package TarefaColecoes;

/**
 * @author felipe.espinoza
 * @version 1.0
 */

import java.util.*;

public class ListaOrdenada {

    private static List<String> listaNomes = new LinkedList<>();

    public static void main(String[] args){
        recebeNomes();
        ordenaNomesLista();
    }

    private static void recebeNomes() {
        Scanner valorInserido = new Scanner(System.in);

        System.out.println("Digite 4 nomes separados por vírgula sem uso de espaço:");
        String nomesInseridos = valorInserido.next();

        String[] nomesArray = nomesInseridos.split(",");

        for (String nome : nomesArray){
            listaNomes.add(nome.trim());
        }
    }
    private static void ordenaNomesLista(){
        Collections.sort(listaNomes);
        for (String nome : listaNomes){
            System.out.println(nome);
        }
    }
}
