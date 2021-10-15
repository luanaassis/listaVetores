import java.util.Scanner;
public class LuanaAssisSilva_11 {
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
        }
        for (int i = 0; i < c.length; i++) {
            if(i%2==0){
                c[i] = a[i];
            } else {
                c[i] = b[i];
            }
            System.out.print(c[i]+";");
        }
    }
}
