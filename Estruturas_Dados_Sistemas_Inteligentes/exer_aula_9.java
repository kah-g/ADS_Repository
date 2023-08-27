import java.util.Scanner;

public class exer_aula_9 {
    //preciso terminar
    //trabalhando com filas
    //desenvolva um algoritmo que recebe do usuario 10 numeros inteiros para armazenar os numeros pares numa fila com capacidade de 10 elementos e mostre a fila 
    class Fila {
        int tamanho, inicio, fim, total;
        int vetor [];

        Fila (int tam) {
            inicio = 0;
            fim = 0;
            total = 0;
            tamanho = tam;
            vetor = new int[tam];
        }

        public boolean filaVazia () {
            if (total == 0) {
                return true;
            }
            else {
                return false;
            }
        }

        public boolean filaCheia () {
            if (total >= tamanho) {
                return true;
            }
            else {
                return false;
            }
        }

        public void enfileirar (int elemento, Fila fila1) {
            if (!filaCheia(fila1)) {
                vetor[fim] = elemento;
                fim = fim + 1;
                total = total + 1;
                if (fim >= tamanho) {
                    fim = 0;
                }
            }
            else {
                System.out.println("Fila Cheia.");
            }
        }

        public int desenfileirar () {
            int desenfileirado = 0;
            if (filaVazia()) {
                System.out.println("Fila Vazia.");
            }
            else {
                desenfileirado = vetor[inicio];
                inicio = inicio + 1;
                total = total - 1;
                if (inicio >= tamanho) {
                    inicio = 0;
                }
            }
            return desenfileirado;
        }

        public void elementoInicio () {
            if (!filaVazia()) {
                System.out.println("O primeiro elemento é: " + vetor[inicio]);
            }
            else {
                System.out.println("Fila Vazia.");
            }
        }

        public void mostrarFila () {
            int i, aux;
            aux = inicio;
            for (i = 1; i <= total; i++) {
                System.out.println("Elemento " + vetor[aux] + " na posicao " + i);
                aux = aux + 1;
                if (aux >= tamanho) {
                    aux = 0;
                }
            }
        }
    }

    public static void main (String [] args) {
        Scanner myS = new Scanner(System.in); //instanciando o scanner
        int num, i, aux;
        Fila fila1 = new Fila(10);
        for (i = 1; i  <= 10; i++) { //lendo os numeros para armazenar na fila
            System.out.println("Digite um numero.");
            num = myS.nextInt();
            aux = num;
            if (aux%2 == 0) {
                enfileirar(num, fila1);
            }
        }

        myS.close();
        System.exit(0);
    }
}
