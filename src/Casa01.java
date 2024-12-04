import java.util.Scanner;

public class Casa01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n, maiores;
        maiores = 0;

        for (int i = 0 ; i <= 20 ; i++) {
            n= sc.nextDouble();

            if (n > 8) {
                maiores ++;

            }
        }

        System.out.println("Existem " + maiores + " números maiores que 8.");



        sc.close();

    }

}
