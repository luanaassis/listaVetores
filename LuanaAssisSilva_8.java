import java.util.Scanner;
public class LuanaAssisSilva_8 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetor3[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um valor para o vetor 1: ");
            vetor1[i] = teclado.nextInt();
            System.out.println("Informe um valor para o vetor 2: ");
            vetor2[i] = teclado.nextInt();
            if (vetor1[i] == vetor2[i]) {
                vetor3[i] = 1;
            } else {
                vetor3[i] = 0;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(vetor3[i] + ";");
        }
    }
}
