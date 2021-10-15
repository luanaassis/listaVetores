import java.util.Scanner;
public class LuanaAssisSilva_7 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int nota[] = new int[80];
        double count = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0, count10 = 0;
        for (int i = 0; i < nota.length; i++) {
            System.out.println("Informe uma nota: ");
            nota[i] = teclado.nextInt();
            if (nota[i] < 0 || nota[i] > 10) {
                break;
            }
            if (nota[i] == 0) {
                count++;
            } else if (nota[i] == 1) {
                count1++;
            } else if (nota[i] == 2) {
                count2++;
            } else if (nota[i] == 3) {
                count3++;
            } else if (nota[i] == 4) {
                count4++;
            } else if (nota[i] == 5) {
                count5++;
            } else if (nota[i] == 6) {
                count6++;
            } else if (nota[i] == 7) {
                count7++;
            } else if (nota[i] == 8) {
                count8++;
            } else if (nota[i] == 9) {
                count9++;
            } else if (nota[i] == 10) {
                count10++;
            }
        }
        double frequenciaR = (count / 80) * 100;
        double frequenciaR1 = (count1 / 80) * 100;
        double frequenciaR2 = (count2 / 80) * 100;
        double frequenciaR3 = (count3 / 80) * 100;
        double frequenciaR4 = (count4 / 80) * 100;
        double frequenciaR5 = (count5 / 80) * 100;
        double frequenciaR6 = (count6 / 80) * 100;
        double frequenciaR7 = (count7 / 80) * 100;
        double frequenciaR8 = (count8 / 80) * 100;
        double frequenciaR9 = (count9 / 80) * 100;
        double frequenciaR10 = (count10 / 80) * 100;
        System.out.println("Notas 0 : " + count + ", frequência relativa: " + frequenciaR + "%");
        System.out.println("Notas 1 : " + count1 + ", frequência relativa: " + frequenciaR1 + "%");
        System.out.println("Notas 2 : " + count2 + ", frequência relativa: " + frequenciaR2 + "%");
        System.out.println("Notas 3 : " + count3 + ", frequência relativa: " + frequenciaR3 + "%");
        System.out.println("Notas 4 : " + count4 + ", frequência relativa: " + frequenciaR4 + "%");
        System.out.println("Notas 5 : " + count5 + ", frequência relativa: " + frequenciaR5 + "%");
        System.out.println("Notas 6 : " + count6 + ", frequência relativa: " + frequenciaR6 + "%");
        System.out.println("Notas 7 : " + count7 + ", frequência relativa: " + frequenciaR7 + "%");
        System.out.println("Notas 8 : " + count8 + ", frequência relativa: " + frequenciaR8 + "%");
        System.out.println("Notas 9 : " + count9 + ", frequência relativa: " + frequenciaR9 + "%");
        System.out.println("Notas 10 : " + count10 + ", frequência relativa: " + frequenciaR10 + "%");
    }
}