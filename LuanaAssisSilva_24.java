import java.util.Scanner;
public class LuanaAssisSilva_24 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int n, penalidade = 0, cpenalidade=0;
        System.out.println("Informe a quantidade de flechas lançadas: ");
        n = teclado.nextInt();
        int eixox[] = new int[n];
        int eixoy[] = new int[n];
        for (int i =0; i<n;i++){
            System.out.println("Informe a coordenada x ");
            eixox[i] = teclado.nextInt();
            System.out.println("Informe a coordenada y ");
            eixoy[i] = teclado.nextInt();
            if (i!= 0) {
                for (int j = (i - 1); j >= 0; j--) {
                    if (eixox[j] <= eixox[i] && eixoy[j] <= eixoy[i]) {
                        cpenalidade++;
                    }
                }
            }
            penalidade += cpenalidade;
            cpenalidade=0;
        }
        System.out.println(penalidade);
    }
}
