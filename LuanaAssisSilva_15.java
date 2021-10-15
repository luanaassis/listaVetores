import java.util.Scanner;
public class LuanaAssisSilva_15 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double a[] = new double[5];
        double somatorio = 0, produto = 1;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Informe um número: ");
            a[i] = teclado.nextDouble();
            somatorio += a[i];
            produto = produto * a[i];
        }
        System.out.println("O somatório é de " + somatorio);
        System.out.println("O produto é de " + produto);
    }
}
