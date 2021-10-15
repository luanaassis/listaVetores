import java.util.Arrays;
import java.util.Scanner;
public class LuanaAssisSilva_13 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número de elementos do conjunto A: ");
        int na = teclado.nextInt();
        System.out.println("Informe o número de elementos do conjunto B: ");
        int nb = teclado.nextInt();
        int a[] = new int[na];
        for (int i = 0; i <na; i++) {
            if (na > 100 ) {
                break;
            }
            System.out.println("Informe um valor para o conjunto A : ");
            a[i] = teclado.nextInt();
        }
        Arrays.sort(a);
        int b[] = new int[nb];
        for (int i = 0; i <nb; i++) {
            if (nb > 100) {
                break;
            }
            System.out.println("Informe um valor para o conjunto B : ");
            b[i] = teclado.nextInt();
        }
        Arrays.sort(b);
        int c[] = new int[na+nb];
        System.arraycopy(a, 0, c, 0, na);
        System.arraycopy(b, 0, c, na, nb);
        Arrays.sort(c);
        for (int i= 0; i<c.length;i++){
            System.out.print(c[i]+"; ");
        }
    }
}
