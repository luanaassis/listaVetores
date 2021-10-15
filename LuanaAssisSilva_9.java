import java.util.Scanner;
public class LuanaAssisSilva_9 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double menor=900, maior=0, media=0, mediaH=0, mediaM=0;
        int countH=0,countM=0;
        String alunos[] = new String[50];
        int sexo[] = new int[50];
        double altura [] = new double[50];
        for (int i=0; i< alunos.length;i++){
            System.out.println(" Informe o nome do aluno: ");
            alunos[i] = teclado.nextLine();
            System.out.println("Informe o sexo (1-Homem/2-Mulher): ");
            sexo[i]= teclado.nextInt();
            System.out.println(" Informe a altura do aluno: ");
            altura[i] = teclado.nextDouble();
            media+=altura[i];
            teclado.nextLine();
            if (sexo[i]!=1 && sexo[i]!=2){
                break;
            }
            if (altura[i]>maior){
                maior = altura[i];
            }
            if (altura[i]<menor){
                menor = altura[i];
            }
        }
        System.out.println(" A maior altura geral é  "+ maior);
        System.out.println(" O menor altura geral é  "+ menor);
        media = (media/50);
        for (int i=0; i< alunos.length;i++){
            if (altura[i]<media){
                System.out.println(alunos[i]+ " tem altura menor que a média geral. ");
            }
            if(sexo[i]==1){
                mediaH+=altura[i];
                countH++;
            }  else if (sexo[i]==2){
                mediaM+=altura[i];
                countM++;
            }
        }
        mediaH = (mediaH/countH);
        mediaM = (mediaM/countM);
        for (int i=0; i< alunos.length;i++){
            if (sexo[i]==1 && altura[i]<mediaM) {
                System.out.println(alunos[i]+" tem altura menor que a média feminina.");
            }
            else if (sexo[i]==2 && altura[i]>mediaH){
                System.out.println(alunos[i]+" tem altura maior que a média masculina.");
            }
        }
    }
}
