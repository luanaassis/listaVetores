import java.util.Scanner;
public class LuanaAssisSilva_23 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int cruzamento = 0;
        System.out.println(" Informe a quantidade de elementos:");
        int e = teclado.nextInt();
        int vertical [] = new int[e];
        int horizontal [] = new int[e];
        int ordem [] = new int[e];
        for( int i = 0 ; i< vertical.length;i++){
            System.out.println("Informe o número na posição "+(i+1)+" :");
            int num = teclado.nextInt();
            horizontal[i] = num;
            vertical[i] = (i+1);
        }
        for( int i = 0 ; i< vertical.length;i++){
            for (int j = 0; j < horizontal.length; j++){
                if (vertical[i] == horizontal[j]) {
                    ordem[i] = j;
                    for (int or : ordem) {
                        if (or > j) {
                            cruzamento += 1;
                        }
                    }
                }
            }
        }
        System.out.println("O número de cruzamentos foi: "+ cruzamento);
    }
}
