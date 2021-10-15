import java.util.Scanner;
public class LuanaAssisSilva_21 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int pico = 0, baseM;
        System.out.println("Informe o tamanho da base da montanha: ");
        baseM = teclado.nextInt();
        int altM [] = new int[baseM];
        for(int i = 0; i< altM.length; i++){
            System.out.println(" Informe a altura da montanha no ponto :");
            altM[i]= teclado.nextInt();
        }
        for (int i = 1; i < altM.length; i++) {
            if (i != (altM.length) - 1) {
                if (altM[i - 1] < altM[i] && altM[i] > altM[i + 1]) {
                    pico++;
                }
            }
        }
        if( pico > 1){
            System.out.println(" S ");
        }
        else{
            System.out.println(" N ");
        }

    }
}
