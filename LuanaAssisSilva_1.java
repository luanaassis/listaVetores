import java.util.Scanner;
public class LuanaAssisSilva_1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0, media = 0,  menorq16 =0 , maior=0, menor=100;
        String maioralu="", menoralu="";
        String alunos[] = new String[40];
        int idade [] = new int[40];
        for(int i = 0; i< alunos.length; i++){
            System.out.println("Informe o nome do aluno: ");
            alunos[i]  = teclado.nextLine();
            System.out.println("Informe a idade do aluno: ");
            idade[i] = teclado.nextInt();
            teclado.nextLine();
            soma += idade[i];
            if(idade[i]<=16){
                menorq16 ++;
            }
            if (idade[i]>maior){
                maioralu = alunos[i];
                maior = idade[i];
            }
            if (idade[i]<menor){
                menoralu = alunos[i];
                menor = idade[i];
            }
        }
        media = soma/ idade.length;
        for(int i = 0; i< alunos.length; i++){
            if (idade[i]>media){
                System.out.println(alunos[i]+", tem idade maior que a média.");
            }
        }
        System.out.println("A média das idades é  "+media);
        System.out.println(" Há "+menorq16+" alunos com idades menores ou igual a 16 anos.");
        System.out.println("Há "+(40-menorq16)+" alunos com idades maiores que 16 anos.");
        System.out.println(maioralu+" é o mais velho, com  "+maior+" anos.");
        System.out.println(menoralu+" é o mais novo, com  "+menor+" anos.");
    }
}
