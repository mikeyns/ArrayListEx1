import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
    public static void main(String[] args) {
        // Crie uma ArrayList com uma lista de números
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        // Exiba o conteúdo da ArrayList utilizando um Iterator
        System.out.println("Conteudo da ArrayList:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Remova todos os números pares
        Iterator<Integer> iterator2 = numeros.iterator();
        while (iterator2.hasNext()) {
            int num = iterator2.next();
            if (num % 2 == 0) {
                iterator2.remove();
            }
        }

        // Exiba o conteúdo da ArrayList após a remoção dos números pares
        System.out.println("\nConteudo da ArrayList após a remoção dos números pares:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}