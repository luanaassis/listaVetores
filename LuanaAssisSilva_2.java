import java.util.Scanner;
public class LuanaAssisSilva_2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int VetorOriginal[] = new int [10];
        int VetorInvertido[] = new int [10];
        int j=0;
        for(int i = 0; i<10; i++){
            System.out.println("Informe um número : ");
            VetorOriginal[i] = teclado.nextInt();
        }
        for(int i=9; i>=0 ; i--){
            VetorInvertido[j] =VetorOriginal[i] ;
            System.out.println(VetorInvertido[j]);
            j++;
        }
    }
}
