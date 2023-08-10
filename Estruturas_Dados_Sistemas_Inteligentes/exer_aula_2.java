import java.util.Scanner;

public class exer_aula_2 {
    public static void main (String[] args) {
        //era pra somar 100 elementos dados por input, porem preguica
        //usando vetor
        System.out.println("Usando vetor:");
        int vetSoma [];
        int i;
        int somaV = 0;
        vetSoma =  new int [3];
        Scanner myS = new Scanner(System.in);
        for (i =0; i <= 2; i++) {
            System.out.println("Digite um numero");
            vetSoma[i] = myS.nextInt();
            somaV = somaV + vetSoma[i];
        }
        System.out.println("Vetor gerado: "); //for criado pra printar o vetor bonitinho
        for (i=0; i <= 2; i++) {
            System.out.print(vetSoma[i]);
            if (i == 0 || i == 1) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        System.out.println("A soma dos valores digitados e: " + somaV);
        System.out.print("\n");

        //usando matriz
        System.out.println("Usando matriz:");
        int matSoma [][];
        int k,l;
        int somaM = 0;
        matSoma = new int [2][2];
        for (k=0; k <= 1; k++) {
            for (l=0; l <= 1; l++) {
                System.out.println("Digite um numero");
                matSoma[k][l] = myS.nextInt();
                somaM = somaM + matSoma[k][l];
            }
        }
        System.out.println("Matriz gerada: ");
        for (k=0; k <= 1; k++) {
            for (l=0; l <= 1; l++) {
                System.out.print(matSoma[k][l]);
                if (l == 0) {
                    System.out.print(", ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("A soma dos valores digitados e: " + somaM);

        System.exit(0);
    }
}
