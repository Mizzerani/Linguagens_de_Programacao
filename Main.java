import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void MH(String[] args){
        int portaVazia, portaPremiada, PortaEscolhida;
        try{
            do{
                Scanner scanner = new Scanner(System.in);
                System.out.println("----- Bem-vindo ao jogo Monty Hall! -----");
                System.out.println("Selecione uma porta, de 1 a 3");
                int portaEscolhida = scanner.nextInt();
                if(portaEscolhida < 1 || portaEscolhida > 3){
                    System.out.println("Valor inválido! Digite um valor apenas entre 1 e 3.");
                } else{
                    System.out.println("Ótimo! Você escolheu a porta: " + portaEscolhida);
                }
                portaPremiada = random.nextInt(3) + 1;

                System.out.println();


            }while(portaEscolhida );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}



















// Criar três portas: porta 1, porta 2 e porta 3.
//Usar a porta 3 como a vencedora e a porta 2 e 1 como as perdedoras.
// posso selecionar uma porta pré ganhadora e duas perdedoras.
// usar classe random, classe scanner.
// usar do/while e if/else.