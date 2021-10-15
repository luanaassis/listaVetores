import java.util.Scanner;
public class LuanaAssisSilva_3 {
    public static void main(String[] args) {
        int num1 = 1, num2 = 0, aux;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número : ");
        int n = Integer.parseInt(teclado.nextLine());
        int fibonacci[] = new int [n];
        for(int i = 0; i < n; i++) {
            fibonacci[i] = num1;
            aux = num1;
            num1 = num1 + num2;
            num2 = aux;
            System.out.println(fibonacci[i]);
        }
    }
}