import java.util.Arrays;
import java.util.Scanner;
public class LuanaAssisSilva_12 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double a[] = new double[10];
        double d[] = new double[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Informe um número: ");
            a[i] = teclado.nextDouble();
        }
        Arrays.sort(a);
        for (int j = 9, k=0; k < d.length; j--, k++){
            d[k] = a[j];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("O vetor crescente: "+ a[i]);
        }
        for (int i = 0; i < d.length; i++) {
            System.out.println("O vetor decrescente: "+ d[i]);
        }
    }
}
