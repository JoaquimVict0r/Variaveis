import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int InicioJogo,FimJogo,TempoJogo;
        TempoJogo = 0;

        System.out.println("Digite o horário de inicio do seu jogo");
        InicioJogo = sc.nextInt();
        System.out.println("Digite o horário do final do seu jogo");
        FimJogo = sc.nextInt();

            if (InicioJogo >= FimJogo){
                TempoJogo = (24 - InicioJogo) + FimJogo;
            }

            else {
                TempoJogo = (InicioJogo - FimJogo);
                TempoJogo = Math.abs(TempoJogo);

            }


                System.out.println("Seu tempo de jogo foi : " + TempoJogo);




        sc.close();



    }
}
