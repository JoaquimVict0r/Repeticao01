import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double idade,valor;
        valor=0;

        System.out.println("Digite sua idade: ");
        idade = sc.nextDouble();

        if (idade <= 10) {
            valor= 30.0;
        }

        else if (idade >10 && idade <= 29) {
            valor= 60.00;
        }

        else if (idade > 29 && idade <= 45) {
            valor= 120.00;
        }

        else if (idade > 45 && idade <= 59) {
            valor= 150.00;
        }
        else if (idade > 59) {
            valor= 300.00;
        }

        System.out.println("Sua idade é " + idade + "seu valor pego será" + valor );

        sc.close();

    }
}
