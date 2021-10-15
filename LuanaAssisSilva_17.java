public class LuanaAssisSilva_17 {
    public static void main(String args[]) {
        int primos[] = new int[100];
        int numero = 2, i = 0;
        while (i <= 99) {
            if (numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 || numero % 7 == 0) {
                if (numero == 2 || numero == 3 || numero == 5 || numero == 7) {
                    primos[i] = numero;
                    numero++;
                    i++;
                } else {
                    numero++;
                }
            } else {
                primos[i] = numero;
                numero++;
                i++;
            }
        }
        for (int j = 0; j < primos.length; j++) {
            System.out.print(primos[j] + ";");
        }
    }
}
