package app;
import model.*;
import service.Helpdesk;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static PrioridadeChamdo escolherPrioridade(Scanner entrada){
        System.out.println("1-Baixa");
        System.out.println("2-Media");
        System.out.println("3-Alta");
        int opcao = entrada.nextInt();
        entrada.nextLine();
        if (opcao == 1) return  PrioridadeChamdo.BAIXA;
        if (opcao == 2) return  PrioridadeChamdo.MEDIA;
        if (opcao == 3) return  PrioridadeChamdo.ALTA;
        return null;
    }



    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Helpdesk hd = new Helpdesk();
        int opcao;
        do{
            System.out.println("---Sistema HelpDesk---");
            System.out.println("1-Cadastrar Cliente");
            System.out.println("2-Abrir chamado");
            System.out.println("3-Alterar status de um chamado");
            System.out.println("0-Sair");
            opcao = entrada.nextInt();
            switch (opcao){
                case 1 :{
                    System.out.println("nome:");
                    String nome = entrada.nextLine();
                    entrada.nextLine();
                    System.out.println("Email:");
                    String email = entrada.nextLine();
                    hd.cadastrarCliente(nome,email);
                    System.out.println("cliente cadastrado");
                    break;
                }
                case 2: {
                    System.out.println("numero chamado:");
                    Integer numero = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("titulo:");
                    String titulo = entrada.nextLine();
                    System.out.println("descricao:");
                    String descricao = entrada.nextLine();
                    System.out.println("prioridade:");

                    System.out.println("Email do cliente:");
                    String email = entrada.nextLine();
                    Cliente cli = hd.buscarCliente(email);
                    if (cli == null) {
                        System.out.println("Cliente nao encontrado");
                        break;
                    }
                    PrioridadeChamdo prio = escolherPrioridade(entrada);
                    hd.abrirChamado(numero, titulo, descricao, prio,cli);

                    break;

                }
                case 3:

            }
        }while (opcao !=0);

    }

}
