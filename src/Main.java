import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Venda do mês 1: ");
        double mes_1 = leitor.nextDouble();

        System.out.println("Venda do mês 2: ");
        double mes_2 = leitor.nextDouble();

        System.out.println("Venda do mês 3: ");
        double mes_3 = leitor.nextDouble();

        System.out.println("Qual é o tempo de reposição: ");
        double TR = leitor.nextDouble();

        System.out.println("LR");
        double LR = leitor.nextDouble();

        System.out.println("VR");
        double VR = leitor.nextDouble();



        //Cálculo VMD;
        double vmd = ((mes_1 + mes_2 + mes_3) /3)/25;
        double emin = (TR * vmd);
        double emax = (LR * emin);
        System.out.println("\n Venda média: " +vmd);
        System.out.println("\n Estoque minimo: " +emin);
        System.out.println("\n Estpque maximo: " +emax);
    }
}