import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n,x;

        System.out.println("Digite o número da tabuada");
        n = sc.nextInt();

        for (int i = 0 ; i < 51 ; i++ ) {
            x = n * i;
            System.out.println(n + " x " + i + " = " + x);
        }


        sc.close();
    }
}
