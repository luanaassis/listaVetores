import java.util.Scanner;
public class LuanaAssisSilva_6 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int countP = 0, countIN = 0;
        String p1 = "", p2 = "";
        System.out.println("Informe a quantidade de números: ");
        int n = teclado.nextInt();
        if (n <= 100) {
            int vetor[] = new int[n];
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Informe um número inteiro: ");
                vetor[i] = teclado.nextInt();
            }
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] > 0 && vetor[i] % 2 == 0) {
                    countP++;
                } else {
                    countIN++;
                }
            }
            int vetPar[] = new int[countP];
            int vetIN[] = new int[countIN];
            countP = 0;
            countIN = 0;
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] > 0 && vetor[i] % 2 == 0) {
                    vetPar[countP] = vetor[i];
                    p1 += vetPar[countP] + ";";
                    countP++;
                } else {
                    vetIN[countIN] = vetor[i];
                    p2 += vetIN[countIN] + ";";
                    countIN++;
                }
            }
            System.out.println("Conjunto 1 : " + p1);
            System.out.println("Conjunto 2 : " + p2);
        }
    }
}
