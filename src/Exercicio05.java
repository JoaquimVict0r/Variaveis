import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double NumeroConta,Saldo,Debito,Credito,SaldoAtual;
        SaldoAtual = 0;


        System.out.println("Digite o número da Conta: ");
        NumeroConta = sc.nextDouble();
        System.out.println("Digite o saldo da Conta: ");
        Saldo = sc.nextDouble();
        System.out.println("Digite o debito da Conta: ");
        Debito = sc.nextDouble();
        System.out.println("Digite o credito da Conta: ");
        Credito = sc.nextDouble();

        SaldoAtual = (Saldo - Debito) + Credito;
        System.out.println("Seu saldo é " + SaldoAtual);




        sc.close();




    }
}
