import java.util.Scanner;
public class LuanaAssisSilva_16 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int fat = 1;
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Informe um número para a : ");
            a[i] = teclado.nextInt();
            if (a[i]==0){
                fat = 0;
            }
            for (int k = a[i]; k >= 1 ; k--) {
                fat *= k;
            }
            a[i] = fat;
            fat=1;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+";");
        }
    }
}