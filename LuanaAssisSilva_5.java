import java.util.Scanner;
public class LuanaAssisSilva_5 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String atleta[] = new String[20];
        double altura [] = new double[20];
        double  soma = 0, media =0;
        for(int i = 0; i< atleta.length; i++) {
            System.out.println("Informe o nome do atleta: ");
            atleta[i] = teclado.nextLine();
            System.out.println("Informe a idade do aluno: ");
            altura[i] = teclado.nextDouble();
            teclado.nextLine();
            soma += altura[i];
        }
        media = soma/ atleta.length;
        for(int i = 0; i< atleta.length; i++){
            if (altura[i]>= media){
                System.out.println(atleta[i]+", pode participar da competição. ");
            }
        }
    }
}