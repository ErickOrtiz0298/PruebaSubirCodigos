
import java.util.Scanner;
public class numeroPrimo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //numero primos
        int limite;
        System.out.println("Ingresa un numero");
        limite = leer.nextInt();

        for (int i = 1; i < limite; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if ((i % j) == 0) {
                    count++;
                }

            }
            if (count == 2) {
                System.out.println(i);
            }

        }

    }
    }
}
