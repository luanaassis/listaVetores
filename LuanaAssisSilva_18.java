import java.util.Scanner;
public class LuanaAssisSilva_18 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double amostras[] = new double [20];
        double desvio[] = new double [20];
        double media  = 0, v=0,dv=0;
        for ( int i =0; i< amostras.length;  i++ ){
            System.out.println("Informe a quantidade de produto das amostras: ");
            amostras[i] = teclado.nextDouble();
            media+=amostras[i];
        }
        media = (media/ amostras.length);
        System.out.println("A média é "+media);
        for ( int i =0;i< amostras.length;  i++ ){
            desvio[i] = Math.pow((media-amostras[i]),2);
            v = v + desvio[i];
        }
        v = (v / amostras.length);
        dv = Math.sqrt(v);
        System.out.println("O desvio padrão é de "+dv);
        if (dv>395 || dv<385){
            System.out.println("O processo deve ser revisado.");
        } else {
            System.out.println("O processo não deve ser revisado.");
        }
    }
}
