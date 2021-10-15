import javax.swing.*;
import java.util.Scanner;

import static com.company.LuanaAssisSilva_20.contains;

public class LuanaAssisSilva_20 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int conta[] = new int[50];
        String nome[] = new String[50];
        double saldo[] = new double[50];
        int i = 0;
        String r = "S";
        while (r.equalsIgnoreCase("S")) {
            nome[i] = JOptionPane.showInputDialog(" Insira o nome do usuário : ");
            conta[i] = Integer.parseInt(JOptionPane.showInputDialog(" Cadastre o número de uma nova conta : "));
            saldo[i] = Double.parseDouble(JOptionPane.showInputDialog(" Insira o saldo da conta : "));
            i++;
            r = JOptionPane.showInputDialog("Deseja cadastrar mais uma senha? Para sim= S/s ");
        }
        String[] op = {"Efetuar depósito", "Efetuar saque", "Consultar saldo em conta", "Finalizar o programa"};
        int operacao = JOptionPane.showOptionDialog(null, " -Menu de Operações- ", "Clique no botão",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op, op[0]);
        if (operacao == 0) {
            int numConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta. "));
            if (contains(conta, numConta)) {
                double deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para depósito. "));
                for (int k = 0; k < i; k++) {
                    if (conta[k] == numConta) {
                        saldo[k] += deposito;
                        JOptionPane.showMessageDialog(null, "O novo saldo é de " + saldo[k]);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Conta não encontrada!");
            }
        } else if (operacao == 1) {
            int numConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta. "));
            if (contains(conta, numConta)) {
                double saque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para saque. "));
                for (int k = 0; k < i; k++) {
                    if (conta[k] == numConta) {
                        if (saldo[k] > saque) {
                            saldo[k] -= saque;
                            JOptionPane.showMessageDialog(null, "O novo saldo é de " + saldo[k]);
                        } else {
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Conta não encontrada!");
            }

        } else if (operacao == 2) {
            int numConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta. "));
            if (contains(conta, numConta)) {
                for (int k = 0; k < i; k++) {
                    if (conta[k] == numConta) {
                        JOptionPane.showMessageDialog(null, "O saldo é de " + saldo[k]);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Conta não encontrada!");
            }
        } else if (operacao == 3) {
            System.exit(0);
        } else{
            System.exit(0);
        }
    }
}

