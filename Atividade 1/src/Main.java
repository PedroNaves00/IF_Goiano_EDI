import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Random generator = new Random();
        int[] array = new int[1000];

        // Gerando os números aleatórios
        for (int i = 0; i < 1000; i++) {
            int num = generator.nextInt(-9999, 9999);
            array[i] = num;
        }
        // Mostrando o array desordenado
        System.out.println("Vetor: "+Arrays.toString(array));

        // Ordenando a lista duplamente encadeada em ordem cresente
        for (int i = 0; i < array.length; i++) {
            insertInOrder(list, array[i]);
        }

        System.out.println("Lista em ordem crescente: "+list);

        // Revertendo a lista
        reverse(list);
        System.out.println("Lista em ordem decresente: "+list);

        // Removendo números primos
        removePrimeNumbers(list);
        System.out.println("Lista sem números primos: "+list);
    }

       //Método para inserir os valores ordenados na lista
    private static void insertInOrder(LinkedList<Integer> list, int value) {
        int index = 0;
        while (index < list.size() && value >= list.get(index)) {
            index++;
        }
        list.add(index, value);
    }

    public static void reverse(LinkedList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            Integer temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
        public static void removePrimeNumbers(LinkedList<Integer> list) {
            for (int i = 0; i < list.size(); i++) {
                if (isPrimo(list.get(i))){
                    list.remove(i);
                }
            }
        }

        private static boolean isPrimo(int numero) {
            for (int i = 2; i < numero; i++) {
                if (numero > 0 && numero % i == 0) {
                    return false;
                }
            }
            return true;
    }
}


