import java.util.Scanner;
public class LuanaAssisSilva_19 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int a[] = new int[10];
        int posicao = 0;
        boolean verifica = false;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Informe um número: ");
            a[i] = teclado.nextInt();
        }
        System.out.println("Informe um valor para conferir: ");
        int conf = teclado.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i]==conf){
                verifica = true;
                posicao = i;
            }
        }
        if(verifica){
            System.out.println("O valor "+conf+", está na posição "+posicao+" do vetor.");
        } else{
            System.out.println("O valor "+conf+", não está presente no vetor.");
        }
    }
}
