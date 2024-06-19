import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        // Parte 1
        // Criando uma ArrayList de Strings chamada estudantes
        ArrayList<String> estudantes = new ArrayList<>();

        // Adicionando quatro estudantes à ArrayList
        estudantes.add("Amy");
        estudantes.add("Bob");
        estudantes.add("Cindy");
        estudantes.add("David");

        // Imprimindo os elementos na ArrayList e exibindo seu tamanho
        System.out.println("Parte 1:");
        for (String estudante : estudantes) {
            System.out.println(estudante);
        }
        System.out.println("Tamanho da lista: " + estudantes.size());

        // Parte 2
        // Adicionando mais dois estudantes no índice 0 e 1
        estudantes.add(0, "Nick");
        estudantes.add(1, "Mike");

        // Removendo o estudante no índice 3
        estudantes.remove(3);

        // Imprimindo os elementos na ArrayList e exibindo seu tamanho
        System.out.println("\nParte 2:");
        for (String estudante : estudantes) {
            System.out.println(estudante);
        }
        System.out.println("Tamanho da lista: " + estudantes.size());
    }
}