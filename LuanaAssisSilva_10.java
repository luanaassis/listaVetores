import java.util.Scanner;
public class LuanaAssisSilva_10 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double a[] = new double[10];
        double s=0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Informe um número: ");
            a[i] = teclado.nextDouble();
        }
        s = (Math.pow((a[0]-a[9]),2) + Math.pow((a[1]-a[8]),2)+ Math.pow((a[2]-a[7]),2) + Math.pow((a[3]-a[6]),2)+ Math.pow((a[4]-a[5]),2));
        System.out.println(s);
    }
}
