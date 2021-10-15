import java.util.Scanner;
public class LuanaAssisSilva_22 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int f, r, posicao, limpo = 0, dias=0;
        System.out.println(" Informe o número de posições no comprimento da fita: ");
        f = teclado.nextInt();
        System.out.println(" Informe o número de gotas no início do experimento: ");
        r = teclado.nextInt();
        boolean reagenteF[] = new boolean[f];
        for (int i = 0; i < r; i++) {
            System.out.println("Informe a posição das gotas ordenadamente: ");
            posicao = teclado.nextInt();
            reagenteF[posicao - 1] = true;
        }
        while (limpo == 0) {
            int i = 0;
            while (i < reagenteF.length) {
                if (reagenteF[i]) {
                    if (i == 0) {
                        if (!reagenteF[i + 1]) {
                            reagenteF[i + 1] = true;
                            i++;
                        } else if (i == (reagenteF.length - 1)) {
                            if (!reagenteF[i - 1]) {
                                reagenteF[i - 1] = true;
                            }
                        }else {
                            if (!reagenteF[i - 1]) {
                                reagenteF[i - 1] = true;
                            }
                            if (!reagenteF[i + 1]) {
                                reagenteF[i + 1] = true;
                                i++;
                            }
                        }
                    }
                }
                i++;
            }
            for (boolean tem : reagenteF) {
                if (!tem) {
                    limpo = 0;
                    break;
                } else {
                    limpo = 1;
                }
            }
            dias++;
        }
        System.out.println(dias);
    }
}
