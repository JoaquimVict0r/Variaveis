import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double altura,pesoIdeal;

        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();
        pesoIdeal= ( (72.7 * altura) - 58);
        System.out.println("O peso ideal: "+pesoIdeal);





        sc.close();



    }
}
