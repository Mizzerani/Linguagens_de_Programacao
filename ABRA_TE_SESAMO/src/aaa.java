import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class aaa{
    public static void main(String[] args) {
       menu();

    }

    public static void menu() {
        System.out.printf("Menu");
        ArrayList<Main> agendaPessoas = new ArrayList<Main>();
        int opcao = 1;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("---------- Lista de Cadastro ----------");
            System.out.println("1: Cadastrar pessoa na agenda.");
            System.out.println("2: Lista de pessoas na agenda.");
            System.out.println("0: Sair.");
            System.out.println("---------------------------------------");
            System.out.println("Digite a opção desejada:");
            opcao = in.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Opção 1 escolhida.");
                    cadastro(agendaPessoas);
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida.");
                    lista(agendaPessoas);
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Favor digitar uma opção entre 0 e 3.");
            }
        }while(opcao != 0);
    }
    private static void cadastro(ArrayList<Main> agendaPessoas){
        Scanner scn = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = scn.nextLine();
        System.out.println("Endereço: ");
        String endereco = scn.nextLine();
        System.out.println("Telefone: ");
        String telefone = scn.nextLine();
        Main m = new Main(nome, endereco, telefone);
        agendaPessoas.add(m);
    }
    private static void lista(ArrayList<Main> agendaPessoas){
        System.out.println(agendaPessoas.toString());

    }
}

