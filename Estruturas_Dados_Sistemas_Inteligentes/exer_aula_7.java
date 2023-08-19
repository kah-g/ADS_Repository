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
            if (nums.topo = -1) {
                return true;
            }
            else {
                return false;
            }
        }

        public boolean pilhaCheia () {
            if (topo >= tamanho-1) {
                return true;
            }
            else {
                return false;
            }
        }

        public void empilhar (int elemento) {
            if (! pilhaCheia()) {
                topo = topo +1;
                vetor[topo] = elemento;
            }
            else {
                System.out.println("Pilha Cheia!");
            }
        }

        public int desempilhar () {
            int desempilhado = 0;

            if (pilhaVazia()) {
                System.out.println("Pilha Vazia!");
            }
            else {
                desempilhado = vetor[topo];
                topo = topo - 1;
                return desempilhado;
            }
        }

        public void elementoTopo () {
            if (!pilhaVazia()) {
                System.out.println(pilha[topo]);
            }
            else {
                System.out.println("Pilha Vazia!");
            }
        }

        public void printaPilha () {
            for (int i= 0; i < tamanho-1; i++) {
                System.out.println();
            }
        }
    }
    public static void main (String [] args) {

    }
}
