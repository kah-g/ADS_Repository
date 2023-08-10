import java.util.Scanner;

public class atividade_aula_2 {
    public static void main (String[] args) {
        //escreva um algoritmo que recebe 50 números reais em um vetor, para calcular e mostrar a média aritmética destes 50 números
        float vetMedia [];
        int i;
        float media = 0;
        float soma = 0;
        vetMedia =  new float [50];
        Scanner myS = new Scanner(System.in);
        for (i =0; i <= 49; i++) {
            System.out.println("Digite um numero");
            vetMedia[i] = myS.nextInt();
            soma = soma + vetMedia[i];
        }
        media = soma/50;
        System.out.println("A media das notas digitadas e: " + media);

        System.exit(0);
    }
    
}
