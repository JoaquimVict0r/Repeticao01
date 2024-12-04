
public class Casa05 {
    public static void main(String[] args) {

        double crescimentoChico = 0.01;
        double crescimentoJuca= 0.03;
        double alturaChico = 1.50;
        double alturaJuca = 1.10;
        int anos = 0;

        while (alturaJuca <= alturaChico) {
        alturaJuca += crescimentoJuca;
        alturaChico += crescimentoChico;
        anos ++;

        }

        System.out.println("Chico Science será maior em " + anos + " anos ");


    }
}
