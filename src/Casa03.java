import java.util.Scanner;

public class Casa03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);

        String nomeMaisNova = "";
        int idadeMaisNova = Integer.MAX_VALUE;


        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();


            scanner.nextLine();


            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNova = nome;
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNova);

        scanner.close();
    }
}

