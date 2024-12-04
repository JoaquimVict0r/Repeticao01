import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double idade,tempoTrabalhado;

        System.out.println("Digite seu idade: ");
        idade = sc.nextDouble();
        System.out.println("Digite seu tempo de trabalho: ");
        tempoTrabalhado = sc.nextDouble();

        if (idade >= 65 && tempoTrabalhado >= 30 || idade <= 60 && tempoTrabalhado <= 25) {
            System.out.println("Poderá se aposentar");
        }

        else {
            System.out.println("Não poderá se aposentar");
        }



        sc.close();

    }
}
