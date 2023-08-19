import java.util.Scanner;

public class exer_aula_4 {
    //talvez seria interessante comparar a performance das diferentes recursoes
    // em questao de velocidade e uso de memoria
    //fica ai uma ideia pro futuro
    public static void main (String [] args) {
        Scanner myS = new Scanner(System.in); //instanciando o scanner
        int num = 0;
        while (num <= 0) {
            //so aceita sair do while apos receber um numero positivo maior que zero
            System.out.println("Digite um numero positivo:");
            num = myS.nextInt();
        }
        int num2 = num;
        System.out.println("Resultado da fatorial com cauda e: " + fatC(num2));
        fatS(num, 1);

        System.exit(0);
    }

    public static int fatC (int num) {
        //calculando fatorial usando recursao com cauda
        if (num == 0) {
            return 1;
        }
        else {
            return num * fatC(num-1);
        }
    }

    public static void fatS (int num, int numF) {
        //calculando fatorial usando recursao sem cauda
        if (num > 1) {
            fatS(num-1, numF*num);
        }
        else {
            System.out.println("Resultado da fatorial com cauda e: " + numF);
        }
    }
}
