import java.util.Scanner;
public class LuanaAssisSilva_14 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double a[] = new double[10];
        double b[] = new double[10];
        double c[] = new double[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Informe um número para a : ");
            a[i] = teclado.nextDouble();
            System.out.println("Informe um número para b : ");
            b[i] = teclado.nextDouble();
            c[i] = a[i] + b[i];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+";");
        }
    }
}
