//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double media = 0;

        /* sempre declarar as variáveis
        double unidade1 = 0;
        double unidade2 = 0

         */

        System.out.println("Digite a nota 1" );
        double unidade1 = sc.nextDouble();
        System.out.println("Digite a nota 2" );
        double unidade2 = sc.nextDouble();
        media = (unidade1 + unidade2)/2;
        System.out.println("A media do aluno é : " + media);

        if (media >= 6) {
            System.out.println("Aprovado");

        }

        else {
            System.out.println("Reprovado");
        }

        //resultado >= 6 ? "Aprovado" : "Reprovado"

        sc.close();

    }
}