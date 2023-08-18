import java.util.Scanner;
import java.util.Random;
import java.lang.*;

public class exer_aula_3 {
    public static void main (String[] args) {
        int numeros [];
        System.out.println("Qual o tamanho do vetor que pretende gerar?");
        Scanner myS = new Scanner(System.in); //instanciando o scanner
        int tamanho = myS.nextInt(); //lendo o tamanho do vetor
        numeros = new int [tamanho];
        Random rand = new Random(); // instanciando random pra gerar numeros randomicos
        int limiteMax = 103; //limite maximo do random 
        for (int i=0; i < numeros.length; i++) {//preenchendo o vetor randomicamente
            numeros[i] = rand.nextInt(limiteMax);
        }

        //criando copias do vetor, para que o original não seja modificado, existe provavelmente alguma solução mais simples, mas que eu desconheco
        int numerosBubble [];
        numerosBubble = new int [tamanho];
        System.arraycopy(numeros, 0, numerosBubble, 0, tamanho);
        int numerosQuick [];
        numerosQuick = new int [tamanho];
        System.arraycopy(numeros, 0, numerosQuick, 0, tamanho);
        int numerosMerge [];
        numerosMerge = new int [tamanho];
        System.arraycopy(numeros, 0, numerosMerge, 0, tamanho);


        System.out.println("Vetor gerado:");
        printaVetor(numeros); //printando o vetor gerado randomicamente
        System.out.print("\n");

        //chamando cada um dos merges
        System.out.println("Vetor ordenado pelo sistema Bubble Sort:");
        bolha(numerosBubble);
        System.out.print("\n");

        System.out.println("Vetor ordenado pelo sistema Quick Sort:");
        chamaQuick(numerosQuick);
        System.out.print("\n");

        System.out.println("Vetor ordenado pelo sistema Merge Sort:");
        chamaMerge(numerosMerge);

        System.exit(0);
    }

    public static void bolha (int numeros []) {
        //bubble sort
        final int n = numeros.length;
        int aux;
        long start = System.nanoTime(); //comeca a contagem do tempo em nanosegundos
        for (int i=0; i < n-1; i++) {
            for (int j=0; j < n-1-i; j++) {
                if (numeros[j] > numeros[j+1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        long end = System.nanoTime(); //finaliza a contagem do tempo em nanosegundos
        printaVetor(numeros);
        System.out.println("Bubble Sort levou " + (end - start) + " nanosegundos para ordenar a lista.");
    }

    public static void quick (int p, int q, int numeros []) {
        //quicksort
        int x; // vai ser o pivot
        if (p < q) {
            x = particao(p,q, numeros);
            quick(p, x-1, numeros);
            quick(x+1, q, numeros);
        }
    }

    public static int particao (int p, int q, int numeros [] ) {
        int j = p-1;
        int temp;
        int aux = numeros [q];
        for (int i=p; i<=q; i++) {
            if(numeros[i] <= aux) {
                j++;
                temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
            }
        }
        return j;
    }

    public static void chamaQuick (int numeros []) {
        //chama o quicksort, a funcao que printa e tbm faz a contagem do tempo
        long start = System.nanoTime(); //comeca a contagem do tempo em nanosegundos
        quick(0, numeros.length-1, numeros);
        long end = System.nanoTime(); //finaliza a contagem do tempo em nanosegundos
        printaVetor(numeros);
        System.out.println("Quick Sort levou " + (end - start) + " nanosegundos para ordenar a lista.");
    }

    public static void merge (int numeros [], int inicio, int meio, int fim) {
        //merge sort
        int n = fim - inicio + 1;
        int numerosB [] = new int[n];

        int i1 = inicio;
        int i2 = meio +1;
        int j = 0;

        while (i1 <= meio && i2 <= fim) {
            if (numeros[i1] < numeros[i2]) {
                numerosB[j] = numeros[i1];
                i1++;
            } 
            else {
                numerosB[j] = numeros[i2];
                i2++;
            }
            j = j+1;
        }

        while (i1 <= meio) {
            numerosB[j] = numeros[i1];
            i1 =i1 + 1;
            j = j +1;
        }

        while (i2 <= fim) {
            numerosB[j] = numeros[i2];
            i2 = i2 + 1;
            j = j +1;
        }

        for (j=0; j < n; j++) {
            numeros[inicio + j] = numerosB[j];
        }
    }

    public static void mergeSort (int numeros [], int inicio, int fim) {
        if (inicio == fim) {
            return;
        }
        int meio = (inicio + fim) /2;
        mergeSort(numeros, inicio, meio);
        mergeSort(numeros, meio +1, fim);
        merge(numeros, inicio, meio, fim);
    }

    public static void chamaMerge (int numeros []) {
        //chama o mergesort, a funcao que printa e tbm faz a contagem do tempo
        long start = System.nanoTime(); //comeca a contagem do tempo em nanosegundos
        mergeSort(numeros, 0, numeros.length -1);
        long end = System.nanoTime(); //finaliza a contagem do tempo em nanosegundos
        printaVetor(numeros);
        System.out.println("Merge Sort levou " + (end - start) + " nanosegundos para ordenar a lista.");
    }

    public static void printaVetor (int numeros []) {
        //for criado pra printar o vetor bonitinho
        for (int i=0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i != numeros.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
    }
}