import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //altura muié

    Scanner sc = new Scanner(System.in);
    double Altura,PesoIdeal;

    System.out.println("Digite o altura da Muié: ");
    Altura = sc.nextDouble();
    PesoIdeal = ( (72.7 * Altura) - 58 );
    System.out.println(" O peso ideal é : " + PesoIdeal);



    }
}
