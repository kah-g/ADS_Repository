import java.util.Scanner;

public class exer_aula_7 {
    //preciso terminar

    class Pilha {
        int tamanho;
        int topo;
        int vetor [];

        Pilha (int tam) {
            topo = -1;
            tamanho = tam;
            vetor = new int[tam];
        }

        public boolean pilhaVazia (Pilha nums) {
            if (nums.topo == -1) {
                return true;
            }
            else {
                return false;
            }
        }

        public boolean pilhaCheia (Pilha nums) {
            if (topo >= tamanho-1) {
                return true;
            }
            else {
                return false;
            }
        }

        public void empilhar (int elemento, Pilha nums) {
            if (! pilhaCheia(nums)) {
                topo = topo +1;
                vetor[topo] = elemento;
            }
            else {
                System.out.println("Pilha Cheia!");
            }
        }

        public int desempilhar (Pilha nums) {
            int desempilhado = 0;

            if (pilhaVazia(nums)) {
                System.out.println("Pilha Vazia!");
            }
            else {
                desempilhado = vetor[topo];
                topo = topo - 1;
                return desempilhado;
            }
        }

        public void elementoTopo (Pilha nums) {
            if (!pilhaVazia(nums)) {
                System.out.println(nums[topo]);
            }
            else {
                System.out.println("Pilha Vazia!");
            }
        }

        public void printaPilha (Pilha nums) {
            for (int i= 0; i < tamanho-1; i++) {
                System.out.println();
            }
        }
    }
    public static void main (String [] args) {
        System.out.println("Qual sera o tamanho da pilha?");
        Scanner myS = new Scanner(System.in); //instanciando o scanner
        int tam = myS.nextInt();
        Pilha pilha1 = new Pilha(tam);
        System.out.println("Vamos adicionar elementos a pilha.");
    }
}
