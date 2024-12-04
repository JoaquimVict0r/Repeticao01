import java.util.Scanner;

public class Casa02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double idade, maiores;
        maiores = 0;

        for (int i = 0 ; i <= 20 ; i++) {
            idade = sc.nextDouble();

            if (idade > 18) {
                maiores ++;

            }
        }

        System.out.println("Existem " + maiores + "pessoas maiores de idade.");


    }
}
